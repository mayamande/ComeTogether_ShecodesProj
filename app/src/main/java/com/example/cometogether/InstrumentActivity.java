package com.example.cometogether;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class InstrumentActivity extends AppCompatActivity {
    Instrument ins = new Instrument();
    Button guitar = (Button) findViewById(R.id.choose_guitar);
    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrument);
    }


    private void color_button(Button btn, int col){
        if (col==0){ //make button gray
           btn.setBackgroundColor(Color.parseColor("#EAECEE"));
       }

        if (col==1){ //make button purple
            btn.setBackgroundColor(Color.parseColor("#E8DAEF"));
        }
    }


    public void choose_guitar_instrument(View v){}
    public void choose_piano_instrument(View v){}
    public void choose_drum_instrument(View v){}
    public void choose_singing_instrument(View v){}
    public void choose_spinner_instrument(View v){}
    public  void search_instrument(View v){
        Button search = (Button) findViewById(R.id.choose_search_instrument);
        Spinner spinner = (Spinner) findViewById(R.id.instrumnet_spinner);
        search.setVisibility(View.INVISIBLE);
        search.setVisibility(View.VISIBLE);
    }

}
