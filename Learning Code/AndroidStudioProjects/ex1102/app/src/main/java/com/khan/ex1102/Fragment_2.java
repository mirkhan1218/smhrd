package com.khan.ex1102;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment_2 extends Fragment {

    TextView tv_num1;
    TextView tv_num2;
    Button btn_start1;
    Button btn_start2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_2, container, false);

        tv_num1 = view.findViewById(R.id.tv_num1);
        tv_num2 = view.findViewById(R.id.tv_num2);
        btn_start1 = view.findViewById(R.id.btn_start1);
        btn_start2 = view.findViewById(R.id.btn_start2);

        // 1. Thread 는 클래스로 설계해놓고 객체 생성해서 실행시킨다!
        // 2. Thread 는 절대절대 스스로 무한반복하지 않는다!

        btn_start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimeThread th = new TimeThread(tv_num1);
                th.start();
            }
        });

        btn_start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimeThread th = new TimeThread(tv_num2);
                th.start();
            }
        });

        return view;
    }

    // Handler 설계
    Handler handler = new Handler(){
        // MainThread 에 메세지 전송! (subThread 한테 요청받아서)

        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            // subThread 가 메세지 보내면 받아서 처리하는 메소드!

            // ★★★ 뭐라고 써야 tv_num에 숫자가 써질까요
            ((TextView)(msg.obj)).setText(msg.arg1+"");
        }
    };

    // 보통 Thread 는 따로 java 파일 생성해서 설계하기도 하지만
    // Android 에서는 java 파일을 많이 생성하면 헷갈릴 수 있어서 InnerClass 로 설계한다!
    class TimeThread extends Thread {
        // Runnable 라는 인터페이스를 구현(implements) 해서 설계하는 방법도 있음!

        // msg 는 객체 생성할 때 결정될 것임
        private TextView tv_num; // 이 Thread 가 숫자를 적어야하는 TV
        // 유연한 코드~ 설계는 추상적으로~
        // TextView 언제결정? 객체생성할 때!
        // 이걸 가능하게 하는건 뭐? 생성자 메소드!

        public TimeThread(TextView tv_num){
            this.tv_num = tv_num;
        }

        @Override
        public void run() {
            // start() -> run() -> destroy()
            // 1. start() 메소드는 Thread 실행시킬 때 호출한다! ★ 이 메소드 내에서 run() 을 호출한다.
            // 시작하기위한 모든 준비를 한다!

            for(int i = 10; i >= 0; i--){
                Message msg = new Message(); // Handler 한테 보낼 메세지
                msg.obj = tv_num; // 어디다가 써야하는지
                msg.arg1 = i; // 뭐라고 쓸건지

                handler.sendMessage(msg);

                // 1초 쉬기
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}