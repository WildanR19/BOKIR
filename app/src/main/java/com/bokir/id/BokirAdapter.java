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
        holder.jdl.setText(bokirs.get(position).getJdl());
        holder.alm.setText(bokirs.get(position).getAlamt());
        holder.waktu.setText(bokirs.get(position).getWaktu());
        holder.freeint.setText(bokirs.get(position).getFreeint());
    }

    @Override
    public int getItemCount() {
        return (bokirs != null) ? bokirs.size() : 0;
    }

    public class BokirViewHolder extends RecyclerView.ViewHolder {
        TextView jdl,alm,waktu,free,freeint;
        Button btn;
        Context konteks;
        public String KEY_JDL = "judul";
        public String KEY_ALM = "alamat";
        public String KEY_WKT = "waktu";
        public String KEY_HRG = "harga";

        public BokirViewHolder(View itemView) {
            super(itemView);
            jdl = (TextView) itemView.findViewById(R.id.Judul);
            alm = (TextView) itemView.findViewById(R.id.alamat);
            waktu = (TextView) itemView.findViewById(R.id.waktu);
            free = (TextView) itemView.findViewById(R.id.free);
            freeint = (TextView) itemView.findViewById(R.id.freeint);
            btn = (Button) itemView.findViewById(R.id.book);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    konteks = v.getContext();
                    int position = getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION){
                        Intent i = new Intent(konteks, DetailPembayaran.class);
                        i.putExtra(KEY_JDL, bokirs.get(position).getJdl());
                        i.putExtra(KEY_ALM, bokirs.get(position).getAlamt());
                        i.putExtra(KEY_WKT, bokirs.get(position).getWaktu());
                        i.putExtra(KEY_HRG, bokirs.get(position).getHrg());
                        konteks.startActivity(i);
                        System.exit(0);
                    }
                }
            });

        }
    }
}