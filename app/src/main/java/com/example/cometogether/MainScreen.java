package com.example.cometogether;
import android.content.Intent;

public class MainScreen {
    private User user;

    public User getUser() {
        return user;
    }

    public MainScreen(User user) {
        this.user = user;
    }

    public Intent go_to_home() {
        Intent intent = new Intent(this, Home211.class);
        intent.putExtra("user", user.userid);
        return intent;
    }

    public Intent go_to_search(){
        Intent intent = new Intent(this, Home211.class);
        intent.putExtra("user", user.userid);
        return intent;
    }

    public Intent go_to_myprofile(){
        Intent intent = new Intent(this, Home211.class);
        intent.putExtra("user", user.userid);
        return intent;
    }

    public Intent go_to_collabs(){
        Intent intent = new Intent(this, Home211.class);
        intent.putExtra("user", user.userid);
        return intent;
    }
}
