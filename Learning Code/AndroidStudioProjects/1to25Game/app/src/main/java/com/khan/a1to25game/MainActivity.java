package com.khan.a1to25game;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // 버튼 for문 사용하여 findViewById 진행!
    Button[] btns;
    int[] nums;
    Random rd;
    Chronometer timer;
    int currentIndex = 1;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btns = new Button[25];
        nums = new int[25]; // 현재 0들이 들어있는 nums 배열에 랜덤 숫자 25개 세팅! 중복 x
        rd = new Random();
        num = 0;

        timer = findViewById(R.id.timer);

        // 1. 이중for문
        /*for (int j = 0 ; j < nums.length; j++) {
            nums[j] = rd.nextInt(25) + 1;
            for (int i = 0 ; i < j; i++) {
                if (nums[j] == nums[i]) {
                    j--;
                    break;
                }
            }
        }*/

        // 2. ArrayList
        // 1 ~ 25까지 들어있는 ArrayList 생성!
        /*ArrayList<Integer> cards = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            cards.add(i+1);
        }
        // 카드 다 만들고
        // 카드 뽑아서 nums에 넣고 지원버리는 반복문
        for (int i = 0; i < nums.length; i++) {
            int ranCard = new Random().nextInt(cards.size()); // 남아있는 카드의 개수 중 하나

            nums[i] = cards.get(ranCard);
            cards.remove(ranCard);
        }*/

        // 3. 치환하기
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        for (int i = 0; i < 100; i++) {
            int ranInx1 = new Random().nextInt(nums.length);
            int ranInx2 = new Random().nextInt(nums.length);

            int temp = nums[ranInx1];
            nums[ranInx1] = nums[ranInx2];
            nums[ranInx2] = temp;
        }

        for (int i = 0 ; i < btns.length; i++) {
            // 내가 찾고 싶은 버튼의 id (int) 알아내자!
            // id(string) => id(int-주소)
            int resId = getResources().getIdentifier("button" + (i+1), "id", getPackageName());

            btns[i] = findViewById(resId);
            // 버튼의 색을 한번에 바꾸고 싶다면? 굳이굳이 하나씩 노가다 할 필요 없이 for문을 돌려버리면 된다!
            // => 데이터에 인덱스가 생겼기 때문에! => 배열에 저장헀기 떄문에!
            btns[i].setBackgroundColor(Color.parseColor("#FFF59D"));
            btns[i].setTextColor(Color.parseColor("#000000"));

            btns[i].setText(nums[i]+"");

            // 일괄적으로 버튼에 이벤트 넣기
            btns[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View currentEvent) {
                    timer.start();
                    // onClick의 매개변수가 View 타입이라는 것은
                    // View 클래스를 상속받고 있는 객체들은 전부 매개변수로 전달될 수 있다!
                    // => 업캐스팅! (하위클래스 타입의 객체가 상위클래스 타입으로 형변환 되는 것)
                    Button btn = (Button) currentEvent;

                    // 그 다음 단계! 순서에 맞게 클릭했는지 알아봐야함....
                    int btnInt = Integer.parseInt(btn.getText().toString());
                    // currentIndex와 button에 적혀있는 숫자가 일치한다면

                    if(btnInt == currentIndex) {

                        // 매개변수 currentEvent => 현재 내가 클릭한 view
                        // 안보이게 만들어줄 View => currentEvent
                        currentEvent.setVisibility(View.INVISIBLE);
                        currentIndex ++;
                    }
                    if(currentIndex == nums.length+1){
                        timer.stop();
                    }
                }
            });
        }
    }
}