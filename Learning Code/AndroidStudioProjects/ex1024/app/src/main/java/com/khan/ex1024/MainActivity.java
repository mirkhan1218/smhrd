package com.khan.ex1024;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MessageVO> kavos;
    RecyclerView rev;
    EditText edtMess;
    Button btnSend;

    KakaoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rev = findViewById(R.id.recycleView);
        btnSend = findViewById(R.id.btnSend);
        edtMess = findViewById(R.id.tvMess);

        kavos = new ArrayList<>();

        MessageVO kavo1 = new MessageVO("김대웅","안녕하세요~","오후 4:08", R.drawable.img3, "");
        MessageVO kavo2 = new MessageVO("양진이", ".....", "오후 4:12", R.drawable.img2, "");
        MessageVO kavo3 = new MessageVO("미리칸", "다들 오늘 저녁에 뭐해?", "오후 4:43", R.drawable.img1, "1");
        MessageVO kavo4 = new MessageVO("정연승", "저는 콜입니다", "오후 4:46", R.drawable.img5, "3");
        MessageVO kavo5= new MessageVO("장해라", "오빠 저도 좋아요", "오후 4:52", R.drawable.img4, "3");

        kavos.add(kavo1);
        kavos.add(kavo2);
        kavos.add(kavo3);
        kavos.add(kavo4);
        kavos.add(kavo5);

        // 남이 보낸 카톡은 왼쪽에! (왼쪽 View를 VISIBLE)
        // 내가 보낸 카톡은 오른쪽에! (오른쪽 View를 VISIBLE)
        // ListView의 항목을 그리는 작업은 Adapter에서 함! (setText, setOnClickLister 등등...)
        // => VISIBLE도 Adapter에서 해야함!
        // => Adapter에서 현재 로그인(아직 구현 안했음)한(이 메세지의 주인) name을 알아야 함!
        // 그래야 이 메세지를 왼쪽에 띄울건지 오른쪽에 띄울건지 결정할 수 있음!

        String name = "미리칸";

        adapter = new KakaoAdapter(kavos, getApplicationContext(), name);
        rev.setAdapter(adapter);
        rev.setLayoutManager(new LinearLayoutManager(this));

        // send 버튼 눌렀을 때 rev에 데이터 추가!
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtMess.getText().toString().equals("")){
                    kavos.add(new MessageVO("미리칸",edtMess.getText().toString(),"",0,"5"));

                    adapter.notifyDataSetChanged(); // adapter 새로고침
                    rev.smoothScrollToPosition(kavos.size()-1); // 스크롤의 위치를 가장 마지막 메세지 인덱스로 변경!
                    edtMess.setText("");
                }
            }
        });
    }
}