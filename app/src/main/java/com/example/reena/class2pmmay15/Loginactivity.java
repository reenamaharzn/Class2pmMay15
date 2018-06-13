package com.example.reena.class2pmmay15;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Loginactivity extends AppCompatActivity {

    EditText username, password;
    Button login, register;
    CheckBox rememberme;
    TextView forgetpassword;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginform);
        sharedPreferences = getSharedPreferences("Userinfo", 0);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        rememberme = findViewById(R.id.rememberme);
        forgetpassword = findViewById(R.id.forgetpassword);

        if (sharedPreferences.getBoolean("rememberme", false)
                ) {
            startActivity(new Intent(Loginactivity.this, Home_activity.class));
            finish();

        }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernamevalue = username.getText().toString();
                String passwordvalue = password.getText().toString();

                String registeredUsername = sharedPreferences.getString("username", "");
                String registeredPassword = sharedPreferences.getString("password", "");
                Log.i("check",usernamevalue+"::"+registeredUsername);
                Log.i("check",passwordvalue+"::"+registeredPassword);

                if (registeredUsername.equals(usernamevalue) && registeredPassword.equals(passwordvalue)) {


                    Toast.makeText(Loginactivity.this, "Login sucess", Toast.LENGTH_SHORT).show();

                    if (rememberme.isChecked()) {
                        sharedPreferences.edit().putBoolean("rememberme", true).apply();
                    }
                    startActivity(new Intent(Loginactivity.this, Home_activity.class));
                    finish();
                } else {
                    Toast.makeText(Loginactivity.this, "Login failure", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(Loginactivity.this, "username" + usernamevalue +
                        "/npassword" + passwordvalue, Toast.LENGTH_SHORT).show();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loginactivity.this, Register_activity.class);
                startActivity(intent);
            }
        });
        Log.i("lifecycle", "oncreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifecycle", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifecycle", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifecycle", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifecycle", "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycle", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifecycle", "oncreate");
    }
}
