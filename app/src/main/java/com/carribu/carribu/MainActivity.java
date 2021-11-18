package com.carribu.carribu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
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
        gridLayoutManager = new GridLayoutManager(this, 3);  //그리드레이아웃, 한 행에 몇 개씩 나타낼지 결정
        //리사이클러뷰의 아이템뷰들을 그리드레이아웃으로 표시
        recyclerView.setLayoutManager(gridLayoutManager);

        //아이템 뷰 각각에 들어갈 text 리스트
        int[] main_image = {R.drawable.rice, R.drawable.chinese, R.drawable.asian_food, R.drawable.sushi, R.drawable.tteokbokki, R.drawable.fast_food, R.drawable.caffee, R.drawable.beer, R.drawable.store};
        String[] main_text = {"한식", "중국집", "아시안 양식", "일식", "분식", "패스트푸드", "카페/베이커리", "술집", "편의점"};

        //어댑터 연결
        adapter = new MainAdapter(main_text, main_image);  //MainAdapter 클래스에 할당
        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), new LinearLayoutManager(new MainActivity()).getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        RecyclerDecoration spaceDecoration = new RecyclerDecoration(20); //간격조절
        recyclerView.addItemDecoration(spaceDecoration);


        bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
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
                ft.replace(R.id.main_frame, frag1);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, frag2);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, frag3);
                ft.commit();
                break;
        }
    }
}
   