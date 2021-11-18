package com.carribu.carribu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CardActivity extends LinearLayout {
    ImageView imageView;
    TextView textView1, textView2, textView3;

    public CardActivity(Context context) {
        super(context);
        init(context);
    }

    public CardActivity(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.card1, this, true);

        //XML 레이아웃에서 정의했던 뷰 참조하기
        imageView = findViewById(R.id.cardImgView);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
    }

    //뷰 데이터 설정하기

    //정수 전달 받아 이미지 뷰의 이미지 변경
    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }

    public void setName(String name) {
        textView1.setText(name);
    }

    public void setMobile(String mobile) {
        textView2.setText(mobile);
    }

    public void setStore(String store) {
        textView3.setText(store);
    }
}
