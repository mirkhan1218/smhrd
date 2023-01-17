package com.khan.ex1102;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Fragment_3 extends Fragment {

    final String[] tags = {"on", "off"};

    ImageView[] imgs = new ImageView[9];

    TextView tv_score;
    TextView tv_timer;

    private  int score;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_3, container, false);

        score = 0;

        tv_score = view.findViewById(R.id.tv_score);
        tv_timer = view.findViewById(R.id.tv_time);

        for (int i = 0; i < imgs.length; i++){
            int resId = getResources().getIdentifier("img_" + (i+1),"id", getActivity().getPackageName());

            imgs[i] = view.findViewById(resId);
            imgs[i].setImageResource(R.drawable.off);

            new DoThread(imgs[i]).start();

            imgs[i].setTag("off");

            imgs[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // 두더지 클릭했을 때!
                    // 현재 이미지뷰에 set 되어있는 리소스 가지고 오는 기능은 없음 ㅠㅠ
                    // View 에 태그를 달아서 구분하는 방법!

                    if (view.getTag().toString().equals("on")){
                        // 올라온 두더지 잡았다!
                        score++;
                        view.setTag(tags[1]);
                    }else {
                        score--;
                    }
                    tv_score.setText(score+"");
                }
            });
        }
        
        return view;
    }

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);

            // 두더지 바꾸려면 어떻게 써야함?
            // 다 했으면 Thread 실행시켜서 두더지들 다 올라오게 해주세염!
            ((ImageView)(msg.obj)).setImageResource(msg.arg1);
            ((ImageView)(msg.obj)).setTag(tags[msg.arg2]);
        }
    };

    // 두더지 움직이는 Thread 설계!
    class DoThread extends Thread{
        // 이 클래스가 하는 일!
        // ImageView 전달(생성자)받아서 on 이미지 리소스 (int) /off (int) 로 바꿔줌!
        // => 랜덤한 규칙에 따라서!

        private ImageView dodo; // 담당두더지

        public DoThread(ImageView dodo){
            this.dodo = dodo;
        }

        @Override
        public void run() {

            while (true){
                int offTime = new Random().nextInt(5000) + 500; // 0.5~ 5.5 사이

                try {
                    Thread.sleep(offTime);
                    // offTime 만큼 쉬었다~ 이미지 on 으로 바꿔야한다!
                    // 하지만! 여긴 SubThread 라서 이미지 함부로 못바꿈!
                    // Handler 한테 요청해야함!

                    Message msg = new Message();
                    msg.obj = dodo;
                    msg.arg1 = R.drawable.on;
                    msg.arg2 = 0; // 태그도 on 으로 바꿔주기~

                    handler.sendMessage(msg);

                    // 올라와있는 채로 조금 기다리기!
                    int onTime = new Random().nextInt(1000)+500; // 0.5 ~ 1.5초 사이

                    Thread.sleep(onTime);

                    // off로 바꿔달라고 Handler한테 요청하기!
                    // ★ 한 번 전송한 Message 는 재사용 할 수 없음~!
                    msg = new Message();
                    msg.obj = dodo;
                    msg.arg1 = R.drawable.off;
                    msg.arg2 = 1; // 태그 off로 바꾸기

                    handler.sendMessage(msg);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}