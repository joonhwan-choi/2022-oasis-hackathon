package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FoodCategoryActivity extends AppCompatActivity {
    //네비
    private ImageView nv_food1,nv_food2,nv_food3, food_bak;
    private LinearLayout food_food1;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodcategory);


        food_food1=findViewById(R.id.food_food1);
        //네비
        nv_food1=findViewById(R.id.nv_food1);
        nv_food2=findViewById(R.id.nv_food2);
        nv_food3=findViewById(R.id.nv_food3);

        //
        food_bak=findViewById(R.id.food_bak);





        food_food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RestaurantActivity.class);
                startActivity(intent);

            }
        });
        food_bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });

        //채팅
        nv_food1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        //

        //홈
        nv_food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
                finish();

            }
        });

        //내정보
        nv_food3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MypageiActivity.class);

                startActivity(intent);

                finish();
            }
        });

    }
}

