package com.example.tugaslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView; //mengimport listview
import android.widget.ArrayAdapter; //mengimport arrayadapter

public class MainActivity extends AppCompatActivity {

    ListView list; //membuat variable list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.listView);

        //membuat array nama makanan menggunakan string
        String[] namaMakanan = {"Nasi Goreng", "Nasi Pecel", "Nasi Jagung", "Gado-Gado", "Salad", "Spagetti",
                                "Pizza", "Sushi"};

        //memasukkan array menggunakan arrayadpter
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, namaMakanan);
        list.setAdapter(myAdapter);
    }
}