package com.example.hoeattest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;
import android.widget.Toast;



public class MbtiResultActivity extends AppCompatActivity {

    private int E;
    private int I;
    private int S;
    private int N;
    private int T;
    private int F;
    private int J;
    private int P;

    TextView mbti,mbtito,mbtisuggestion;
    Button MbtiStartButton;
    private String a;
    private String b;
    private String c;
    private String d;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbtiresult);
        Intent intent = getIntent();
        E=intent.getIntExtra("E",0);
        I=intent.getIntExtra("I",0);
        S = intent.getIntExtra("S", 0);
        N = intent.getIntExtra("N", 0);
        T = intent.getIntExtra("T", 0);
        F = intent.getIntExtra("F", 0);
        J = intent.getIntExtra("J", 0);
        P = intent.getIntExtra("P", 0);


        if(E>=2){
            a="E";
        }else{
            a="I";
        }
        if(N>=2){
            b="N";
        }else{
            b="S";
        }
        if(F>=2){
            c="F";
        }else{
            c="T";
        }
        if(N>=2){
            d="P";
        }else{
            d="j";
        }

//        mbti=findViewById(R.id.mbti);
//        MbtiStartButton=findViewById(R.id.MbtiStartButton);
//        mbtito=findViewById(R.id.mbtito);
//        mbtisuggestion=findViewById(R.id.mbtisuggestion);
//
//        mbti.setText(a+b+c+d);
//        if(mbti.getText().equals("INFP")){
//            mbtisuggestion.setText("ENFJ, ENTJ");
//        }else if(mbti.getText().equals("ENFP")) {
//            mbtisuggestion.setText("INFJ, INTJ");
//        }else if(mbti.getText().equals("INFJ")) {
//            mbtisuggestion.setText("ENFP, ENTP");
//        }else if(mbti.getText().equals("ENFJ")) {
//            mbtisuggestion.setText("INFP, ISFP");
//        }else if(mbti.getText().equals("INTJ")) {
//            mbtisuggestion.setText("ENFP, ENTP");
//        }else if(mbti.getText().equals("ENTJ")) {
//            mbtisuggestion.setText("INFP, INTP");
//        }else if(mbti.getText().equals("INTP")) {
//            mbtisuggestion.setText("INFJ, INTJ");
//        }else if(mbti.getText().equals("ENTP")) {
//            mbtisuggestion.setText("INFJ, ESFJ, ESTJ");
//        }else if(mbti.getText().equals("ISFP")) {
//            mbtisuggestion.setText("ISFJ, ISTJ");
//        }else if(mbti.getText().equals("ESFP")) {
//            mbtisuggestion.setText("ISFJ, ISTJ");
//        }else if(mbti.getText().equals("ISTP")) {
//            mbtisuggestion.setText("INFJ, ESFJ, ESTJ");
//        }else if(mbti.getText().equals("ESTP")) {
//            mbtisuggestion.setText("ISFJ, ISTJ");
//        }else if(mbti.getText().equals("ISFJ")) {
//            mbtisuggestion.setText("ESFP, ESTP");
//        }else if(mbti.getText().equals("ESFJ")) {
//            mbtisuggestion.setText("ISFP, ISTP");
//        }else if(mbti.getText().equals("ISTJ")) {
//            mbtisuggestion.setText("ESFP, ESTP");
//        }else if(mbti.getText().equals("ESTJ")) {
//            mbtisuggestion.setText("INTP, ISFP, ISTP");
//        }

        MbtiStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userMbti = "INFP";
                String userID = "a";
                Response.Listener<String> responseListener = new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");


                            if (success) { // 수정에 성공한 경우
                                Toast.makeText(getApplicationContext(),"수정에 성공하였습니다.",Toast.LENGTH_SHORT).show();
                            }else{
                                Toast.makeText(getApplicationContext(),"수정에 실패하였습니다.",Toast.LENGTH_SHORT).show();
                                return;
                            }
                        }catch(JSONException e){
                            e.printStackTrace();
                        }
                    }
                };
                MbtiRequest MbtiRequest = new MbtiRequest(userMbti, userID, responseListener);
                RequestQueue queue = Volley.newRequestQueue(MbtiResultActivity.this);
                queue.add(MbtiRequest);

            }
        });





    }
}