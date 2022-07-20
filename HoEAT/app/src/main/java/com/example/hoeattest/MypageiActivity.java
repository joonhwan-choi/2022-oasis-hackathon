package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MypageiActivity extends AppCompatActivity {
    //네비
    private ImageView nv_myp1,nv_myp2,nv_myp3;

    private TextView mytripbutton,myreviewbutton, mylikebutton;

    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypagei);
        myreviewbutton=findViewById(R.id.myreviewbutton);
        mytripbutton=findViewById(R.id.mytripbutton);
        mylikebutton=findViewById(R.id.mylikebutton);
        //네비
        nv_myp1=findViewById(R.id.nv_myp1);
        nv_myp2=findViewById(R.id.nv_myp2);
        nv_myp3=findViewById(R.id.nv_myp3);
        //
        mylikebutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

            }
        });
        myreviewbutton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MyreviewActivity.class);

                startActivity(intent);
                finish();
            }
        });

        mytripbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MytripActivity.class);

                startActivity(intent);
                finish();

            }
        });



        //채팅
        nv_myp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ChattingListActivity.class);

                startActivity(intent);
                finish();

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