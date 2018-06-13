package com.example.reena.class2pmmay15;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Register_activity extends AppCompatActivity {


    EditText username,password,email,phone,address;
    RadioGroup group;
    ImageView image;
    Button register,cancel;

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_form);
        sharedPreferences=getSharedPreferences("Userinfo",0);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        group=findViewById(R.id.group);
        image=findViewById(R.id.image);
        register=findViewById(R.id.register);
        cancel=findViewById(R.id.cancel);

       register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String usernamevalue = username.getText().toString();
               String passwordvalue = password.getText().toString();
               String emailvalue = email.getText().toString();
               String phonevalue = phone.getText().toString();
               RadioButton checkbtn=findViewById(group.getCheckedRadioButtonId());
               String gendervalue = checkbtn.getText().toString();

               SharedPreferences.Editor editor=sharedPreferences.edit();
               editor.putString("username",usernamevalue);
               editor.putString("password",passwordvalue);
               editor.putString("email",emailvalue);
               editor.putString("phoneno",phonevalue);
               editor.putString("gender",gendervalue);
               editor.apply();

               Toast.makeText(Register_activity.this, "User Registered!!!", Toast.LENGTH_SHORT).show();



           }
       });






    }


}
