package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ10Activity extends AppCompatActivity {
    ImageView mbt10bak,MbtiTrue10, MbtiFalse10;
    Button MbtiNextButton10;
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
        setContentView(R.layout.activity_mbtiq10);


        Intent intent = getIntent();
        E=intent.getIntExtra("E",0);
        I=intent.getIntExtra("I",0);
        S = intent.getIntExtra("S", 0);
        N = intent.getIntExtra("N", 0);
        T = intent.getIntExtra("T", 0);
        F = intent.getIntExtra("F", 0);
        J = intent.getIntExtra("J", 0);
        P = intent.getIntExtra("P", 0);
        mbt10bak=findViewById(R.id.mbt10bak);
        MbtiTrue10=findViewById(R.id.MbtiTrue10);
        MbtiFalse10=findViewById(R.id.MbtiFalse10);
        MbtiNextButton10=findViewById(R.id.MbtiNextButton10);
        int TT= E+I+S+N+T+F+J+P;
        Toast.makeText(getApplicationContext(),TT+"",Toast.LENGTH_SHORT).show();
        mbt10bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue10.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse10.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue10.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse10.setImageResource(R.drawable.mbti_not_select_no);
                }else if(yesorno==0){
                    Toast.makeText(getApplicationContext(),"선택해주세요",Toast.LENGTH_SHORT).show();
                }

            }
        });

        MbtiNextButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ11Activity.class);
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

