package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ11Activity extends AppCompatActivity {
    ImageView mbt11bak,MbtiTrue11, MbtiFalse11;
    Button MbtiNextButton11;
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
        setContentView(R.layout.activity_mbtiq11);


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

        mbt11bak=findViewById(R.id.mbt11bak);
        MbtiTrue11=findViewById(R.id.MbtiTrue11);
        MbtiFalse11=findViewById(R.id.MbtiFalse11);
        MbtiNextButton11=findViewById(R.id.MbtiNextButton11);

        mbt11bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue11.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse11.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue11.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse11.setImageResource(R.drawable.mbti_not_select_no);
                }else if(yesorno==0){
                    Toast.makeText(getApplicationContext(),"선택해주세요",Toast.LENGTH_SHORT).show();
                }

            }
        });
        MbtiNextButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ12Activity.class);
                if(yesorno==1){
                    E=E+1;
                }else{
                    I=I+1;
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
