package com.khan.ex1020;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final int REQUEST_ADD = 1;
    // 템플릿, 데이터, 어뎁터

    // DirectVO 객체를 저장하는 ArrayList 생성하고
    // 데이터 3개 저장~
    ArrayList<DirectVO> dvoList;
    RecyclerView rcv;
    Button btnAdd;

    DirectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.recyclerView);
        btnAdd = findViewById(R.id.btnAdd);

        dvoList = new ArrayList<>();

        // 객체를 생성할때 생성자가 호출이 되는데 생성자 매서드에 매개변수가 2개 있으니 타입과 개수를 맞춰서 넣어줘야한다
        // 생성자로 필드값 초기화 하는 경우 => 객체 생성될 때 꼭 값이 필요한 변수에 대해서!
        // setter로 필드값 초기화 하는 경우 => 수정이 필요한 변수에 대해서!
        DirectVO dvo1 = new DirectVO("네이버", "https://www.naver.com");
        DirectVO dvo2 = new DirectVO("구글", "https://www.google.com");
        DirectVO dvo3 = new DirectVO("유튜브", "https://www.youtube.com");

        dvoList.add(dvo1);
        dvoList.add(dvo2);
        dvoList.add(dvo3);

        adapter = new DirectAdapter(dvoList, getApplicationContext());
        rcv.setAdapter(adapter);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        // 어뎁터 구현하기
        // BaseAdapter(RecyclerView에서 제공해주는 추상클래스) 상속받아 구현!
        // ViewHolder 클래스(객체)를함께 구현해야함!

        // RecyclerView에 Adapter 연결!

        // ADD기능 구현하기!

        // 1. Activity 새로 만들기 (EditText * 2, Button * 1)
        // 2. Add 버트에 이벤트 리스너 달기
        // 3. Intent 사용해서 두번째 Activity로 이동하기
        // 4. 이동해서 title과 address 입력하고 버튼 클릭하면 다시 MainActivity로 돌아오기
        // 5. 돌아왔을 때 title과 addressr값을 RecyclerView에 추가하기

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, AddActivity.class),
                        REQUEST_ADD);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            if(requestCode == REQUEST_ADD){
                dvoList.add(new DirectVO(data.getStringExtra("addName"),data.getStringExtra("addUrl")));

                adapter.notifyDataSetChanged();

            }
        }
    }
}