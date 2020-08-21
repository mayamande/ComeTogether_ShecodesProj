package com.example.cometogether;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    FrameLayout signup_frame = (FrameLayout) findViewById(R.id.signup_frame);
    FrameLayout login_frame = (FrameLayout) findViewById(R.id.login_frame);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void go_to_login(View v)
    {
        signup_frame.setVisibility(View.INVISIBLE);
        login_frame.setVisibility(View.VISIBLE);
    }

    public void go_to_signup(View v){
        signup_frame.setVisibility(View.VISIBLE);
        login_frame.setVisibility(View.INVISIBLE);
    }

    public void try_login_in(View v) {
        EditText  username = (EditText) findViewById(R.id.username_login);
        EditText password = (EditText) findViewById(R.id.password_login);
        User loged_in= new User(username.getText().toString(), password.getText().toString(),false);
        int userid=loged_in.check_username();
        if (userid==0){
            TextView error = (TextView) findViewById(R.id.error);
            error.setText("wrong username or password");
            return;
        }

        else {
                Intent home = new Intent(this, Home211.class);
                home.putExtra("userid", userid);
                startActivity(home);
            }

            }


    public void try_sign_up(View v) {
        EditText  username = (EditText) findViewById(R.id.username_signup);
        EditText password = (EditText) findViewById(R.id.password_signup);
        EditText email = (EditText) findViewById(R.id.email_signup);
        User user = new User(username.getText().toString(), password.getText().toString(), true);
        user.setEmail(email.getText().toString());
        int ok = user.new_user_ok();
        if (ok==1) {
            user.create_new_user();
            Intent sign_up = new Intent(this, signup122.class);
            sign_up.putExtra("userid", user.userid);
            sign_up.putExtra("new user", true);
            sign_up.putExtra("from ins", false);
            startActivity(sign_up);
        }
        if (ok ==2){
            TextView error = (TextView) findViewById(R.id.error);
            error.setText("username taken");
            return;
        }
        if (ok ==3){
            TextView error = (TextView) findViewById(R.id.error);
            error.setText("invalid email");
            return;
        }


    }


}