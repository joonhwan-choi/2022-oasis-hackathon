package com.example.hoeattest;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MbtiQ1Activity extends AppCompatActivity {
    ImageView mbt1bak,MbtiTrue1, MbtiFalse1;
    Button MbtiNextButton1;
    int yesorno =0;

    private int E;
    private int I;
    private int S;
    private int N;
    private int T;
    private int F;
    private int J;
    private int P;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq1);

        mbt1bak=findViewById(R.id.mbt1bak);
        MbtiTrue1=findViewById(R.id.MbtiTrue1);
        MbtiFalse1=findViewById(R.id.MbtiFalse1);
        MbtiNextButton1=findViewById(R.id.MbtiNextButton1);

        mbt1bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue1.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse1.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue1.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse1.setImageResource(R.drawable.mbti_not_select_no);




                }

            }
        });


        MbtiNextButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==1){
                    N=N+1;
                }else{
                    S=S+1;
                }
                Intent intent = new Intent(getApplicationContext(), MbtiQ2Activity.class);
                intent.putExtra("E", E);
                intent.putExtra("I", I);
                intent.putExtra("S", S);
                intent.putExtra("N", N);
                intent.putExtra("T", T);
                intent.putExtra("F", F);
                intent.putExtra("J", J);
                intent.putExtra("P", P);


                startActivity(intent);

            }
        });
        }
    }
