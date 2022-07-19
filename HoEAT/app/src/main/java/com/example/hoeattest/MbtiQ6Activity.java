package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ6Activity extends AppCompatActivity {
    ImageView mbt6bak,MbtiTrue6, MbtiFalse6;
    Button MbtiNextButton6;
    int yesorno =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq6);


        mbt6bak=findViewById(R.id.mbt6bak);
        MbtiTrue6=findViewById(R.id.MbtiTrue6);
        MbtiFalse6=findViewById(R.id.MbtiFalse6);
        MbtiNextButton6=findViewById(R.id.MbtiNextButton6);
        MbtiNextButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ7Activity.class);
                startActivity(intent);
            }
        });
        mbt6bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue6.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse6.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue6.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse6.setImageResource(R.drawable.mbti_not_select_no);
                }

            }
        });
    }
}
