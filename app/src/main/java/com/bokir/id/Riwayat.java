package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Riwayat extends AppCompatActivity {
    Dialog mydialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
        mydialog = new Dialog(Riwayat.this);
        getSupportActionBar().setTitle("Riwayat Booking");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void showDialog(View view) {
        TextView close;
        mydialog.setContentView(R.layout.qrcode);
        close = (TextView) mydialog.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydialog.dismiss();
            }
        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();
    }
}
