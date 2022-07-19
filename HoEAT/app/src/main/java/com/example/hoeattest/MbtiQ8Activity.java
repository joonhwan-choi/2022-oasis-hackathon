package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ8Activity extends AppCompatActivity {
    ImageView mbt8bak,MbtiTrue8, MbtiFalse8;
    Button MbtiNextButton8;
    int yesorno =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq6);


        mbt8bak=findViewById(R.id.mbt8bak);
        MbtiTrue8=findViewById(R.id.MbtiTrue8);
        MbtiFalse8=findViewById(R.id.MbtiFalse8);
        MbtiNextButton8=findViewById(R.id.MbtiNextButton8);
        MbtiNextButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ9Activity.class);
                startActivity(intent);
            }
        });
        mbt8bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue8.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse8.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue8.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse8.setImageResource(R.drawable.mbti_not_select_no);
                }else if(yesorno==0){
                    Toast.makeText(getApplicationContext(),"선택해주세요",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
