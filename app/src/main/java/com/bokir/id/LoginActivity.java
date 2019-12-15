package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin, btnRegis;
    private EditText username ,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        getSupportActionBar().hide();
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        btnRegis = (TextView) findViewById(R.id.btn_regis);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                SharedPreferences prefer = getSharedPreferences("MYDATA",MODE_PRIVATE);
                String username = prefer.getString("user", null);
                String password = prefer.getString("pass", null);
                System.out.println("User : "+user+" = "+username+", dan pass = "+pass+"="+password);
                if ((username != null && password != null) && (username.equals(user) && password.equals(pass))){
                    Intent iMain = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(iMain);
                }else{
                    Toast.makeText(getApplicationContext(), "Belum Register ...!!! atau Username Tidak Ada", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iRegis = new Intent(LoginActivity.this,RegisActivity.class);
                finish();
            }
        });
    }
}
