package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;
import cn.pedant.SweetAlert.SweetAlertDialog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pembayaran extends AppCompatActivity {

    Button dp;
    TextView jdl,alm,hrg;
    public String KEY_JDL = "judul";
    public String KEY_ALM = "alamat";
    public String KEY_HRG = "harga";
    private String judul,alam,Hrg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        getSupportActionBar().setTitle("Bayar DP");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        jdl =  (TextView) findViewById(R.id.tempat);
        alm = (TextView) findViewById(R.id.alm);
        hrg = (TextView) findViewById(R.id.Hrg);

        judul = getIntent().getStringExtra(KEY_JDL);
        alam = getIntent().getStringExtra(KEY_ALM);
        Hrg = getIntent().getStringExtra(KEY_HRG);

        jdl.setText(judul);
        alm.setText(alam);
        hrg.setText(Hrg);

        dp = (Button) findViewById(R.id.dp);
        dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(Pembayaran.this, SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Pembyaran Berhasil")
                        .setConfirmText("Lihat Tiket Parkir")
                        .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        Intent i = new Intent(Pembayaran.this,Riwayat.class);
                        startActivity(i);
                        finish();
                    }
                }).show();
            }
        });
    }
}
