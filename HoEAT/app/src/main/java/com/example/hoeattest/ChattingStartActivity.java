package com.example.hoeattest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChattingStartActivity extends AppCompatActivity {
ImageView chasbak ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        chasbak=findViewById(R.id.chasbak);


        chasbak.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view) {
                finish();
            }
        });


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattingstart);
    }
}

