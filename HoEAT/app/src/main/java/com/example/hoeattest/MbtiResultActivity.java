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

        int TT= E+I+S+N+T+F+J+P;
        Toast.makeText(getApplicationContext(),TT+"",Toast.LENGTH_SHORT).show();

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
            d="J";
        }





    mbtisuggestion=findViewById(R.id.mbtisuggestion);
    mbti=findViewById(R.id.mbti);
    mbtito = findViewById(R.id.mbtito);

    mbti.setText(a+b+c+d);

    if(mbti.getText().equals("INFP")){
        mbtisuggestion.setText("ENFJ, ENTJ");
        mbtito.setText("최악의 상황에도 긍정적으로 더 나은 상황을 만들고자 노력, 높은 인내심으로 고난이도 여행지를 소화하기 충분하다.");
    }else if(mbti.getText().equals("ENFP")){
        mbtisuggestion.setText("ISFJ, INTJ");
        mbtito.setText("사람들과 어울리기를 좋아하는 인싸. 액티비티 선호하는 즉흥적인 스타일의 여행자로 에너자이저의 면모를 지님.");
    }else if(mbti.getText().equals("INFJ")){
        mbtisuggestion.setText("ENFP, ENTP");
        mbtito.setText("새로운 사람과 스스럼없이 어울리지만 사실 혼자만의 시간을 중요하게 여기는 타입.");
    }else if(mbti.getText().equals("ENFJ")){
        mbtisuggestion.setText("INFP, INTP");
        mbtito.setText("사람을 좋아해 소통하는 여행을 추구하며 언어가 통하지 않아도 의사소통을 하는 신박한 능력을 보임. 지역별 시장을 돌며 현지 분들과 친밀도 업하기 최적화된 타입.\n");
    }else if(mbti.getText().equals("INTJ")){
        mbtisuggestion.setText("ENFP, ENTP");
        mbtito.setText("철두철미하게 미리 계획을 세우며 박물관, 미술관 등에서 깊고 넓은 지식을 쌓는 데 즐거움을 느낌");
    }else if(mbti.getText().equals("ENTJ")){
        mbtisuggestion.setText("INFP, INTP");
        mbtito.setText("동행 중에서 리더 격으로 여행을 이끌며 동행에게 알맞은 역할을 부여, 효율적인 여행을 이끌어 냄.");
    }else if(mbti.getText().equals("INTP")){
        mbtisuggestion.setText("ENTJ, ESTJ");
        mbtito.setText("철학, 사색, 아이디어에 목마른 여행자 타입, 무언가 생각할 수 있게 하는 여행지로 향해 사색에 빠져 보길.");
    }else if(mbti.getText().equals("ENTP")){
        mbtisuggestion.setText("INFJ, INTJ");
        mbtito.setText("느긋하고 관대한 타입. 위기 상황에서 판단을 잘하며 선입견 없이 여행을 즐김. ");
    }else if(mbti.getText().equals("ISFP")){
        mbtisuggestion.setText("INFJ, ESFJ, ESTJ");
        mbtito.setText("새로운 것을 시도할 준비가 된 예술가 타입의 여행자. 다만 종종 혼자만의 느긋한 시간 추구");
    }else if(mbti.getText().equals("ESFP")){
        mbtisuggestion.setText("ISFJ, ISFJ");
        mbtito.setText("즉흥적인 즐거움을 추구하며 스포트라이트를 즐기는 여행자. 시끌벅적한 분위기에서 에너지 상승!");
    }else if(mbti.getText().equals("ISTP")){
        mbtisuggestion.setText("INFJ, ESFJ, ESTJ");
        mbtito.setText("현실적이지만 대담한 스타일! 예기지 못한 상황도 무난히 해결하는 융통성 있는 여행자");
    }else if(mbti.getText().equals("ESTP")){
        mbtisuggestion.setText("ISFJ, ISTJ");
        mbtito.setText("먹고 놀고 휴식하기 등 동시에 다양한 니즈를 만족시킬 수 있는 여행지 선호");
    }else if(mbti.getText().equals("ISFJ")){
        mbtisuggestion.setText("ESFP, ESTP");
        mbtito.setText("계획적으로 움직이며, 동행을 챙기는 스타일의 여행자. 감성적이며 가성비 좋은 여행지 추천! 적은 동선으로 여행하기 편한 여행지 선호");
    }else if(mbti.getText().equals("ESFJ")){
        mbtisuggestion.setText("ISFP, ISTP");
        mbtito.setText("동행을 세심하게 배려하는 타입. 예기치 못한 상황에 걱정이 많은 편이라 굳이 체력을 소모하는 여행지보다는 여행 코스짜기 명확하고 쉬운 여행지 추천");
    }else if(mbti.getText().equals("ISTJ")){
        mbtisuggestion.setText("ESFP, ESTP");
        mbtito.setText("계획적으로 움직이며 꼼꼼하게 여행지에 대해 공부해가는 타입. 장기 유럽 여행도 무리없이 소화 가능하며 유적이 많은 여행지 역사 탐방을 즐기는 타입");
    }else if(mbti.getText().equals("ESTJ")){
        mbtisuggestion.setText("INTP, ISFP, ISTP");
        mbtito.setText("호불호가 확실하며 깔끔하게 짜여지는 여행 스타일 선호. 2순위 선택지는 다양하게 준비되어야 불안하지 않는 타입. (지금 이거 안맞다고 할 가능성 큼)");
    }


    }
}