package com.bokir.id;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BokirAdapter extends RecyclerView.Adapter<BokirAdapter.BokirViewHolder> {

    private ArrayList<bokir> bokirs;

    public BokirAdapter(ArrayList<bokir> bokirs){
        this.bokirs=bokirs;
    }

    @Override
    public BokirViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_list, parent, false);
        return new BokirViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BokirAdapter.BokirViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return bokirs.size();
    }

    public class BokirViewHolder extends RecyclerView.ViewHolder {
        TextView jdl,alm,waktu,free,freeint;
        Button book;
        Context konteks;
        private String KEY_JDL = "judul";
        private String KEY_ALM = "alm";
        private String KEY_WKT = "waktu";
        private String KEY_FREE = "free";

        public BokirViewHolder(View itemView) {
            super(itemView);
            jdl = (TextView) itemView.findViewById(R.id.Judul);
            alm = (TextView) itemView.findViewById(R.id.alamat);
            waktu = (TextView) itemView.findViewById(R.id.waktu);
            free = (TextView) itemView.findViewById(R.id.free);
            freeint = (TextView) itemView.findViewById(R.id.freeint);
            book = (Button) itemView.findViewById(R.id.book);

            book.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION) {
                        konteks = v.getContext();
                        Intent is = new Intent(konteks, DetailPembayaran.class);
                        is.putExtra(KEY_JDL, bokirs.get(position).getJdl());
                        is.putExtra(KEY_ALM, bokirs.get(position).getAlamt());
                        is.putExtra(KEY_WKT, bokirs.get(position).getWaktu());
                        is.putExtra(KEY_FREE, bokirs.get(position).getFreeint());
                        konteks.startActivity(is);
                    }
                }
            });

        }
    }
}