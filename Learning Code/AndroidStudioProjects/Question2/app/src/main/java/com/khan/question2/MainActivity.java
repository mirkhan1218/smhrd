package com.khan.question2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img_view;
    int[] imgs;
    int currentImg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgs = new int[]{R.drawable.img1, R.drawable.img2, R.drawable.img3};
    }
    public void myClick(View currentEvent){
        // 이미지 리소스에 순서(인덱스)를 부여하기 위해 배열을 활용
        switch (currentEvent.getId()){
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
        img_view.setImageResource(imgs[currentImg]);
    }
}