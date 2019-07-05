package com.example.vergarajohnmichaelquiz3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtName, txtPassword, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.etName);
        txtPassword = findViewById(R.id.etPassword);
        txtEmail = findViewById(R.id.etEmail);
    }

    public void goLogin(View v){
        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }

    public void saveInfo(View v){
        SharedPreferences sp = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString("user", txtName.getText().toString());
        editor.putString("pwd", txtPassword.getText().toString());
        editor.putString("Email", txtEmail.getText().toString());
        editor.commit();
        Toast.makeText(this, "Registered Successfully", Toast.LENGTH_LONG).show();
    }


}
