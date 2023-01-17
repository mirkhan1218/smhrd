package com.khan.ex1102;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment_4 extends Fragment {

//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";

//    private String mParam1;
//    private String mParam2;

//    public Fragment_4() {
//
//    }

    // 외부(Activity)에서 Fragment 객체 생성하지 않아도 메소드 호출해서 자체적으로
    // Fragment 만들어주는 메소드! (newInstance)
//    public static Fragment_4 newInstance(String param1, String param2) {
//        Fragment_4 fragment = new Fragment_4();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
    EditText edt_url;
    Button btn_ok;
    TextView tv_url;

    SharedPreferences spf;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Activity의 상위클래스는 AppcompatActivity 클래스!
        // Fragment의 상위클래스는 Fragment!
        // => findViewById 등의 Activity가 할 수 있는 일들에 제한이 있다!

        View view = inflater.inflate(R.layout.fragment_4, container, false);

        // mSPF라는 이름의 spf(테이블처럼) 가져옴!
        // MODE_PRIVATE : 있으면 있는거 가져와라!
        spf = getActivity().getSharedPreferences(MainActivity.SPF_TITLE, Context.MODE_PRIVATE);

        edt_url = view.findViewById(R.id.edt_url);
        btn_ok = view.findViewById(R.id.btn_ok);
        tv_url = view.findViewById(R.id.tv_url);

        // 버튼 눌렀을 때 edt_url에 적힌 데이터 textView에 띄우기!
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 클릭하면 spf 에 값 저장!
                spf.edit().putString("url", edt_url.getText().toString()).commit();

                tv_url.setText(edt_url.getText().toString());
            }
        });

        return view;
    }
}