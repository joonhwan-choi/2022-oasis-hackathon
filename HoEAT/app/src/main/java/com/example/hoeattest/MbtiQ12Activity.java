package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ12Activity extends AppCompatActivity {
    ImageView mbt12bak,MbtiTrue12, MbtiFalse12;
    Button MbtiNextButton12;
    int yesorno =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq12);


        mbt12bak=findViewById(R.id.mbt12bak);
        MbtiTrue12=findViewById(R.id.MbtiTrue12);
        MbtiFalse12=findViewById(R.id.MbtiFalse12);
        MbtiNextButton12=findViewById(R.id.MbtiNextButton12);
        MbtiNextButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiResultActivity.class);
                startActivity(intent);
            }
        });
        mbt12bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        MbtiTrue12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(yesorno==0){
                    yesorno=1;

                }else if(yesorno==1){

                }else{
                    yesorno=1;
                }
                if(yesorno==1){
                    MbtiTrue12.setImageResource(R.drawable.mbti_not_select_yes);
                    MbtiFalse12.setImageResource(R.drawable.mbti_select_no);
                }


            }
        });
        MbtiFalse12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yesorno==0){
                    yesorno=2;

                }else if(yesorno==2){

                }else{
                    yesorno=2;
                }
                if(yesorno==2){

                    MbtiTrue12.setImageResource(R.drawable.mbti_select_yes);
                    MbtiFalse12.setImageResource(R.drawable.mbti_not_select_no);
                }

            }
        });
    }
}
