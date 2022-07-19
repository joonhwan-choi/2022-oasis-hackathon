package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ4Activity extends AppCompatActivity {
    ImageView mbt4bak,MbtiTrue4, MbtiFalse4;
    Button MbtiNextButton4;
    int yesorno =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq4);


        mbt4bak=findViewById(R.id.mbt4bak);
        MbtiTrue4=findViewById(R.id.MbtiTrue4);
        MbtiFalse4=findViewById(R.id.MbtiFalse4);
        MbtiNextButton4=findViewById(R.id.MbtiNextButton4);
        MbtiNextButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ5Activity.class);
                startActivity(intent);
            }
        });
        mbt4bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue4.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse4.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue4.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse4.setImageResource(R.drawable.mbti_not_select_no);
                }else if(yesorno==0){
                    Toast.makeText(getApplicationContext(),"선택해주세요",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
