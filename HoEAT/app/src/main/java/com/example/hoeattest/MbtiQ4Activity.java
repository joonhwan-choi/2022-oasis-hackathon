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
        setContentView(R.layout.activity_mbtiq4);


        Intent intent = getIntent();
        E=intent.getIntExtra("E",0);
        I=intent.getIntExtra("I",0);
        S = intent.getIntExtra("S", 0);
        N = intent.getIntExtra("N", 0);
        T = intent.getIntExtra("T", 0);
        F = intent.getIntExtra("F", 0);
        J = intent.getIntExtra("J", 0);
        P = intent.getIntExtra("P", 0);
        int TT= E+I+S+N+T+F+J+P;
        Toast.makeText(getApplicationContext(),TT+"",Toast.LENGTH_SHORT).show();
        mbt4bak=findViewById(R.id.mbt4bak);
        MbtiTrue4=findViewById(R.id.MbtiTrue4);
        MbtiFalse4=findViewById(R.id.MbtiFalse4);
        MbtiNextButton4=findViewById(R.id.MbtiNextButton4);

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
                }

            }
        });


        MbtiNextButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ5Activity.class);
                if(yesorno==1){
                    N=N+1;
                }else{
                    S=S+1;
                }

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
