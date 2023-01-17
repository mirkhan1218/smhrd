package com.khan.ex1017;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNext;
    ConstraintLayout cl;

    // final 키워드
    // 1. 변수앞에 있으면? => 상수
    final int REQUEST_BACKGROUND = 1;
    // 2. 메소드 앞에 있으면? => 오버라이딩(재정의) 불가능
    // 3. 클래스 앞에 있으면? => 상속 불가능

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = findViewById(R.id.btnNext);
        cl = findViewById(R.id.cl);

        // btnNext 누르면 SubActivity로 이동~
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_next = new Intent(MainActivity.this, SubActivity.class);

                // startActivity는 단방향!
                // 가긴가는데 결과를 위해서 갈거임!
                // 두번째 매개변수 => 갔다 왔을 때 갤러리를 실행시켰다가 온건지, 카메라를 실행시켰다가 온건지
                // 구분하기 위한 코드값!
                startActivityForResult(intent_next, REQUEST_BACKGROUND);
            }
        });
    }

    // 돌아왔을 떄 실행되는 메소드 정의!
    // 메소드 오버라이딩 => onActivityResult
    // Alt + Insert -> Override Method -> onActivityResult

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){ // 처리가 잘 되었다면
            if(requestCode == REQUEST_BACKGROUND){ // 왜 갔다 온건지
                String result = data.getStringExtra("color");

                // 직접해보기!
                // 1. ConstraintLayout 을 find한다.

                // 2. result값에 따라서 Layout의 속성을 바꾼다.
//                switch (result){
//                    case "Red":
//                        result = "#FF0000";
//                        break;
//                    case "Green":
//                        result = "#00FF00";
//                        break;
//                    case "Blue":
//                        result = "#0000FF";
//                        break;
//                }
                // 2-1. 속성명 : BackGroundColor
                cl.setBackgroundColor(Color.parseColor(result));
            }
        }
    }
}