package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailPembayaran extends AppCompatActivity {

    TextView jdl,alm,waktu,hrg;
    Button btn;
    public String KEY_JDL = "judul";
    public String KEY_ALM = "alamat";
    public String KEY_WKT = "waktu";
    public String KEY_HRG = "harga";
    private String judul,alam,wkt,Hrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pembayaran);

        getSupportActionBar().setTitle("Detail Pesanan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        jdl =  (TextView) findViewById(R.id.tempat);
        alm = (TextView) findViewById(R.id.alm);
        hrg = (TextView) findViewById(R.id.Hrg);
        btn = (Button) findViewById(R.id.book);

        judul = getIntent().getStringExtra(KEY_JDL);
        alam = getIntent().getStringExtra(KEY_ALM);
        Hrg = getIntent().getStringExtra(KEY_HRG);

        jdl.setText(judul);
        alm.setText(alam);
        hrg.setText(Hrg);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailPembayaran.this,Pembayaran.class);
                startActivity(i);
                finish();
            }
        });
    }
}
