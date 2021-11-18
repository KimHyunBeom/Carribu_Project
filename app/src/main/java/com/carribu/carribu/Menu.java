package com.carribu.carribu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

public class Menu extends AppCompatActivity {

    private Intent intent;
    private int number;
    private ImageView imageView;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1);

        //intent로 데이터를 받음
        intent = getIntent();
        //xml의 객체를 받음

        /*
        <README> - 카드뷰 내용 변경 예시
        1. 카드뷰의 내용 작성을 위해서는 아래와 같이 작성하면 되며 미리 menu1.xml 액티비티에 카드뷰가 생성돼 있어야 한다.
        2. 변수형은 CardActivity이며 바뀌지 않는다.
        3. 카드뷰의 아이디는 반드시 지정돼 있어야 불러옴에 무리가 없다.

        CardActivity card1 = findViewById(R.id.store1);

        card1.setImage(R.drawable.ic_launcher_foreground);
        card1.setName("홍짜장");
        card1.setMobile("031-755-4071");
        card1.setStore("경기 성남시 수정구 복정로 73");
         */

        number = intent.getIntExtra("number", -1); //MainAdapter에서 전달된 데이터를 받음.

        switch (number) {  //각각의 아이템에 따라 어떻게 화면이 바뀔지 swith문으로 나타냄.
            case 0:
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("복정고을");
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("봉구스밥버거");
                break;
            case 1:
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("복정고을22");
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("봉구스밥버거1");
                break;
            case 2:
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("복정고을44");
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("봉구스밥버거2");
                break;
            case 3:
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("복정고을45");
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("봉구스밥버거3");
                break;
            case 4:
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("복정고을66");
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("봉구스밥버거4");
                break;
            case 5:
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("복정고을464");
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("봉구스밥버거5");
                break;
            case 6:
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("복정고을456");
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("봉구스밥버거6");
                break;
            case 7:
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("복정고을56");
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("봉구스밥버거7");
                break;
            case 8:
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("복정고을67");
                imageView.setImageResource(R.mipmap.ic_launcher);
                textView.setText("봉구스밥버거8");
                break;
        }
    }
}
