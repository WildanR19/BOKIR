package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class DetailPembayaran extends AppCompatActivity {

    TextView jdl,alm,waktu,free,freeint;
    Button btn;
    public String KEY_JDL = "judul";
    public String KEY_ALM = "judul";
    public String KEY_WKT = "judul";
    public String KEY_FREE = "judul";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pembayaran);

        getSupportActionBar().setTitle("Detail Pembayaran");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




    }
}
