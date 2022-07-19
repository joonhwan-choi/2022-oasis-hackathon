package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ5Activity extends AppCompatActivity {
    ImageView mbt5bak,MbtiTrue5, MbtiFalse5;
    Button MbtiNextButton5;
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
        setContentView(R.layout.activity_mbtiq5);

        Intent intent = getIntent();
        E=intent.getIntExtra("E",0);
        I=intent.getIntExtra("I",0);
        S = intent.getIntExtra("S", 0);
        N = intent.getIntExtra("N", 0);
        T = intent.getIntExtra("T", 0);
        F = intent.getIntExtra("F", 0);
        J = intent.getIntExtra("J", 0);
        P = intent.getIntExtra("P", 0);

        mbt5bak=findViewById(R.id.mbt5bak);
        MbtiTrue5=findViewById(R.id.MbtiTrue5);
        MbtiFalse5=findViewById(R.id.MbtiFalse5);
        MbtiNextButton5=findViewById(R.id.MbtiNextButton5);

        mbt5bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue5.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse5.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue5.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse5.setImageResource(R.drawable.mbti_not_select_no);
                }

            }
        });

        MbtiNextButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ5Activity.class);
                if(yesorno==1){
                    J=J+1;
                }else{
                    P=P+1;
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
