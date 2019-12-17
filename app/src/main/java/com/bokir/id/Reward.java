package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Reward extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);

        getSupportActionBar().setTitle("Hadiah");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
