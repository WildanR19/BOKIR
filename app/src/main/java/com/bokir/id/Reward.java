package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;
import cn.pedant.SweetAlert.SweetAlertDialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reward extends AppCompatActivity {

    Button scan1,scan2,scan3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);

        getSupportActionBar().setTitle("Hadiah");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        scan1 = (Button) findViewById(R.id.scan);
        scan2 = (Button) findViewById(R.id.scan2);
        scan3 = (Button) findViewById(R.id.scan3);

        scan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SweetAlertDialog(Reward.this,SweetAlertDialog.SUCCESS_TYPE)
                        .setTitleText("Hadiah Didapatkan")
                        .setConfirmText("OK")
                        .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                            @Override
                            public void onClick(SweetAlertDialog sweetAlertDialog) {
                                sweetAlertDialog.dismissWithAnimation();
                            }
                        }).show();
            }
        });

    }
}
