package com.example.hoeattest;

import android.os.Bundle;
import android.widget.TabHost;
import androidx.appcompat.app.AppCompatActivity;
public class RestaurantActivity extends AppCompatActivity {

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

    }

}