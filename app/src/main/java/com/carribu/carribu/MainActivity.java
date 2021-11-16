package com.carribu.carribu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager gridLayoutManager; //그리드 레이아웃
    RecyclerView.Adapter adapter;

    private BottomNavigationView bottomNavigationView; //하단바
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag1 frag1;
    private Frag2 frag2;
    private Frag3 frag3;

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
        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_list:
                        setFrag(0);
                        break;
                    case R.id.action_star:
                        setFrag(0);
                        break;
                    case R.id.action_fix:
                        setFrag(0);
                        break;

                }
                return true;
            }
        });
        frag1 = new Frag1();
        frag2 = new Frag2();
        frag3 = new Frag3();
        setFrag(0); //첫 프래그먼트화면 셋팅
    }
    //프래그먼트 교체
    private void setFrag(int n) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n) {
            case 0:
                ft.replace(R.id.main_frame,frag1);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame,frag2);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame,frag3);
                ft.commit();
                break;
        }
    }

    }
   