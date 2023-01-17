package com.khan.ex1006;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_output;
    EditText edt_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_input = findViewById(R.id.edt_input);
        tv_output = findViewById(R.id.tv_output);
    }

    // 하나의 이벤트 메소드(myClick)로 서로 다른 처리 해주기!
    public void myClick(View currentEvent){
        // +버튼, -버튼, set버튼을 누르면 myClick이 실행된다.
        // myClick 내에서 어떤 버튼을 눌러서 실행된건지 알아내야함!
        // 현재 이벤트가 발생한 View의 정보가 currentEvent에 저장되어 있음!
        // 버튼을 구분하기 위해서 id값으로 조건을 걸어준다!
        String result = "";
        int num = Integer.parseInt(tv_output.getText().toString());

        if (currentEvent.getId() == R.id.btn_set) {
            // 현재 클릭한 버튼의 id가 R파일에 등록된 btn_set과 같다면!
            // => set 버튼 눌렀다면!
            result = edt_input.getText().toString();
            edt_input.setText("");
        }else if (currentEvent.getId() == R.id.btn_up){
            // 현재 textView에 적힌 글자 가져와서
            // 숫자로 바꾼 다음에
            // 1 증가시키고
            // 다시 textView에 입력
            result = Integer.toString(num+1);
        }else if(currentEvent.getId() == R.id.btn_down){
            result = Integer.toString(num-1);
        }
        // setText할 때 정수값이 들어가면 리소스 주소라고 생각함...
        // res->strings.xml 파일을 참조하겠다는 뜻이 되버림
        // 결론! setText할 때는 String으로 바꿔서 넣어주자!
        tv_output.setText(result);

    }

//    public void up(View currentEvent){
//        int num = Integer.parseInt(tv_output.getText().toString());
//        // int -> String
//        // 1. int+""
//        // 2. String.valueOf(num)
//        // 3. Integer.toString()
//        tv_output.setText();
//    }
//
//    public void down(View currentEvent){
//        int num = Integer.parseInt(tv_output.getText().toString());
//        tv_output.setText(Integer.toString(num-1));
//    }

}