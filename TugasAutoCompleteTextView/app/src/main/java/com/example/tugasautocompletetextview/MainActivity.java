package com.example.tugasautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter; //mengimport arrayadapter
import android.widget.AutoCompleteTextView; //mengimport AutoCompleteTextView

public class MainActivity extends AppCompatActivity {

    //membuat array game
    private static final  String[] game = new String[]{
        "Dota2", "Counter-Strike: Global Offensive", "PlayerUnknown's Battlegrounds", "Valorant",
        "Fifa 22", "eFootball 22", "NBA 2k22", "The Witcher 3", "Among Us"
    };

    //membuat variable autocompletetextview
    AutoCompleteTextView actview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actview = findViewById(R.id.actv);

        //membuat arrayadapter
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, game);
        actview.setAdapter(myAdapter);
    }
}