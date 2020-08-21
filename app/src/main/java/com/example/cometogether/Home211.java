package com.example.cometogether;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.nio.charset.MalformedInputException;

public class Home211  extends AppCompatActivity implements main_screen{
        Intent intent= getIntent();
        int userid=intent.getIntExtra("userid", 0);
        User user = new User(userid);
        MainScreen ms = new MainScreen(user);
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.home211);
        }

    @Override
    public void home_screen(View v) {
        startActivity(ms.go_to_home());
    }

    @Override
    public void my_profile_screen(View v) {
        startActivity(ms.go_to_myprofile());
    }

    @Override
    public void collab_screen(View v) {
        startActivity(ms.go_to_collabs());
    }

    @Override
    public void search_screen(View v) {
        startActivity(ms.go_to_search());
    }


}
