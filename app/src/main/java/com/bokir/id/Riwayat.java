package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Riwayat extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);

        getSupportActionBar().setTitle("Riwayat Booking");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
