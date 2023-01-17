package com.khan.ex1020;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DirectAdapter extends RecyclerView.Adapter<DirectViewHolder> {
    // Adapter의 역할
    // 템플릿(ViewHolder에 담겨있음)에 데이터(ArrayList)를 씌우는 역할!
    // 필드 2개
    // data(ArrayList), activity 정보 - Context
    private ArrayList<DirectVO> dvoList;
    private Context context; // activity에서 할 수 있는 일들을 Adapter에서도 수행하려고!

    public DirectAdapter(ArrayList<DirectVO> dvoList, Context context) {
        this.dvoList = dvoList;
        this.context = context;
    }

    @NonNull
    @Override
    public DirectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // ViewHolder 생성!
        // inflate 작업 수행 (xml -> java 객체 view)
        // ex) findViewById, setContentView
        DirectViewHolder holder = new DirectViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.templete, parent, false)
        );

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DirectViewHolder holder, int position) {
        final int temp = position;
        // 기존에 만들어준 ViewHolder를 전달받아서 data로 꾸며주는 메소드!
        // 이 메소드는 몇 번 실행될까요? getItemCount 메소드에 적어준 개수만큼!
        holder.tvTitle.setText(dvoList.get(position).getTitle());
        holder.tvAddress.setText(dvoList.get(position).getAddress());
        holder.btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // setOnClickListener 객체(클래스)는 InnerClass 입니다!
                // InnerClass에서 외부 클래스에 정의된 변수에 접근 x =>동기화 때문에...
                // 상수에만 접근이 가능!
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(dvoList.get(temp).getAddress()));

                // Activity가 아닌 곳에서 startActivity를 할 때는 새로운 TASK에서 실행될 수 있도록
                // 옵션(flag)을 걸어줘야함!
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        // 항목 개수
        return dvoList.size();
    }
}
