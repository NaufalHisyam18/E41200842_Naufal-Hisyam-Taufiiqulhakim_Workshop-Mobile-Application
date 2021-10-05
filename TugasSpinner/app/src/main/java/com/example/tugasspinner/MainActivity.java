package com.example.tugasspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView; //mengimport adapterview
import android.widget.Spinner; //mengimport spinner
import android.widget.ArrayAdapter; //mengimport arrayadapter
import android.widget.Toast; //mengimport toast

public class MainActivity extends AppCompatActivity {

    Spinner spinner; //membuat variable spinner
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        //membuat arrayAdapter
        ArrayAdapter<CharSequence> myAdapter = ArrayAdapter.createFromResource(this, R.array.mata_kuliah, android.R.layout.simple_spinner_item);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String matkul = parent.getItemAtPosition(position).toString();

                //membuat Toast
                Toast.makeText(parent.getContext(), "Memilih: "+matkul, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
    }
}