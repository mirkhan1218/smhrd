package com.khan.ex1017;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        listView = findViewById(R.id.list);

        // Main에서 버튼 눌러서 Sub로 이동했다!
        // Sub에 있는 리스트뷰에 Event를 걸어주자!
        // 항목이 선택된 걸 감지하는 Event!

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 1. 클릭이 일어난 ListView 자체!
                // 2. 클릭이 일어난 항목 View (지금 프로젝트는 TextView!)
                // 3. 클릭이 일어난 항목의 Index (0~)
                // 4. 클릭이 일어난 항목의 id값 => X

                // 클릭했을 때 색깔(글자)을 Toast 메세지로 띄워주세요~
                String mess = "";
                String cCode = "";

                // 어떤 색을 선택했는 지 Main에 값을 돌려주고 싶다!
                // Intent를 사용해서!
                Intent intent_pre = new Intent();

                switch (position){
                    case 0:
                        mess = "Red";
                        cCode = "#FF0000";
                        break;
                    case 1:
                        mess = "Green";
                        cCode = "#00FF00";
                        break;
                    case 2:
                        mess = "Blue";
                        cCode = "#0000FF";
                        break;
                }
//                if (position == 0){
//                    mess = "Red";
//                }else if(position== 1){
//                    mess = "Green";
//                }else if(position == 2){
//                    mess = "Blue";
//                }
                intent_pre.putExtra("color",cCode);
                Toast.makeText(
                        getApplicationContext(),
                        mess+" 입니다",
                        Toast.LENGTH_SHORT).show();

                // 반송하기
                setResult(RESULT_OK, intent_pre);

                finish();
            }
        });
    }
}