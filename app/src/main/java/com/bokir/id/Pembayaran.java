package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pembayaran extends AppCompatActivity {

    Button dp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        getSupportActionBar().setTitle("Bayar DP");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dp = (Button) findViewById(R.id.dp);
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pembayaran.this,Riwayat.class);
                startActivity(i);
                finish();
            }
        });
    }
}
