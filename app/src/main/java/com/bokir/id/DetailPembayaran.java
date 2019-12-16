package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailPembayaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pembayaran);

        getSupportActionBar().setTitle("Detail Pembayaran");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
