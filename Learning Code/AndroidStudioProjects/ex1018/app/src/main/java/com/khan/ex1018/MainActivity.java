package com.khan.ex1018;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final int REQUEST_LOGIN = 1;
    final int REQUEST_WRITE = 2;

    TextView tvName;
    ListView list_board;
    Button btnLogin;
    Button btnWrite;

    String nick;

    // 문자열을 저장할 수 있는 ArrayList 생성하고
    ArrayList<String> data;
    ArrayAdapter<String> adapter;

    // 메소드 호출은 메소드 안에서만 가능하다!!


    // 글작성 버튼 누르면 작성페이지 이동했다가
    // 작성한 글 가지고 돌아오기!
    // 게시판 ListView에 추가~
    // 1. 글작성 버튼에 이벤트 리스너 추가하기
    // 2. Intent 사dydgotj startActivityForResult로 실행시키기!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        btnWrite = findViewById(R.id.btnWrite);
        tvName = findViewById(R.id.tvName);
        list_board = findViewById(R.id.listCon);

        // 게시판 글 5개 저장하기
        data = new ArrayList<>();
        data.add("1. Android 짱 재밌음");
        data.add("2. 미리칸 생일은 12월 18일");
        data.add("   └> 그래서 어떡하라고~");
        data.add("   └> 그냥 그렇다고 ");
        data.add("3. 택배 도착했을까?");

        adapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.templete, data);

        // 템플릿, 데이터, 어뎁터도 만들어졌으면!
        // 만들어진 어뎁터를 ListView에 연결한다!

        list_board.setAdapter(adapter);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnLogin.getText().toString().equals("로그인")){
                    Intent intent_login = new Intent(MainActivity.this, LoginActivity.class);

                    startActivityForResult(intent_login, REQUEST_LOGIN);
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("로그아웃");
                    builder.setMessage("로그아웃 하시겠습니까?");
                    builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            btnLogin.setText("로그인");
                            btnWrite.setEnabled(false);
                            btnWrite.setBackgroundColor(Color.parseColor("#C3C3C3"));
                            tvName.setText("글 작성은 로그인 후 가능합니다.");
                        }
                    });
                    builder.setPositiveButton("CANCLE", null);
                    builder.create().show();
                }
            }
        });

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivityForResult(new Intent(MainActivity.this, WriteActivity.class),
                       REQUEST_WRITE);
            }
        });
    } // end onCreate

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            if(requestCode == REQUEST_LOGIN){
                nick = data.getStringExtra("nick");

                tvName.setText(nick+"님 환영합니다.");
                btnWrite.setEnabled(true);
                btnWrite.setBackgroundColor(Color.parseColor("#F44336"));
                btnLogin.setText("로그아웃");
            }else if(requestCode == REQUEST_WRITE){
                // write하고 왔으면 ListView에 데이터 추가!
                this.data.add(data.getStringExtra("content"));
                adapter.notifyDataSetChanged(); // adapter 새로고침하는 코드!

            }
        }
    }
}