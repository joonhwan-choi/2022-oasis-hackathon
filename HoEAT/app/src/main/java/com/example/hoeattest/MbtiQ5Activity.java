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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq5);


        mbt5bak=findViewById(R.id.mbt5bak);
        MbtiTrue5=findViewById(R.id.MbtiTrue5);
        MbtiFalse5=findViewById(R.id.MbtiFalse5);
        MbtiNextButton5=findViewById(R.id.MbtiNextButton5);
        MbtiNextButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ6Activity.class);
                startActivity(intent);
            }
        });
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
    }
}
