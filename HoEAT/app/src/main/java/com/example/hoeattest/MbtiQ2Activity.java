package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ2Activity extends AppCompatActivity {
    ImageView mbt2bak,MbtiTrue2, MbtiFalse2;
    Button MbtiNextButton2;
    int yesorno =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq2);


        mbt2bak=findViewById(R.id.mbt2bak);
        MbtiTrue2=findViewById(R.id.MbtiTrue2);
        MbtiFalse2=findViewById(R.id.MbtiFalse2);
        MbtiNextButton2=findViewById(R.id.MbtiNextButton2);
        MbtiNextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ3Activity.class);
                startActivity(intent);
            }
        });
        mbt2bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue2.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse2.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue2.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse2.setImageResource(R.drawable.mbti_not_select_no);
                }

            }
        });
    }
}
