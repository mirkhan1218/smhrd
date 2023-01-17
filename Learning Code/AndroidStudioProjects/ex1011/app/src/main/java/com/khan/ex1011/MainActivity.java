package com.khan.ex1011;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView img_logo;
    TextView tv_kakao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_logo = findViewById(R.id.img_logo);
        tv_kakao = findViewById(R.id.tv_kakao);

        String temp = getIntent().getStringExtra("temp");
        tv_kakao.setText(temp);

        // logo 이미지 클릭시 다시 로그인 페이지로 이동하기
        img_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 현재 activity만 삭제하는 명령!
                finish();
            }
        });

    }
}