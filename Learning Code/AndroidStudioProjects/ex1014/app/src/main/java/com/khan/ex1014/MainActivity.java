package com.khan.ex1014;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // id값을 초기화 시켜주기
    // tvScore1,2, imgDice1,2, btnShake
    TextView tvScore1;
    TextView tvScore2;

    ImageView imgDice1;
    ImageView imgDice2;

    Button btnShake;

    int score1 = 0;
    int score2 = 0;

    // img를 담을 배열 R.drawable.__ ---> int(id값)
    int[] imgs = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
            R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScore1 = findViewById(R.id.tvScore1);
        tvScore2 = findViewById(R.id.tvScore2);

        imgDice1 = findViewById(R.id.imgDice1);
        imgDice2 = findViewById(R.id.imgDice2);

        btnShake = findViewById(R.id.btnShake);
        // imgDice1,2 이미지를 랜덤으로 바꿔주고 싶다
        // img1.png에 있는 숫자에 랜덤숫자를 줄 수 없다
        // 해결방법! --> img들이 담길 수 있는 배열을 만들어서 인덱스 값에 랜덤으로 접근하자

        // button에 OnclickListener 달아주기
        btnShake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1-1) 랜덤한 두 수를 생성(0~5)
                // Random rd = new Random();
                Random rd;
                rd = new Random();

                // 1-2) num1, num2에 저장( 1-1)에서 생성한 랜덤수 )
                int num1 = rd.nextInt(6);
                int num2 = rd.nextInt(6);

                // 2-1) 만약, 랜덤한 숫자 2개가 1,3이라면
                // 첫 번쨰, imgDice1을 imgs[1]로 세팅 ---> 눈금이 2
                // imgDice2를 imgs[3]으로 세팅 ---> 눈금이 4
                imgDice1.setImageResource(imgs[num1]);
                imgDice2.setImageResource(imgs[num2]);

                // 어떤 눈금이 더 큰지 판단
                // 인덱스값을 활용해서 판단할 수 있다
                // 더 큰 주사위의 점수를 +1
                // 만약에 동점
                // 토스트로 "동점입니다"라는 문구를 띄워주자!
                if (num1 > num2) {
                    score1 ++;
                    tvScore1.setText(score1+"");
                } else if (num1 < num2) {
                    score2 ++;
                    tvScore2.setText(score2+"");
                } else {
                    Toast.makeText(
                           MainActivity.this,
                            "동점입니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}