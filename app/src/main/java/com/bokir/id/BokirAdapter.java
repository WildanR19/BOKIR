package com.bokir.id;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        public BokirViewHolder(View itemView) {
            super(itemView);
            jdl = (TextView) itemView.findViewById(R.id.Judul);
            alm = (TextView) itemView.findViewById(R.id.alamat);
            waktu = (TextView) itemView.findViewById(R.id.waktu);
            free = (TextView) itemView.findViewById(R.id.free);
            freeint = (TextView) itemView.findViewById(R.id.freeint);

        }
    }
}