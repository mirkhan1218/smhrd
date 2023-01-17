package com.khan.ex1014;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button btnCamera;
    Button btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // OnClick
        // 1. 속성에서 이벤트 함수 달아주기
        // 2. SetOnclickListener 달아주기 ***
        // 3. ramda expression

        btnCamera = findViewById(R.id.btnCamera);
        btnCamera.setOnClickListener( view -> {

            // 버튼 눌렀을 때 가상 카메라로 이동할 수 있는 인텐트 생성
            // Intent(액션)
            // Intent(액션, 데이터) ---> Call, 전화번호
            Intent intentCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            // CAMERA_SERVICE
            startActivity(intentCamera);
        });

        btnMap = findViewById(R.id.btnMap);
        // googleMap
        // 위치 위도 35.14670147841655 경도 126.92215633785938
        btnMap.setOnClickListener( view -> {
            // 데이터 만들기 (googlemap + 위도 + 경도 주소)
            // Uri.Parse
            Uri uri = Uri.parse("http://google.com/maps?q="+ 35.14670147841655 + "," + 126.92215633785938);
            Intent intentMap = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(intentMap);
        });

    }
}