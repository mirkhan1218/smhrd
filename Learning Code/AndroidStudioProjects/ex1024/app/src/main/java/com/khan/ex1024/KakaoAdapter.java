package com.khan.ex1024;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KakaoAdapter extends RecyclerView.Adapter<KakaoViewHolder> {
    // 필드 2개, data, Context 만들고 생성자까지 설계해주세요!
    private ArrayList<MessageVO> datas;
    private Context context;
    private String name;

    public KakaoAdapter(ArrayList<MessageVO> datas, Context context, String name) {
        this.datas = datas;
        this.context = context;
        this.name = name;
    }

    @NonNull
    @Override
    public KakaoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflate란?
        // inflate 작업 수행 (xml -> java 객체 view)
        // ex) findViewById, setContentView
        KakaoViewHolder holder = new KakaoViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.templete, parent, false)
        );
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull KakaoViewHolder holder, int position) {

        // position번쨰 메세지의 주인이 Main에서 전달받은 name과 같다면!
        if(datas.get(position).getName().equals(name)){
            // 오른쪽 View 살리고
            holder.tvMyMessage.setVisibility(View.VISIBLE);
            holder.tvMyTime.setVisibility(View.VISIBLE);
            holder.tvMyCount.setVisibility(View.VISIBLE);

            // 왼쪽 View 날리기
            holder.tvMessage.setVisibility(View.GONE);
            holder.imgId.setVisibility(View.GONE);
            holder.tvName.setVisibility(View.GONE);
            holder.tvCount.setVisibility(View.GONE);
            holder.tvTime.setVisibility(View.GONE);

            // 오른쪽 View에 setText
            holder.tvMyMessage.setText(datas.get(position).getContent());
            holder.tvMyTime.setText(datas.get(position).getTime());
            holder.tvMyCount.setText(datas.get(position).getCount());

        }else{
            // 오른쪽 View 살리고
            holder.tvMyMessage.setVisibility(View.GONE);
            holder.tvMyTime.setVisibility(View.GONE);
            holder.tvMyCount.setVisibility(View.GONE);

            // 왼쪽 View 날리기
            holder.tvMessage.setVisibility(View.VISIBLE);
            holder.imgId.setVisibility(View.VISIBLE);
            holder.tvName.setVisibility(View.VISIBLE);
            holder.tvCount.setVisibility(View.VISIBLE);
            holder.tvTime.setVisibility(View.VISIBLE);

            // 남이 보낸 메세지라면!
            holder.tvName.setText(datas.get(position).getName());
            holder.tvMessage.setText(datas.get(position).getContent());
            holder.tvTime.setText(datas.get(position).getTime());
            holder.tvCount.setText(datas.get(position).getCount());
            holder.imgId.setImageResource(datas.get(position).getimgId());

        }

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
