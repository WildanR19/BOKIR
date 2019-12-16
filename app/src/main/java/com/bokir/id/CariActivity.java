package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CariActivity extends AppCompatActivity {

    private BokirAdapter bokirAdapter;
    private ArrayList<bokir> bokirs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari);

        getSupportActionBar().setTitle("Cari Tempat");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bokir);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CariActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        ambdata();
        bokirAdapter = new BokirAdapter(bokirs);
        recyclerView.setAdapter(bokirAdapter);
    }

    public void ambdata(){
        bokirs = new ArrayList<>();
        bokirs.add(new bokir("Parkir Gedung D","Jl. Sadewa 2 No.8, Pendrikan Kidul","08.00-10.20","10/100"));
        bokirs.add(new bokir("Parkir Mangga 2","Pendrikan Kidul, Kec. Semarang Tengah","08.00-10.20","30/100"));
    }

}
