package com.khan.ex1007;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView img_view;
    int[] imgs;
    int currentImg = 0; // 현재 이미지의 번호!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgs = new int[]{R.drawable.image1, R.drawable.image2, R.drawable.image3};

        // 이미지뷰 찾아오기!
        img_view = findViewById(R.id.img_view);

        // img_view.setImageResource(imgs[currentImg]);
        // 버튼 눌렀을 때 이미지 바꾸기!
        // 버튼 눌렀을 때
    }

    // 이벤트 메소드 설계하기
    public void myClick(View currentEvent){
        // 이미지 리소스에 순서(인덱스)를 부여하기 위해 배열을 활용
        switch (currentEvent.getId()){
            case R.id.btn1:
                currentImg = 0; break;
            case R.id.btn2:
                currentImg = 1; break;
            case R.id.btn3:
                currentImg = 2; break;
            case R.id.btn_next:
                if (currentImg == imgs.length-1){
                    currentImg = 0;
                }else{
                    currentImg ++;
                } break;
            case R.id.btn_pre:
                if (currentImg == 0){
                    currentImg = imgs.length-1;
                }else{
                    currentImg --;
                }
        }
        Log.v("curIdx",currentImg+"");
        
        // Toast 띄우는 명령어
        if(currentImg == 0 || currentImg == imgs.length-1){
            Toast.makeText(
                    getApplicationContext(),
                    "마지막 이미지 입니다",
                    Toast.LENGTH_LONG).show();
        }
        img_view.setImageResource(imgs[currentImg]);
    }
}