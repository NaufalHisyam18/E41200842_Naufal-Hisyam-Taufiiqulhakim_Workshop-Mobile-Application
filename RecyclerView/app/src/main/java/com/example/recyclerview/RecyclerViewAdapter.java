package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder>{

    //membuat arraylist
    private ArrayList<String> logokampus = new ArrayList<>();
    private ArrayList<String> namakampus = new ArrayList<>();
    private ArrayList<String> tanggalkampus = new ArrayList<>();
    private ArrayList<String> asalkampus = new ArrayList<>();
    private ArrayList<String> deskripsikampus = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> logokampus, ArrayList<String> namakampus, ArrayList<String> tanggalkampus, ArrayList<String> asalkampus, ArrayList<String> deskripsikampus, Context context) {
        this.logokampus = logokampus;
        this.namakampus = namakampus;
        this.tanggalkampus = tanggalkampus;
        this.asalkampus = asalkampus;
        this.deskripsikampus = deskripsikampus;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {
        Glide.with(context).asBitmap().load(logokampus.get(position)).into(holder.logo);
        holder.nama.setText(namakampus.get(position));
        holder.tanggal.setText(tanggalkampus.get(position));

        //Menambahkan event klik
        holder.linearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Berpindah ke DetailActivity
                Intent intent = new Intent(context, DetailActivity.class);

                //Menyimpan data di dalam memori terlehi dahulu kemudian diterima oleh DetailActtivity
                intent.putExtra("logo_kampus", logokampus.get(position));
                intent.putExtra("nama_kampus", namakampus.get(position));
                intent.putExtra("tanggal_kampus", tanggalkampus.get(position));
                intent.putExtra("asal_kampus", asalkampus.get(position));
                intent.putExtra("deskripsi_kampus", deskripsikampus.get(position));

                //mengirimkan data
                context.startActivity(intent);
            }
        });
    }

    //Menentukan urutan item
    @Override
    public int getItemCount() {
        return namakampus.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView logo;
        TextView nama, tanggal;
        LinearLayout linearlayout;

        //Membuat constructor
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            logo = itemView.findViewById(R.id.img);
            nama = itemView.findViewById(R.id.tvNama);
            tanggal = itemView.findViewById(R.id.tvTanggal);
            linearlayout = itemView.findViewById(R.id.linearLayout);
        }
    }
}
