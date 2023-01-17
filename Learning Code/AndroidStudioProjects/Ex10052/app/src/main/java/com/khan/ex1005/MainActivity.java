package com.khan.ex1005;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_text;
    @Override
    // Activity(화면) 실행될 때 최초 딱 한번 호출되는 메소드 - Activity 생명주기
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ★★★★★ xml과 Java를 연결하는 코드
        // findViewById는 이 코드 아래에 써야함!
        setContentView(R.layout.activity_main);

        tv_text = findViewById(R.id.tv_text);

        // 1. xml 파일의 view에 id값 지정하기
        // 2. view 찾아오기!

//        // 3. 메소드 호출해서 속성값 지정하기
//        tv_text.setTextColor(Color.parseColor("#990085"));
//        tv_text.setText("안녕하세요!");
//        tv_text.setTextSize(22);

    }

    // 이벤트 처리하는 방법!
    // - 버튼을 터치했을 때 TextView의 속성을 바꿔보자!
    // 1. 이벤트 메소드 설계하기
    // 2. 메소드 연결하기
    public void myClick(View currentEvent){
            if (tv_text.getText().equals("안녕하세요!")) {
                tv_text.setText("Hello World!");
            } else if (tv_text.getText().equals("Hello World!")) {
                tv_text.setText("안녕하세요!");
            }
            tv_text.setTextColor(Color.parseColor("#990085"));
            tv_text.setTextSize(22);
    }
}