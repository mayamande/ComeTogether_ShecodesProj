package com.example.cometogether;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class InstrumentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrument);
    }

    //create default instrument -
     String inst="Guitar";
    int a= change_btn_color((Button) findViewById (R.id.choose_guitar), 1);
    int lvl=1;
    int b= change_btn_color((Button) findViewById (R.id.btn_lvl1), 1);
    String genre="Classical";
    int c=change_btn_color((Button) findViewById (R.id.choose_Classical), 1);

    private int change_btn_color(Button btn, int col){
        if (col==0){ //make button gray
           btn.setBackgroundColor(Color.parseColor("#EAECEE"));
       }
        if (col==1){ //make button purple
            btn.setBackgroundColor(Color.parseColor("#E8DAEF"));
        }
        return col;
    } //changes button color when clicked
    private void change_btn_normal(Button [] all_btn){
        for (Button button : all_btn) {
            a = change_btn_color(button, 0);
        }
    }


    public void choose_intrument (View v) {
        Button b = (Button) v;
        inst = b.getText().toString();
        Button [] all_btn = {(Button) findViewById (R.id.choose_piano), (Button) findViewById (R.id.choose_guitar), (Button) findViewById (R.id.choose_drums), (Button) findViewById (R.id.choose_search_instrument), (Button) findViewById (R.id.choose_singing)} ;
        change_btn_normal(all_btn);
        a=change_btn_color(b, 1);

    }
    public  void search_instrument(View v){
        Button search = (Button) findViewById(R.id.choose_search_instrument);
        Spinner spinner = (Spinner) findViewById(R.id.instrumnet_spinner);
        search.setVisibility(View.INVISIBLE);
        spinner.setVisibility(View.VISIBLE);
    }
    public void choose_spinner_instrument(View v){
        Spinner spinner = (Spinner) findViewById(R.id.instrumnet_spinner);
        String [] lst_of_instrument = {"bass","voilin"};
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,lst_of_instrument);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                inst=adapterView.getItemAtPosition(i).toString();
                Button search = (Button) findViewById(R.id.choose_search_instrument);
                Spinner spinner = (Spinner) findViewById(R.id.instrumnet_spinner);
                search.setVisibility(View.VISIBLE);
                Button [] all_btn = {(Button) findViewById (R.id.choose_piano), (Button) findViewById (R.id.choose_guitar), (Button) findViewById (R.id.choose_drums), search, (Button) findViewById (R.id.choose_singing)} ;
                change_btn_normal(all_btn);
                int a=change_btn_color(search,1);
                search.setText(inst);
                spinner.setVisibility(View.INVISIBLE);
            } //when choose instrument
        });
    }


    public void choose_lvl(View v) {
        Button b = (Button) v;
        lvl = Integer.parseInt(b.getText().toString());
        Button [] all_btn = {(Button) findViewById (R.id.btn_lvl1), (Button) findViewById (R.id.btn_lvl2), (Button) findViewById (R.id.btn_lvl3), (Button) findViewById (R.id.btn_lvl4)};
        change_btn_normal(all_btn);
        a=change_btn_color(b, 1);
    }

    public void choose_genre (View v){
        Button b = (Button) v;
        Button [] all_btn = {(Button) findViewById (R.id.choose_Classical), (Button) findViewById (R.id.choose_Indie), (Button) findViewById (R.id.choose_Pop), (Button) findViewById (R.id.choose_Rock), (Button) findViewById (R.id.choose_search_genre)};
        genre = b.getText().toString();
        change_btn_normal(all_btn);
        a=change_btn_color(b, 1);
    }
    public  void search_genre(View v){
        Button search = (Button) findViewById(R.id.choose_search_genre);
        Spinner spinner = (Spinner) findViewById(R.id.genre_spinner);
        search.setVisibility(View.INVISIBLE);
        spinner.setVisibility(View.VISIBLE);
    }
    public void choose_spinner_genre(View v){
        Spinner spinner = (Spinner) findViewById(R.id.genre_spinner);
        String [] lst_of_instrument = {"Electronic","Latin"};
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,lst_of_instrument);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                inst=adapterView.getItemAtPosition(i).toString();
                Button search = (Button) findViewById(R.id.choose_search_genre);
                Spinner spinner = (Spinner) findViewById(R.id.genre_spinner);
                search.setVisibility(View.VISIBLE);
                Button [] all_btn = {(Button) findViewById (R.id.choose_Classical), (Button) findViewById (R.id.choose_Indie), (Button) findViewById (R.id.choose_Pop), (Button) findViewById (R.id.choose_Rock), search};
                change_btn_normal(all_btn);
                int a=change_btn_color(search,1);
                search.setText(inst);
                spinner.setVisibility(View.INVISIBLE);
            } //when choose instrument
        });
    }

    public void btn_save(View v){}
    public void btn_cancel(View v){

    }


}
