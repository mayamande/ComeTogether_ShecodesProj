package com.example.cometogether;


public class User {
    public String username;
    public String password;
    public int userid;
    private String email="";
    private String facebook="";
    private String youtube="";
    private String about="";
    private String [] instrument_info = new String[3];
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
        return 0;
    }


    public String[] getInstrument_info() {
        return instrument_info;
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
        return 0;

    }

    public int new_user_ok (){
        return 0;
    }

    public void create_new_user () {

    }

    public void save_user(String email, String facebook, String youtube, String about, String [] instrment_information){
        this.email=email;
        this.facebook= facebook;
        this.youtube=youtube;
        this.about=about;
        this.instrument_info=instrment_information;

    }


}
