package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout item,itemlog,itemset,itemcon,itemrriwayat,itemreward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemlog = (RelativeLayout) findViewById(R.id.item_ek5);
        itemset = (RelativeLayout) findViewById(R.id.item_ek4);
        itemcon = (RelativeLayout) findViewById(R.id.item_ek3);
        itemrriwayat = (RelativeLayout) findViewById(R.id.item_ek1);
        itemreward = (RelativeLayout) findViewById(R.id.item_ek2);
        item = (RelativeLayout) findViewById(R.id.item);
        item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CariActivity.class);
                startActivity(i);
            }
        });

        itemlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);
                finish();
            }
        });

        itemset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(i);
            }
        });

        itemcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(i);
            }
        });

        itemreward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Reward.class);
                startActivity(i);
            }
        });
    }

}