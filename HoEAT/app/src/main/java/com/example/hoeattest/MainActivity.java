package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //네비
    private ImageView nv_main1,nv_main2,nv_main3, main_yeosu;
    //
    private TextView main_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_name = findViewById(R.id.main_name);
        //네비
        nv_main1=findViewById(R.id.nv_main1);
        nv_main2=findViewById(R.id.nv_main2);
        nv_main3=findViewById(R.id.nv_main3);
        //

        main_yeosu=findViewById(R.id.main_yeosu);



        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        main_name.setText(userName);
        main_yeosu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FoodCategoryActivity.class);

                startActivity(intent);


            }
        });

        //채팅
        nv_main1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ChattingListActivity.class);

                startActivity(intent);
                finish();

            }
        });

        //

        //홈
        nv_main2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        //내정보
        nv_main3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MypageiActivity.class);

                startActivity(intent);
                finish();
            }
        });


    }


}