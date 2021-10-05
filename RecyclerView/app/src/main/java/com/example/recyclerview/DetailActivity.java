package com.example.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    //mendeklarasikan object
    ImageView img;
    TextView tvNama, tvTanggal, tvAsal, tvDeskripsi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = findViewById(R.id.img);
        tvNama = findViewById(R.id.tvNama);
        tvTanggal = findViewById(R.id.tvTanggal);
        tvAsal = findViewById(R.id.tvAsal);
        tvDeskripsi = findViewById(R.id.tvDeskripsi);

        //Menjalankan pegambilan data
        getIncomingExtra();
    }

    //Method untuk mengambil data yang dikirimkan
    private void getIncomingExtra() {
        if(getIntent().hasExtra("logo_kampus") && getIntent().hasExtra("nama_kampus")
                && getIntent().hasExtra("tanggal_kampus") && getIntent().hasExtra("asal_kampus")
                & getIntent().hasExtra("deskripsi_kampus")){

            //Membuat variable untuk mengambil nilai string
            String logokampus = getIntent().getStringExtra("logo_kampus");
            String namakampus = getIntent().getStringExtra("nama_kampus");
            String tanggalkampus = getIntent().getStringExtra("tanggal_kampus");
            String asalkampus = getIntent().getStringExtra("asal_kampus");
            String deskripsikampus = getIntent().getStringExtra("deskripsi_kampus");

            //Menjalankan
            setDataActivity(logokampus, namakampus, tanggalkampus, asalkampus, deskripsikampus);
        }
    }

    //Method untuk mengirimkan data
    private void setDataActivity(
            String logokampus, String namakampus, String tanggalkampus,
            String asalkampus,String deskripsikampus){

        //Memasukkan data ke dalam objek sesuai dengan tempatnya
        Glide.with(this).asBitmap().load(logokampus).into(img);
        tvNama.setText(namakampus);
        tvTanggal.setText(tanggalkampus);
        tvAsal.setText(asalkampus);
        tvDeskripsi.setText(deskripsikampus);
    }
}