package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiResultActivity extends AppCompatActivity {

    private int E;
    private int I;
    private int S;
    private int N;
    private int T;
    private int F;
    private int J;
    private int P;

    TextView mbti,mbtito,mbtisuggestion;
    private String a;
    private String b;
    private String c;
    private String d;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiresult);
        Intent intent = getIntent();
        E=intent.getIntExtra("E",0);
        I=intent.getIntExtra("I",0);
        S = intent.getIntExtra("S", 0);
        N = intent.getIntExtra("N", 0);
        T = intent.getIntExtra("T", 0);
        F = intent.getIntExtra("F", 0);
        J = intent.getIntExtra("J", 0);
        P = intent.getIntExtra("P", 0);


        if(E>=2){
            a="E";
        }else{
            a="I";
        }
        if(N>=2){
            b="N";
        }else{
            b="S";
        }
        if(F>=2){
            c="F";
        }else{
            c="T";
        }
        if(N>=2){
            d="P";
        }else{
            d="j";
        }

        mbti=findViewById(R.id.mbti);
        mbtito=findViewById(R.id.mbtito);
        mbtisuggestion=findViewById(R.id.mbtisuggestion);

        mbtisuggestion.setText("ENFJ");

        mbti.setText(a+b+c+d);
        mbtito.setText(a+b+c+d);



    }
}