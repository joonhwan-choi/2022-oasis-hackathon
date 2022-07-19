package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ3Activity extends AppCompatActivity {
    ImageView mbt3bak,MbtiTrue3, MbtiFalse3;
    Button MbtiNextButton3;
    int yesorno =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq3);


        mbt3bak=findViewById(R.id.mbt3bak);
        MbtiTrue3=findViewById(R.id.MbtiTrue3);
        MbtiFalse3=findViewById(R.id.MbtiFalse3);
        MbtiNextButton3=findViewById(R.id.MbtiNextButton3);
        MbtiNextButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ4Activity.class);
                startActivity(intent);
            }
        });
        mbt3bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue3.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse3.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue3.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse3.setImageResource(R.drawable.mbti_not_select_no);
                }

            }
        });
    }
}
