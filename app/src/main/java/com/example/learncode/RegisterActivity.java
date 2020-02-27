package com.example.learncode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    EditText username,password,email,phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



    }

    public void registerUser(View view) {

        username = findViewById(R.id.editTextUsernameRegister);
        password = findViewById(R.id.editTextPasswordRegister);
        email= findViewById(R.id.editTextEmail);
        phone = findViewById(R.id.editTextPhone);

        String usernameString = username.getText().toString();
        String passwordString = password.getText().toString();
        String emailString = email.getText().toString();
        String phoneString = phone.getText().toString();


        if(usernameString.equals("") || passwordString.equals("") || emailString.equals("") || phoneString.equals("")){

            Toast.makeText(this, "Please Fill Required Details", Toast.LENGTH_SHORT).show();
        }
        else {
            SharedPreferences preferences = getSharedPreferences("MyPreference",MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("Username",usernameString);
            editor.putString("Password",passwordString);
            editor.putString("Email",emailString);
            editor.putString("Phone",phoneString);
            editor.commit();

            Toast.makeText(this, "Join Successfully", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(intent);
        }




    }
}
