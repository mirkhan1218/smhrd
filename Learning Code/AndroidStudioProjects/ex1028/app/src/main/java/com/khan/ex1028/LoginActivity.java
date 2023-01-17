package com.khan.ex1028;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    EditText edt_email;
    EditText edt_pw;
    Button btn_login;
    Button btn_join;

    // Volley 서버통신을 하기위한 queue 및 request 생성
    RequestQueue queue;
    StringRequest join_request;
    StringRequest login_request;

    String email;
    String pw;

    // Write a message to the database
    // 1. FireBase DataBase 객체 생성!
    FirebaseDatabase database = FirebaseDatabase.getInstance("https://kakao-23c0e-default-rtdb.firebaseio.com/");
    // 2. DataBase url (Reference) 가져오기~
    DatabaseReference myRef = database.getReference("message");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myRef.setValue("Hello, World!");

        edt_email = findViewById(R.id.edt_email);
        edt_pw = findViewById(R.id.edt_pw);
        btn_login = findViewById(R.id.btn_login);
        btn_join = findViewById(R.id.btn_join);

//        btn_login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                email = edt_email.getText().toString();
//                pw = edt_pw.getText().toString();
//
//                if (email.equals("미리칸") && pw.equals("123")) {
//                    Log.v("adsf", "af");
//                    Intent intent_login = new Intent(LoginActivity.this, MainActivity.class);
//                    intent_login.putExtra("temp", email + "");
//
//                    startActivity(intent_login);
//
//                }
//            }
//        });

        // Volley 라이브러리 사용하여 서버랑 통신하기!
        // 1. App에 인터넷 설정해주기 => Manifest.xml에서 설정! (permission, clear~~)
        // 2. 서버 url 저장하기
        String url_join = "http://220.71.97.222:8081/MemberServer/JoinServlet";

        // 3. requestQueue 객체 생성하기 => 데이터 전송통로
        queue = Volley.newRequestQueue(getApplicationContext());

        // 4. stringRequest 객체 생성하기 => 전송방식, 서버 url, 응답 시 일어날 일(Listener), 에러났을 때 일어날 일 (Listener)
        join_request = new StringRequest(Request.Method.POST, url_join, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // 응답처리 하는 곳!
                if (response.equals("1")) {
                    // 회원가입 성공!
                    Toast.makeText(getApplicationContext(), "회원가입 성공!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "회원가입 실패ㅠ", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // 에러났을 때 처리하는 곳!
            }
        }) {
            // 이{} 구역은 StringRequest 구역!
            @Nullable
            @Override

            protected Map<String, String> getParams() throws AuthFailureError { // throws -> 예외 처리
                // 예외 처리 방법
                // 1. try - catch => 현재 이클래스에서 처리
                // 2. throws => 하위클래스에 보내버리기

                // 서버로 보낼 파라미터(변수, 데이터) 설정 해주는 곳!
                Map<String, String> params = new HashMap<>();

                params.put("id", edt_email.getText().toString()); // Key : 서버랑 약속한 값, Value : EditText에 적힌 글자
                params.put("pw", edt_pw.getText().toString());

                return params; // ★★★★★★★★
            }
        };

        // 5. queue에 stringRequest 전송하기 => 회원가입 버튼을 눌렀을 때!
        btn_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                queue.add(join_request);
            }
        });

        // 로그인 기능 구현하기!
        // 1. App에 인터넷 설정 => O
        // 2. url 저장하기 => O
        String url_login = "http://220.71.97.222:8081/MemberServer/LoginServlet";
        // 3. queue 생성하기 => O
        // 4. stringRequest 생성하기 => url 마다 한개씩 생성해야함
        login_request = new StringRequest(Request.Method.POST, url_login, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // 응답처리하는 곳
                if (response.equals("true")) {
                    // 로그인 성공!
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "로그인 실패ㅠ", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) {
            // 이{} 구역은 StringRequest 구역!
            @Nullable
            @Override

            protected Map<String, String> getParams() throws AuthFailureError { // throws -> 예외 처리
                // 예외 처리 방법
                // 1. try - catch => 현재 이클래스에서 처리
                // 2. throws => 하위클래스에 보내버리기

                // getParams() : 서버로 보낼 파라미터(변수, 데이터) 설정 해주는 곳!
                Map<String, String> params = new HashMap<>();

                params.put("id", edt_email.getText().toString()); // Key : 서버랑 약속한 값, Value : EditText에 적힌 글자
                params.put("pw", edt_pw.getText().toString());

                return params; // ★★★★★★★★
            }
        };
        // 5. queue에 stringRequest 전송하기 => 로그인 버튼 눌렀을 때!
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                queue.add(login_request); // 전송!
            }
        });
        // 6. 응답처리하기 => 성공했으면 MainActivity로 화면전환 => "true", "false"
    }
}