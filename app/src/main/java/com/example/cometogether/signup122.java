package com.example.cometogether;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class signup122 extends AppCompatActivity {
    Intent intent= getIntent();
    int userid= intent.getIntExtra("userid",0);
    boolean fromins = intent.getBooleanExtra("from ins", false);
    User user = new User(userid);
    String [] fields = {user.getEmail(),user.getYoutube(), user.getFacebook(), user.getAbout()};
    set_string(fields);

    if (fromins) {
       String [] fields={intent.getStringExtra("email"), intent.getStringExtra("youtube"), intent.getStringExtra("facebook"), intent.getStringExtra("about")};
       set_string(fields);
    }

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup122);
    }

    public void save_user(View v) {

    }

    public void new_instrument (View v) {


    }

    public EditText [] field_lst (){
        EditText email=(EditText) findViewById (R.id.email_signup);
        EditText youtube = (EditText) findViewById(R.id.youtube);
        EditText facebook = (EditText) findViewById(R.id.facebook);
        EditText about= (EditText) findViewById(R.id.about_yourself);
        EditText [] lst = {email,youtube,facebook,about};
        return lst;
    }

    public String [] get_fields() {
                EditText [] lst = field_lst();
                String [] fields= new String [4];
                for (int i=0; i<4; i++){
                    fields[i]=lst[i].getText().toString();
                }
                return fields;
    }

    public void set_string (String [] fields) {
        EditText [] lst= field_lst();
        for (int i=0; i<4; i++) {
            lst[i].setText(fields[i]);
        }

    }
}
