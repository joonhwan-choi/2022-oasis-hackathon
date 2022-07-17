package com.example.hoeattest;



import android.view.View;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LoginRequest extends StringRequest {

    // 서버 URL 설정 ( PHP 파일 연동 )
    final static private String URL = "http://222.105.251.88:15100/login.php";
    private Map<String, String> map;


    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword", userPassword);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}


//    View db_1 = (View) findViewById(R.id.bb_1) ;
//        db_1.setOnClickListener(new Button.OnClickListener() {
//@Override
//public void onClick(View view) {
//        Intent intent = new Intent(
//        getApplicationContext(), // 현재 화면의 제어권자
//        HomeActivity.class); // 다음 넘어갈 클래스 지정
//        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        startActivity(intent); // 다음 화면으로 넘어간다
//        }
//        });
//        View db_2 = (View) findViewById(R.id.bb_2) ;
//        db_2.setOnClickListener(new Button.OnClickListener() {
//@Override
//public void onClick(View view) {
//        Intent intent = new Intent(
//        getApplicationContext(), // 현재 화면의 제어권자
//        LikeView.class); // 다음 넘어갈 클래스 지정
//        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        startActivity(intent); // 다음 화면으로 넘어간다
//        }
//        });
//        View db_3 = (View) findViewById(R.id.bb_3) ;
//        db_3.setOnClickListener(new Button.OnClickListener() {
//@Override
//public void onClick(View view) {
//        Intent intent = new Intent(
//        getApplicationContext(), // 현재 화면의 제어권자
//        TMapViewView.class); // 다음 넘어갈 클래스 지정
//        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        startActivity(intent); // 다음 화면으로 넘어간다
//
//
//        }
//        });
//        View db_4 = (View) findViewById(R.id.bb_4) ;
//        db_4.setOnClickListener(new Button.OnClickListener() {
//@Override
//public void onClick(View view) {
//        Intent intent = new Intent(
//        getApplicationContext(), // 현재 화면의 제어권자
//        MyView.class); // 다음 넘어갈 클래스 지정
//        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        startActivity(intent); // 다음 화면으로 넘어간다
//
//        }
//        });