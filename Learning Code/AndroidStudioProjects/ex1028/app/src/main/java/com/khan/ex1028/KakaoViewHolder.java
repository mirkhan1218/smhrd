package com.khan.ex1028;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KakaoViewHolder extends RecyclerView.ViewHolder {
    // 1. 상위클래스가 추상클래스여서 추상메소드 오버라이딩 해야할 때
    // 2. 상위클래스가 매개변수가 있는 생성자가 설계되어 있어서 super 호출해줘야 할 떄!
    TextView tvName;
    TextView tvMessage;
    TextView tvTime;
    TextView tvCount;
    ImageView imgId;
    TextView tvMyMessage;
    TextView tvMyTime;
    TextView tvMyCount;



    public KakaoViewHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tvName);
        tvMessage = itemView.findViewById(R.id.tvMess);
        tvTime = itemView.findViewById(R.id.tvTime);
        imgId = itemView.findViewById(R.id.imgId);
        tvCount = itemView.findViewById(R.id.tvCount);
        tvMyMessage = itemView.findViewById(R.id.tvMyMess);
        tvMyTime = itemView.findViewById(R.id.tvMyTime);
        tvMyCount = itemView.findViewById(R.id.tvMyCount);
    }
}
