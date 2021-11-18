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

        imageView = findViewById(R.id.imageitem1);
        textView = findViewById(R.id.textitem1);
        imageView = findViewById(R.id.imageitem2);
        textView = findViewById(R.id.textitem2);


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
