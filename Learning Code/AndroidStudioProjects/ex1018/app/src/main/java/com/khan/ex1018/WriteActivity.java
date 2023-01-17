package com.khan.ex1018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WriteActivity extends AppCompatActivity {

    Button btn_ok;
    EditText edt_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write);

        btn_ok = findViewById(R.id.btn_ok);
        edt_content = findViewById(R.id.edt_content);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("content", edt_content.getText().toString());

                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}