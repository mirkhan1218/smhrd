package com.khan.ex1011;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView tv_kakao;
    TextView tv_call;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // textview 선택하면 카카오 페이지 띄우기!
        // => textview 선택? => 클릭 이벤트가 연결되어 있다는 뜻!
        // 클릭이벤트 연결하는 방법 중 onclick 속성을 사용해 보았다...!
        // 오늘은 다른 방식으로 해보자...!

        // 1. 이벤트를 걸어주고 싶은 view를 찾아온다.
        tv_kakao = findViewById(R.id.tv_kakao);
        tv_call = findViewById(R.id.tv_call);
        btn_login = findViewById(R.id.btn_login);

        // 2. 속성 중 onClickListener를 사용하여 이벤트 처리를 해준다.
        // => Listener는 이벤트를 감지하는 개체!
        // => 종류가 엄청나게 많다!

        tv_kakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // 이벤트처리 메소드!
                // OnClickListener라는 인터페이스
                // 인터페이스란?
                // 상수, 추상메소드만 작성하는 설계도!
                // 추상메소드란? => 세부적인 알고리즘을 설계하지 앖습니다.
                // 알고리즘 설계 (오버라이딩)의 책임은 하위클래스에게 있습니다.
                // => 추상메소드를 포함하고 있는 클래스를 상속받을 때는 반드시 오버라이딩 해야함!
                // => 구현의 강제성!

                // Intent 사용해서 카카오 페이지 띄워주자!
                Intent intent_kakao = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kakaocorp.com/page/"));

                startActivity(intent_kakao);
            }
        });

        tv_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 전화걸기!
                // 전화를 건다는 건 Android 입장에서 상당히 민감한 작업
                // 보안문제!
                // 권한(permission)을 요청하는 작업이 필요함
                // AndroidManifest.xml에서 작업
                if (ActivityCompat.checkSelfPermission(getApplicationContext(),
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    // 현재 CALL_PHONE 권한이 없다면!

                    ActivityCompat.requestPermissions(LoginActivity.this,
                            new String[]{Manifest.permission.CALL_PHONE}, 0);
                }
                Intent intent_call = new Intent(Intent.ACTION_CALL, Uri.parse("tel:01043939206")); // key:value -> mine type 데이터 형태 대표적으로 JSON

                startActivity(intent_call);
            }
        });

        // 로그인 버튼에 이벤트 리스너 걸어주세요!
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_next = new Intent(LoginActivity.this, MainActivity.class);
                intent_next.putExtra("temp", "미리칸");

                startActivity(intent_next);
                // task에 activity를 추가하는 명령!
            }
        });


    }
}