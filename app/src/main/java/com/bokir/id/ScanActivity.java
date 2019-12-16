package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);

        getSupportActionBar().setTitle("Scann");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
