package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cari();
    }

    public void cari() {
        Intent cari = new Intent(MainActivity.this, CariActivity.class);
        startActivity(cari);
        finish();
    }

}