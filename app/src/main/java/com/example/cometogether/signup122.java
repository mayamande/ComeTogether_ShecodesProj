package com.example.cometogether;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class signup122 extends AppCompatActivity {

    Intent intent = getIntent();
    int userid = intent.getIntExtra("userid", 0);
    User user = new User(userid);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup122);
        int intent_level = intent.getIntExtra("from ins", 0);
        String[] fields = {user.getEmail(), user.getYoutube(), user.getFacebook(), user.getAbout()};
        int a = set_string(fields);
        if (intent_level == 1) {
            String[] fields_from_intent = {intent.getStringExtra("email"), intent.getStringExtra("youtube"), intent.getStringExtra("facebook"), intent.getStringExtra("about")};
            String[] ins = intent.getStringExtra("instrument").split(",");
            a = set_string(fields_from_intent);
            Button btn = (Button) findViewById(R.id.new_instrument_btn);
            btn.setVisibility(View.INVISIBLE);
            FrameLayout frame = (FrameLayout) findViewById(R.id.new_instrument);
            frame.setVisibility(View.VISIBLE);
            TextView txtv = (TextView) findViewById(R.id.instrument_details);
            String instrument_info = ins[0] + " At level " + ins[1] + " in genre " + ins[2];
            txtv.setText(instrument_info);
        }
    }


    public void save_user(View v) {
        EditText[] fields = field_lst();
        TextView txtv = (TextView) findViewById(R.id.instrument_details);
        String instrument_info = txtv.getText().toString();
        String[] instrument_lst = {instrument_info.substring(0, instrument_info.indexOf("At level")), instrument_info.substring(instrument_info.indexOf("At level") + 8, instrument_info.indexOf(" in genre ")), instrument_info.substring(instrument_info.indexOf(" in genre ") + 1)};
        user.save_user(fields[0].getText().toString(), fields[1].getText().toString(), fields[2].getText().toString(), fields[3].getText().toString(), instrument_lst);
    }

    public void new_instrument(View v) {
        Intent instrument_scr = new Intent(this, InstrumentActivity.class);
        instrument_scr.putExtra("userid", userid);
        EditText[] fields = field_lst();
        instrument_scr.putExtra("email", fields[0].getText().toString());
        instrument_scr.putExtra("youtube", fields[1].getText().toString());
        instrument_scr.putExtra("facebook", fields[2].getText().toString());
        instrument_scr.putExtra("about", fields[3].getText().toString());
        startActivity(instrument_scr);

    }

    public EditText[] field_lst() {
        EditText email = (EditText) findViewById(R.id.email_signup);
        EditText youtube = (EditText) findViewById(R.id.youtube);
        EditText facebook = (EditText) findViewById(R.id.facebook);
        EditText about = (EditText) findViewById(R.id.about_yourself);
        EditText[] lst = {email, youtube, facebook, about};
        return lst;
    }

    public String[] get_fields() {
        EditText[] lst = field_lst();
        String[] fields = new String[4];
        for (int i = 0; i < 4; i++) {
            fields[i] = lst[i].getText().toString();
        }
        return fields;
    }

    private int set_string(String[] fields) {
        EditText[] lst = field_lst();
        for (int i = 0; i < 4; i++) {
            lst[i].setText(fields[i]);
        }
        return 1;
    }
}
