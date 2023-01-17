package com.khan.ex1020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    EditText edtName;
    EditText edtURL;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        btnAdd = findViewById(R.id.btnAdd);
        edtName = findViewById(R.id.edtName);
        edtURL = findViewById(R.id.edtURL);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.putExtra("addName", edtName.getText().toString());
                intent.putExtra("addUrl", edtURL.getText().toString());

                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}