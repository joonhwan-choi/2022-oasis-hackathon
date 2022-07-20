package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ9Activity extends AppCompatActivity {
    ImageView mbt9bak,MbtiTrue9, MbtiFalse9;
    Button MbtiNextButton9;
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
        setContentView(R.layout.activity_mbtiq9);
        int TT= E+I+S+N+T+F+J+P;
        Toast.makeText(getApplicationContext(),TT+"",Toast.LENGTH_SHORT).show();

        Intent intent = getIntent();
        E=intent.getIntExtra("E",0);
        I=intent.getIntExtra("I",0);
        S = intent.getIntExtra("S", 0);
        N = intent.getIntExtra("N", 0);
        T = intent.getIntExtra("T", 0);
        F = intent.getIntExtra("F", 0);
        J = intent.getIntExtra("J", 0);
        P = intent.getIntExtra("P", 0);

        mbt9bak=findViewById(R.id.mbt9bak);
        MbtiTrue9=findViewById(R.id.MbtiTrue9);
        MbtiFalse9=findViewById(R.id.MbtiFalse9);
        MbtiNextButton9=findViewById(R.id.MbtiNextButton9);

        mbt9bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue9.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse9.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue9.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse9.setImageResource(R.drawable.mbti_not_select_no);
                }else if(yesorno==0){
                    Toast.makeText(getApplicationContext(),"선택해주세요",Toast.LENGTH_SHORT).show();
                }

            }
        });
        MbtiNextButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ10Activity.class);
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
