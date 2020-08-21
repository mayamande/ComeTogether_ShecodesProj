package com.example.cometogether;


public class User {
    public String username;
    public String password;
    public int userid;
    private String email="";
    private String facebook="";
    private String youtube="";
    private String about="";
    private boolean new_user;


    public User(int userid) {

        this.userid = userid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String username, String password, boolean new_user) {
        this.username = username;
        this.password = password;
        this.new_user = new_user;
        if (!new_user){

        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int login() {

    }

    public String getEmail() {
        return email;
    }

    public String getFacebook() {
        return facebook;
    }

    public String getYoutube() {
        return youtube;
    }

    public String getAbout() {
        return about;
    }

    public int check_username(){

    }

    public int new_user_ok (){

    }

    public void create_new_user () {

    }


}
