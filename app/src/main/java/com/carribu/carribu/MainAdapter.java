package com.carribu.carribu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//리사이틀러뷰에 표시할 아이템 뷰 생성
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {
    private int[] main_image;
    private String[] main_text; //각 아이템 뷰에 들어갈 변수
    MainHolder mainHolder;


    //각 아이템 뷰에 들어갈 변수
    public MainAdapter(String[] main_text, int[] main_image) {
        this.main_image = main_image;
        this.main_text = main_text;
    }

    //화면에 표시할 아이템 뷰 저장
    public static class MainHolder extends RecyclerView.ViewHolder {
        public ImageView main_image;
        public TextView main_text;

        public MainHolder(View view) {
            super(view);
            //뷰객체에 대한 참조
            this.main_image = view.findViewById(R.id.image);
            this.main_text = view.findViewById(R.id.text);
        }
    }

    @NonNull
    @Override
    //아이템뷰를 위한 뷰홀더 객체를 생성하여 리턴
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View holderView = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_holder_view, parent, false);
        mainHolder = new MainHolder(holderView);
        return mainHolder;
    }

    @Override
    //position에 해당하는 데이터를 뷰홀더의 아이템뷰에 표시
    public void onBindViewHolder(@NonNull MainHolder mainHolder, final int i) {
        mainHolder.main_image.setImageResource(this.main_image[i]);
        mainHolder.main_text.setText(this.main_text[i]);


        mainHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //클릭시
                Intent intent = new Intent(v.getContext(), Menu.class);   //화면전환
                intent.putExtra("number", i);     //intent로 값 전달. number라는 키이름으로 i라는 키값인 데이터를 옮김
                v.getContext().startActivity(intent);  //명령 실행
            }
        });
    }


    @Override
    //전체 아이템의 갯수 리턴
    public int getItemCount() {
        return main_text.length;
    }
}

