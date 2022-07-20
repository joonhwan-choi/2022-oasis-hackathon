package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChattingListActivity extends AppCompatActivity {
    private ImageView nv_cha1,nv_cha2,nv_cha3;
    private LinearLayout chatting1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatting_list);

        //네비
        nv_cha1=findViewById(R.id.nv_cha1);
        nv_cha2=findViewById(R.id.nv_cha2);
        nv_cha3=findViewById(R.id.nv_cha3);
        //
        chatting1= findViewById(R.id.chatting1);


        chatting1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ChattingStartActivity.class);

                startActivity(intent);
                finish();

            }
        });




        //채팅
        nv_cha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        //

        //홈
        nv_cha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
                finish();

            }
        });

        //내정보
        nv_cha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MypageiActivity.class);

                startActivity(intent);
                finish();
            }
        });
    }
}

