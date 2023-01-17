package com.khan.ex1018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtId;
    EditText edtPw;

    Button btnLogin;

    Intent intent_nick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String id = "aaa";
        String pw = "123";
        String nick = "미리칸";

        edtId = findViewById(R.id.edtId);
        edtPw = findViewById(R.id.edtPw);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtId.getText().toString().equals(id) && edtPw.getText().toString().equals(pw)){
                    intent_nick = new Intent();
                    intent_nick.putExtra("nick", nick);

                    setResult(RESULT_OK, intent_nick);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this,
                            "ID 또는 PW가 틀렸습니다.",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}