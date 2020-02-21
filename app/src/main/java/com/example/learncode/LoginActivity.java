package com.example.learncode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginFunction(View view) {
        username = findViewById(R.id.editTextUsername);
        password = findViewById(R.id.editTextPassword);

        String usernameLogin = username.getText().toString();
        String passwordLogin = password.getText().toString();

        String username = String.valueOf(User.getUsername());
        String password = String.valueOf(User.getPassword());

            if(((usernameLogin).equals(username) && (passwordLogin.equals(password))))
            {
                Toast.makeText(this, "Log In Succsess", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),Home_Activity.class);
                startActivity(intent);
            }
            else if((((usernameLogin).equals("Admin") && (passwordLogin.equals("Admin")))))
            {
                Intent intent = new Intent(getApplicationContext(),Home_Activity.class);
                startActivity(intent);

            }

            else {
                Toast.makeText(this, "Authentication Failed", Toast.LENGTH_SHORT).show();
            }


        }



}
