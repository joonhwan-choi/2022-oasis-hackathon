package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ11Activity extends AppCompatActivity {
    ImageView mbt11bak,MbtiTrue11, MbtiFalse11;
    Button MbtiNextButton11;
    int yesorno =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq11);


        mbt11bak=findViewById(R.id.mbt11bak);
        MbtiTrue11=findViewById(R.id.MbtiTrue11);
        MbtiFalse11=findViewById(R.id.MbtiFalse11);
        MbtiNextButton11=findViewById(R.id.MbtiNextButton11);
        MbtiNextButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ12Activity.class);
                startActivity(intent);
            }
        });
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
                }

            }
        });
    }
}
