package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MypageiActivity extends AppCompatActivity {
    //네비
    private ImageView nv_myp1,nv_myp2,nv_myp3;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypagei);

        //네비
        nv_myp1=findViewById(R.id.nv_myp1);
        nv_myp2=findViewById(R.id.nv_myp2);
        nv_myp3=findViewById(R.id.nv_myp3);
        //

        //채팅
        nv_myp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        //

        //홈
        nv_myp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
                finish();
            }
        });

        //내정보
        nv_myp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


    }



}