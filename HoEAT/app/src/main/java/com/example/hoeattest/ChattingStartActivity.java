package com.example.hoeattest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChattingStartActivity extends AppCompatActivity {
    ImageView chasbak ;
    LinearLayout fcha1, fcha2;
    Button chattting_sendButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattingstart);
        chasbak=findViewById(R.id.chasbak);

        fcha1=findViewById(R.id.fcha1);
        fcha2=findViewById(R.id.fcha2);

        fcha1.setVisibility(View.INVISIBLE);
        fcha2.setVisibility(View.INVISIBLE);


        chasbak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });

        chattting_sendButton=findViewById(R.id.chattting_sendButton);

        chattting_sendButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                fcha1.setVisibility(View.VISIBLE);



                try {
                    for (int i = 0; i < 2; i++) {
                        Thread.sleep(3000);
                        Toast.makeText(getApplicationContext(),"지연",Toast.LENGTH_SHORT).show();

                    }
                }catch(Exception e) {
                    System.out.println(e);
                }


                fcha2.setVisibility(View.VISIBLE);

            }


        });


    }
}

