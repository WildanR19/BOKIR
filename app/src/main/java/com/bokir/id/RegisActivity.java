package com.bokir.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisActivity extends AppCompatActivity {

    private TextView btnLogin;
    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
        // getSupportActionBar().hide();
        final EditText email, username, password;
        email = (EditText) findViewById(R.id.input_email);
        username = (EditText) findViewById(R.id.input_username);
        password = (EditText) findViewById(R.id.input_password);
        btnDaftar = (Button) findViewById(R.id.btn_regis);
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefer = getSharedPreferences("MYDATA", MODE_PRIVATE);
                String newEmail = email.getText().toString();
                String newusername = username.getText().toString();
                String newPass = password.getText().toString();
                SharedPreferences.Editor edit = prefer.edit();
                edit.putString("email", newEmail);
                edit.putString("user", newusername);
                edit.putString("pass", newPass);
                edit.putString(newusername +newPass + "data", newusername);
                edit.commit();
                Intent iLogin = new Intent(RegisActivity.this,LoginActivity.class);
                startActivity(iLogin);
            }
        });
    }
}
