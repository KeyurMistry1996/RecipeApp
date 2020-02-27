package com.example.learncode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MyProfile_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile_);

        TextView username = findViewById(R.id.username);
        TextView email = findViewById(R.id.emailCard);
        TextView phone = findViewById(R.id.Phone_Card);

        SharedPreferences preferences = getSharedPreferences("MyPreference",MODE_PRIVATE);

        username.setText(preferences.getString("Username",null));
        email.setText(preferences.getString("Email",null));
        phone.setText(preferences.getString("Phone",null));
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.my_profile:
                Intent intent = new Intent(getApplicationContext(), MyProfile_Activity.class);
                startActivity(intent);
                return true;
            case R.id.about_us:
                Toast.makeText(getApplicationContext(), "Item 2 Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.contect_us:
                Toast.makeText(getApplicationContext(), "Item 3 Selected", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public void Sign_Out(View view) {
        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }
}
