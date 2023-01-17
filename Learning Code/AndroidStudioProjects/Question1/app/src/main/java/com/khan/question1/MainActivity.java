package com.khan.question1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_1;
    Button btn_2;
    Button btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { btn_1.setText("1ST BUTTON!"); }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_2.setText("2ND BUTTON!");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_3.setText("3RD BUTTON!");
            }
        });

    }

}