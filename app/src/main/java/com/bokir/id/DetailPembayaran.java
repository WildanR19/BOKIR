package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailPembayaran extends AppCompatActivity {

    TextView jdl,alm,hrg;
    Button btn;
    public String KEY_JDL = "judul";
    public String KEY_ALM = "alamat";
    public String KEY_HRG = "harga";
    private String judul,alam,Hrg;
    private String ijdl,ialam,ihrg;

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

        ijdl = judul;
        ialam = alam;
        ihrg = Hrg;

        jdl.setText(judul);
        alm.setText(alam);
        hrg.setText(Hrg);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DetailPembayaran.this,Pembayaran.class);
                i.putExtra(KEY_JDL, ijdl);
                i.putExtra(KEY_ALM, ialam);
                i.putExtra(KEY_HRG, ihrg);
                startActivity(i);
                finish();
            }
        });
    }
}
