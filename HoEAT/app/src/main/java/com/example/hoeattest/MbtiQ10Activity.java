package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MbtiQ10Activity extends AppCompatActivity {
    ImageView mbt10bak,MbtiTrue10, MbtiFalse10;
    Button MbtiNextButton10;
    int yesorno =0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiq10);


        mbt10bak=findViewById(R.id.mbt10bak);
        MbtiTrue10=findViewById(R.id.MbtiTrue10);
        MbtiFalse10=findViewById(R.id.MbtiFalse10);
        MbtiNextButton10=findViewById(R.id.MbtiNextButton10);
        MbtiNextButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MbtiQ11Activity.class);
                startActivity(intent);
            }
        });
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
                }

            }
        });
    }
}
