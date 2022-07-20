package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import androidx.appcompat.app.AppCompatActivity;

import net.daum.android.map.MapView;

public class RestaurantActivity extends AppCompatActivity {
    private ImageView nv_res1,nv_res2,nv_res3,resbak,chabutton, partner_write;
    private LinearLayout res_gaejang,res_linearsw1, res_linearsw2;

//    private TextView tv_id, tv_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);



        TabHost tab_host = (TabHost) findViewById(R.id.tabhost);
        tab_host.setup();



        TabHost.TabSpec ts1 = tab_host.newTabSpec("맛집찾기");
        ts1.setIndicator("맛집찾기");
        ts1.setContent(R.id.맛집찾기);
        tab_host.addTab(ts1);

        TabHost.TabSpec ts2 = tab_host.newTabSpec("동행찾기");
        ts2.setIndicator("동행찾기");
        ts2.setContent(R.id.동행찾기);
        tab_host.addTab(ts2);


        tab_host.setCurrentTab(0);


        partner_write=findViewById(R.id.partner_write);
        partner_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PartnerWriteActivity.class);

                startActivity(intent);
                finish();



            }
        });
        //네비
        nv_res1=findViewById(R.id.nv_res1);
        nv_res2=findViewById(R.id.nv_res2);
        nv_res3=findViewById(R.id.nv_res3);

        //
        res_linearsw1=findViewById(R.id.res_linearsw1);
        res_linearsw2=findViewById(R.id.res_linearsw2);
        chabutton=findViewById(R.id.chabutton);
        res_linearsw2.setVisibility(View.GONE);
//



        chabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChattingStartActivity.class);

                startActivity(intent);
                finish();



            }
        });


        res_gaejang=findViewById(R.id.res_gaejang);





        res_gaejang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res_linearsw1.setVisibility(View.GONE);
                res_linearsw2.setVisibility(View.VISIBLE);



            }
        });

        resbak=findViewById(R.id.resbak);

        resbak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res_linearsw1.getVisibility()==View.VISIBLE){
                    finish();
                }else{
                    res_linearsw1.setVisibility(View.VISIBLE);
                    res_linearsw2.setVisibility(View.GONE);

                }

            }
        });


        //채팅
        nv_res1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        //

        //홈
        nv_res2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intent);
                finish();

            }
        });

        //내정보
        nv_res3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MypageiActivity.class);

                startActivity(intent);

                finish();
            }
        });


    }

}