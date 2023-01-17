package com.khan.ex1006_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_result;
    EditText edt_num_1;
    EditText edt_num_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result = findViewById(R.id.tv_result);
        edt_num_1 = findViewById(R.id.edt_num_1);
        edt_num_2 = findViewById(R.id.edt_num_2);
    }

    public void myClick(View currentEvent){
        //
        int num_1 = Integer.parseInt(edt_num_1.getText().toString());
        int num_2 = Integer.parseInt(edt_num_2.getText().toString());
        edt_num_1.setText("");
        edt_num_2.setText("");
        int result = 0;
        String symbol = "";

        if (currentEvent.getId() == R.id.btn_add) {
            result = num_1 + num_2;
            symbol = "+";
        }else if (currentEvent.getId() == R.id.btn_minus){
            result = num_1 - num_2;
            symbol = "-";
        }else if(currentEvent.getId() == R.id.btn__mul){
            result = num_1 * num_2;
            symbol = "*";
        }else if(currentEvent.getId() == R.id.btn_div){
            result = num_1 / num_2;
            symbol = "/";
        }
        String result_pars = Integer.toString(result);
        tv_result.setText(num_1 +" "+ symbol +" "+ num_2 + " " + "=" + " "+ result_pars);

    }
}