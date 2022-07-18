package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView main_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_name = findViewById(R.id.main_name);




        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        main_name.setText(userName);


    }
}