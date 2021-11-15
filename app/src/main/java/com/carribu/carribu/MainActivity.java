package com.carribu.carribu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager gridLayoutManager; //그리드 레이아웃
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView); //리사이클러뷰 참조
        //그리드 레이아웃
        gridLayoutManager = new GridLayoutManager(this,3);  //그리드레이아웃, 한 행에 몇 개씩 나타낼지 결정
        //리사이클러뷰의 아이템뷰들을 그리드레이아웃으로 표시
        recyclerView.setLayoutManager(gridLayoutManager);

        //아이템 뷰 각각에 들어갈 text 리스트
        String[] main_text =  {"중식","파스타", "국밥", "분식","일식","회", "패스트푸드", "카페","고깃집","샌드위치/토스트", "편의점"};
        String[] main_text2 =  {"짜장면","test2","test3","test4","test5","test6","test7","test8","test9","test10", "test11"};

        //어댑터 연결
        adapter = new MainAdapter(main_text, main_text2);  //MainAdapter 클래스에 할당
        recyclerView.setAdapter(adapter);

    }
}
