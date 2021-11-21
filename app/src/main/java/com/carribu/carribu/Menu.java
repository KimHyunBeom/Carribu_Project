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
    private int i;
    private CardActivity[] card = new CardActivity[21];
    private Integer[] cardIDs = { R.id.store0, R.id.store1, R.id.store2, R.id.store3, R.id.store4, R.id.store5, R.id.store6, R.id.store7, R.id.store8, R.id.store9, R.id.store10, R.id.store11, R.id.store12, R.id.store13, R.id.store14, R.id.store15, R.id.store16, R.id.store17, R.id.store18,
            R.id.store19, R.id.store20 };


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

        CardActivity card1 = findViewById(R.id.store1);  // 이젠 쓸모없지만 기본적인 ID 생성 방식

        card[0].setImage(R.drawable.ic_launcher_foreground);
        card[0].setName("홍짜장");
        card[0].setMobile("031-755-4071");
        card[0].setStore("경기 성남시 수정구 복정로 73");
         */


        //아이디 생성시 for문 권장!!
        // 카드 ID 반복문 - hb
        for (i = 0; i < cardIDs.length; i++) {
            card[i] = findViewById(cardIDs[i]);
        }

        //<꿀팁> Alt+J 단축키 사용시 멀티 셀렉트 가능(여러줄 수정시 사용!!)

        number = intent.getIntExtra("number", -1); //MainAdapter에서 전달된 데이터를 받음.

        switch (number) {  //각각의 아이템에 따라 어떻게 화면이 바뀔지 swith문으로 나타냄.
            case 0: //  한식 (최신화 완료)

                card[0].setName(getString(R.string.hanshigdag_name0));
                card[0].setMobile(getString(R.string.hanshigdag_moblie0));
                card[0].setStore(getString(R.string.hanshigdag_store0));

                card[1].setImage(R.drawable.h_1);
                card[1].setName(getString(R.string.hanshigdag_name1));
                card[1].setMobile(getString(R.string.hanshigdag_moblie1));
                card[1].setStore(getString(R.string.hanshigdag_store1));


                card[2].setName(getString(R.string.hanshigdag_name2));
                card[2].setMobile(getString(R.string.hanshigdag_moblie2));
                card[2].setStore(getString(R.string.hanshigdag_store2));


                card[3].setName(getString(R.string.hanshigdag_name3));
                card[3].setMobile(getString(R.string.hanshigdag_moblie3));
                card[3].setStore(getString(R.string.hanshigdag_store3));

                card[4].setImage(R.drawable.h_4);
                card[4].setName(getString(R.string.hanshigdag_name4));
                card[4].setMobile(getString(R.string.hanshigdag_moblie4));
                card[4].setStore(getString(R.string.hanshigdag_store4));

                card[5].setImage(R.drawable.h_5);
                card[5].setName(getString(R.string.hanshigdag_name5));
                card[5].setMobile(getString(R.string.hanshigdag_moblie5));
                card[5].setStore(getString(R.string.hanshigdag_store5));

                card[6].setImage(R.drawable.h_6);
                card[6].setName(getString(R.string.hanshigdag_name6));
                card[6].setMobile(getString(R.string.hanshigdag_moblie6));
                card[6].setStore(getString(R.string.hanshigdag_store6));


                card[7].setName(getString(R.string.hanshigdag_name7));
                card[7].setMobile(getString(R.string.hanshigdag_moblie7));
                card[7].setStore(getString(R.string.hanshigdag_store7));

                card[8].setImage(R.drawable.h_8);
                card[8].setName(getString(R.string.hanshigdag_name8));
                card[8].setMobile(getString(R.string.hanshigdag_moblie8));
                card[8].setStore(getString(R.string.hanshigdag_store8));


                card[9].setName(getString(R.string.hanshigdag_name9));
                card[9].setMobile(getString(R.string.hanshigdag_moblie9));
                card[9].setStore(getString(R.string.hanshigdag_store9));


                card[10].setName(getString(R.string.hanshigdag_name10));
                card[10].setMobile(getString(R.string.hanshigdag_moblie10));
                card[10].setStore(getString(R.string.hanshigdag_store10));

                card[11].setImage(R.drawable.h_11);
                card[11].setName(getString(R.string.hanshigdag_name11));
                card[11].setMobile(getString(R.string.hanshigdag_moblie11));
                card[11].setStore(getString(R.string.hanshigdag_store11));

                card[12].setImage(R.drawable.h_12);
                card[12].setName(getString(R.string.hanshigdag_name12));
                card[12].setMobile(getString(R.string.hanshigdag_moblie12));
                card[12].setStore(getString(R.string.hanshigdag_store12));

                card[13].setImage(R.drawable.h_13);
                card[13].setName(getString(R.string.hanshigdag_name13));
                card[13].setMobile(getString(R.string.hanshigdag_moblie13));
                card[13].setStore(getString(R.string.hanshigdag_store13));

                card[14].setImage(R.drawable.h_14);
                card[14].setName(getString(R.string.hanshigdag_name14));
                card[14].setMobile(getString(R.string.hanshigdag_moblie14));
                card[14].setStore(getString(R.string.hanshigdag_store14));

                card[15].setImage(R.drawable.h_15);
                card[15].setName(getString(R.string.hanshigdag_name15));
                card[15].setMobile(getString(R.string.hanshigdag_moblie15));
                card[15].setStore(getString(R.string.hanshigdag_store15));

                card[16].setImage(R.drawable.h_16);
                card[16].setName(getString(R.string.hanshigdag_name16));
                card[16].setMobile(getString(R.string.hanshigdag_moblie16));
                card[16].setStore(getString(R.string.hanshigdag_store16));

                card[17].setImage(R.drawable.h_17);
                card[17].setName(getString(R.string.hanshigdag_name17));
                card[17].setMobile(getString(R.string.hanshigdag_moblie17));
                card[17].setStore(getString(R.string.hanshigdag_store17));

                card[18].setImage(R.drawable.h_18);
                card[18].setName(getString(R.string.hanshigdag_name18));
                card[18].setMobile(getString(R.string.hanshigdag_moblie18));
                card[18].setStore(getString(R.string.hanshigdag_store18));

                card[19].setImage(R.drawable.h_19);
                card[19].setName(getString(R.string.hanshigdag_name19));
                card[19].setMobile(getString(R.string.hanshigdag_moblie19));
                card[19].setStore(getString(R.string.hanshigdag_store19));

                break;

            case 1: //중국집 (최신화 완료)
                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName(getString(R.string.chineseF_name0));
                card[0].setMobile(getString(R.string.chineseF_moblie0));
                card[0].setStore(getString(R.string.chineseF_store0));

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName(getString(R.string.chineseF_name1));
                card[1].setMobile("번호 없음");
                card[1].setStore(getString(R.string.chineseF_store1));

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName(getString(R.string.chineseF_name2));
                card[2].setMobile(getString(R.string.chineseF_moblie2));
                card[2].setStore(getString(R.string.chineseF_store2));

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName(getString(R.string.chineseF_name3));
                card[3].setMobile(getString(R.string.chineseF_moblie3));
                card[3].setStore(getString(R.string.chineseF_store3));

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName(getString(R.string.chineseF_name4));
                card[4].setMobile(getString(R.string.chineseF_moblie4));
                card[4].setStore(getString(R.string.chineseF_store4));

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName(getString(R.string.chineseF_name5));
                card[5].setMobile(getString(R.string.chineseF_moblie5));
                card[5].setStore(getString(R.string.chineseF_store5));

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName(getString(R.string.chineseF_name6));
                card[6].setMobile(getString(R.string.chineseF_moblie6));
                card[6].setStore(getString(R.string.chineseF_store6));

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName(getString(R.string.chineseF_name7));
                card[7].setMobile(getString(R.string.chineseF_moblie7));
                card[7].setStore(getString(R.string.chineseF_store7));

                card[8].setImage(R.mipmap.ic_launcher);
                card[8].setName(getString(R.string.chineseF_name8));
                card[8].setMobile(getString(R.string.chineseF_moblie8));
                card[8].setStore(getString(R.string.chineseF_store8));

                card[9].setImage(R.mipmap.ic_launcher);
                card[9].setName(getString(R.string.chineseF_name9));
                card[9].setMobile(getString(R.string.chineseF_moblie9));
                card[9].setStore(getString(R.string.chineseF_store9));

                card[10].setImage(R.mipmap.ic_launcher);
                card[10].setName(getString(R.string.chineseF_name10));
                card[10].setMobile(getString(R.string.chineseF_moblie10));
                card[10].setStore(getString(R.string.chineseF_store10));

                card[11].setImage(R.mipmap.ic_launcher);
                card[11].setName(getString(R.string.chineseF_name11));
                card[11].setMobile(getString(R.string.chineseF_moblie11));
                card[11].setStore(getString(R.string.chineseF_store11));

                break;

            case 2://아시안 양식
                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName("테리엔치킨/카페테리 파스타");
                card[0].setMobile("0507-1412-9060");
                card[0].setStore("경기 성남시 수정구 복정로40");

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName("피자스쿨");
                card[1].setMobile("031-755-1002");
                card[1].setStore("경기 성남시 수정구 복정로 43");

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName("스파게티 올리브");
                card[2].setMobile("031-756-7788");
                card[2].setStore("경기 성남시 수정구 복정로 68 1층");

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName("via.246");
                card[3].setMobile("0507-1350-8942");
                card[3].setStore("경기 성남시 수정구 복정로106번길 4");

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName("몽둥이 부리또");
                card[4].setMobile("031-721-5022");
                card[4].setStore("경기 성남시 수정구 복정로 86");

                break;


            case 3://일식
                card[0].setImage(R.drawable.j_0);
                card[0].setName(getString(R.string.japenesF_name0));
                card[0].setMobile(getString(R.string.japenesF_moblie0));
                card[0].setStore(getString(R.string.japenesF_store0));

                card[1].setImage(R.drawable.j_1);
                card[1].setName(getString(R.string.japenesF_name1));
                card[1].setMobile(getString(R.string.japenesF_moblie1));
                card[1].setStore(getString(R.string.japenesF_store1));

                card[2].setImage(R.drawable.j_2);
                card[2].setName(getString(R.string.japenesF_name2));
                card[2].setMobile(getString(R.string.japenesF_moblie2));
                card[2].setStore(getString(R.string.japenesF_store2));

                card[3].setImage(R.drawable.j_3);
                card[3].setName(getString(R.string.japenesF_name3));
                card[3].setMobile(getString(R.string.japenesF_moblie3));
                card[3].setStore(getString(R.string.japenesF_store3));

                card[4].setImage(R.drawable.j_4);
                card[4].setName(getString(R.string.japenesF_name4));
                card[4].setMobile(getString(R.string.japenesF_moblie4));
                card[4].setStore(getString(R.string.japenesF_store4));

                card[5].setImage(R.drawable.j_5);
                card[5].setName(getString(R.string.japenesF_name5));
                card[5].setMobile(getString(R.string.japenesF_moblie5));
                card[5].setStore(getString(R.string.japenesF_store5));

                card[6].setImage(R.drawable.j_6);
                card[6].setName(getString(R.string.japenesF_name6));
                card[6].setMobile(getString(R.string.japenesF_moblie6));
                card[6].setStore(getString(R.string.japenesF_store6));

                card[7].setName(getString(R.string.japenesF_name7));
                card[7].setMobile(getString(R.string.japenesF_moblie7));
                card[7].setStore(getString(R.string.japenesF_store7));

                card[8].setImage(R.drawable.j_8);
                card[8].setName(getString(R.string.japenesF_name8));
                card[8].setMobile(getString(R.string.japenesF_moblie8));
                card[8].setStore(getString(R.string.japenesF_store8));

                card[9].setImage(R.drawable.j_9);
                card[9].setName(getString(R.string.japenesF_name9));
                card[9].setMobile(getString(R.string.japenesF_moblie9));
                card[9].setStore(getString(R.string.japenesF_store9));

                card[10].setName(getString(R.string.japenesF_name10));
                card[10].setMobile(getString(R.string.japenesF_moblie10));
                card[10].setStore(getString(R.string.japenesF_store10));

                card[11].setName(getString(R.string.japenesF_name11));
                card[11].setMobile(getString(R.string.japenesF_moblie11));
                card[11].setStore(getString(R.string.japenesF_store11));

                card[12].setName(getString(R.string.japenesF_name12));
                card[12].setMobile(getString(R.string.japenesF_moblie12));
                card[12].setStore(getString(R.string.japenesF_store12));

                card[13].setName(getString(R.string.japenesF_name13));
                card[13].setMobile(getString(R.string.japenesF_moblie13));
                card[13].setStore(getString(R.string.japenesF_store13));

                card[14].setName(getString(R.string.japenesF_name14));
                card[14].setMobile(getString(R.string.japenesF_moblie14));
                card[14].setStore(getString(R.string.japenesF_store14));

                card[15].setName(getString(R.string.japenesF_name15));
                card[15].setMobile(getString(R.string.japenesF_moblie15));
                card[15].setStore(getString(R.string.japenesF_store15));

                card[16].setName(getString(R.string.japenesF_name16));
                card[16].setMobile(getString(R.string.japenesF_moblie16));
                card[16].setStore(getString(R.string.japenesF_store16));

                card[17].setName(getString(R.string.japenesF_name17));
                card[17].setMobile(getString(R.string.japenesF_moblie17));
                card[17].setStore(getString(R.string.japenesF_store17));

                card[18].setName(getString(R.string.japenesF_name18));
                card[18].setMobile(getString(R.string.japenesF_moblie18));
                card[18].setStore(getString(R.string.japenesF_store18));


                break;

            case 4://분식

                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName(getString(R.string.bunsig_name0));
                card[0].setMobile(getString(R.string.bunsig_moblie0));
                card[0].setStore(getString(R.string.bunsig_store0));

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName(getString(R.string.bunsig_name1));
                card[1].setMobile(getString(R.string.bunsig_moblie1));
                card[1].setStore(getString(R.string.bunsig_store1));

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName(getString(R.string.bunsig_name2));
                card[2].setMobile(getString(R.string.bunsig_moblie2));
                card[2].setStore(getString(R.string.bunsig_store2));

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName(getString(R.string.bunsig_name3));
                card[3].setMobile(getString(R.string.bunsig_moblie3));
                card[3].setStore(getString(R.string.bunsig_store3));

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName(getString(R.string.bunsig_name4));
                card[4].setMobile(getString(R.string.bunsig_moblie4));
                card[4].setStore(getString(R.string.bunsig_store4));

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName(getString(R.string.bunsig_name5));
                card[5].setMobile(getString(R.string.bunsig_moblie5));
                card[5].setStore(getString(R.string.bunsig_store5));

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName(getString(R.string.bunsig_name6));
                card[6].setMobile(getString(R.string.bunsig_moblie6));
                card[6].setStore(getString(R.string.bunsig_store6));

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName(getString(R.string.bunsig_name7));
                card[7].setMobile(getString(R.string.bunsig_moblie7));
                card[7].setStore(getString(R.string.bunsig_store7));

                card[8].setImage(R.mipmap.ic_launcher);
                card[8].setName(getString(R.string.bunsig_name8));
                card[8].setMobile(getString(R.string.bunsig_moblie8));
                card[8].setStore(getString(R.string.bunsig_store8));

                card[9].setImage(R.mipmap.ic_launcher);
                card[9].setName(getString(R.string.bunsig_name9));
                card[9].setMobile(getString(R.string.bunsig_moblie9));
                card[9].setStore(getString(R.string.bunsig_store9));

                break;

            case 5://페스트푸드

                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName("노브랜드");
                card[0].setMobile("031-759-0352");
                card[0].setStore("경기 성남시 수정구 복정로 69");

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName("맘스터치");
                card[1].setMobile("031-751-0027");
                card[1].setStore("경기 성남시 수정구 복정로 86");

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName("봉구통닭");
                card[2].setMobile("031-755-6644");
                card[2].setStore("경기 성남시 수정구 복정로 47 1층");

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName("부뚜막 치킨");
                card[3].setMobile("031-759-5582");
                card[3].setStore("경기 성남시 수정구 복정로 48");

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName("처갓집양념치킨");
                card[4].setMobile("031-759-0680");
                card[4].setStore("경기 성남시 수정구 복정로 92-1");

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName("알랑치킨");
                card[5].setMobile("031-756-9288");
                card[5].setStore("경기 성남시 수정구 복정로 53");

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName("비어킹");
                card[6].setMobile("031-753-1966");
                card[6].setStore("경기 성남시 수정구 복정로 52");

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName("쁘이치킨");
                card[7].setMobile("031-751-0564");
                card[7].setStore("경기 성남시 수정구 복정로106번길 1");


                break;
            case 6://카페 베이커리  (최신화 완료)

                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName(getString(R.string.cafe_name0));
                card[0].setMobile(getString(R.string.cafe_moblie0));
                card[0].setStore(getString(R.string.cafe_store0));

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName(getString(R.string.cafe_name1));
                card[1].setMobile(getString(R.string.cafe_moblie1));
                card[1].setStore(getString(R.string.cafe_store1));

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName(getString(R.string.cafe_name2));
                card[2].setMobile(getString(R.string.cafe_moblie2));
                card[2].setStore(getString(R.string.cafe_store2));

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName(getString(R.string.cafe_name3));
                card[3].setMobile(getString(R.string.cafe_moblie3));
                card[3].setStore(getString(R.string.cafe_store3));

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName(getString(R.string.cafe_name4));
                card[4].setMobile(getString(R.string.cafe_moblie4));
                card[4].setStore(getString(R.string.cafe_store4));

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName(getString(R.string.cafe_name5));
                card[5].setMobile(getString(R.string.cafe_moblie5));
                card[5].setStore(getString(R.string.cafe_store5));

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName(getString(R.string.cafe_name6));
                card[6].setMobile(getString(R.string.cafe_moblie6));
                card[6].setStore(getString(R.string.cafe_store6));

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName(getString(R.string.cafe_name7));
                card[7].setMobile(getString(R.string.cafe_moblie7));
                card[7].setStore(getString(R.string.cafe_store7));

                card[8].setImage(R.mipmap.ic_launcher);
                card[8].setName(getString(R.string.cafe_name8));
                card[8].setMobile(getString(R.string.cafe_moblie8));
                card[8].setStore(getString(R.string.cafe_store8));

                card[9].setImage(R.mipmap.ic_launcher);
                card[9].setName(getString(R.string.cafe_name9));
                card[9].setMobile(getString(R.string.cafe_moblie9));
                card[9].setStore(getString(R.string.cafe_store9));

                card[10].setImage(R.mipmap.ic_launcher);
                card[10].setName(getString(R.string.cafe_name10));
                card[10].setMobile(getString(R.string.cafe_moblie10));
                card[10].setStore(getString(R.string.cafe_store10));

                card[11].setImage(R.mipmap.ic_launcher);
                card[11].setName(getString(R.string.cafe_name11));
                card[11].setMobile(getString(R.string.cafe_moblie11));
                card[11].setStore(getString(R.string.cafe_store11));

                card[12].setImage(R.mipmap.ic_launcher);
                card[12].setName(getString(R.string.cafe_name12));
                card[12].setMobile(getString(R.string.cafe_moblie12));
                card[12].setStore(getString(R.string.cafe_store12));

                card[13].setImage(R.mipmap.ic_launcher);
                card[13].setName(getString(R.string.cafe_name13));
                card[13].setMobile(getString(R.string.cafe_moblie13));
                card[13].setStore(getString(R.string.cafe_store13));

                card[14].setImage(R.mipmap.ic_launcher);
                card[14].setName(getString(R.string.cafe_name14));
                card[14].setMobile(getString(R.string.cafe_moblie14));
                card[14].setStore(getString(R.string.cafe_store14));

                card[15].setImage(R.mipmap.ic_launcher);
                card[15].setName(getString(R.string.cafe_name15));
                card[15].setMobile(getString(R.string.cafe_moblie15));
                card[15].setStore(getString(R.string.cafe_store15));

                card[16].setImage(R.mipmap.ic_launcher);
                card[16].setName(getString(R.string.cafe_name16));
                card[16].setMobile(getString(R.string.cafe_moblie16));
                card[16].setStore(getString(R.string.cafe_store16));

                card[17].setImage(R.mipmap.ic_launcher);
                card[17].setName(getString(R.string.cafe_name17));
                card[17].setMobile(getString(R.string.cafe_moblie17));
                card[17].setStore(getString(R.string.cafe_store17));

                card[18].setImage(R.mipmap.ic_launcher);
                card[18].setName(getString(R.string.cafe_name18));
                card[18].setMobile(getString(R.string.cafe_moblie18));
                card[18].setStore(getString(R.string.cafe_store18));

                card[19].setImage(R.mipmap.ic_launcher);
                card[19].setName(getString(R.string.cafe_name19));
                card[19].setMobile(getString(R.string.cafe_moblie19));
                card[19].setStore(getString(R.string.cafe_store19));

                card[20].setImage(R.mipmap.ic_launcher);
                card[20].setName(getString(R.string.cafe_name20));
                card[20].setMobile(getString(R.string.cafe_moblie20));
                card[20].setStore(getString(R.string.cafe_store20));

                break;

            case 7:// 술집

                card[0].setImage(R.drawable.b_0);
                card[0].setName(getString(R.string.beer_name0));
                card[0].setMobile(getString(R.string.beer_moblie0));
                card[0].setStore(getString(R.string.beer_store0));

                card[1].setImage(R.drawable.b_1);
                card[1].setName(getString(R.string.beer_name1));
                card[1].setMobile(getString(R.string.beer_moblie1));
                card[1].setStore(getString(R.string.beer_store1));

                card[2].setImage(R.drawable.b_2);
                card[2].setName(getString(R.string.beer_name2));
                card[2].setMobile(getString(R.string.beer_moblie2));
                card[2].setStore(getString(R.string.beer_store2));

                card[3].setImage(R.drawable.b_3);
                card[3].setName(getString(R.string.beer_name3));
                card[3].setMobile(getString(R.string.beer_moblie3));
                card[3].setStore(getString(R.string.beer_store3));

                card[4].setImage(R.drawable.b_4);
                card[4].setName(getString(R.string.beer_name4));
                card[4].setMobile(getString(R.string.beer_moblie4));
                card[4].setStore(getString(R.string.beer_store4));

                card[5].setImage(R.drawable.b_5);
                card[5].setName(getString(R.string.beer_name5));
                card[5].setMobile(getString(R.string.beer_moblie5));
                card[5].setStore(getString(R.string.beer_store5));

                card[6].setImage(R.drawable.b_6);
                card[6].setName(getString(R.string.beer_name6));
                card[6].setMobile(getString(R.string.beer_moblie6));
                card[6].setStore(getString(R.string.beer_store6));

                card[7].setImage(R.drawable.b_7);
                card[7].setName(getString(R.string.beer_name7));
                card[7].setMobile(getString(R.string.beer_moblie7));
                card[7].setStore(getString(R.string.beer_store7));

                card[8].setImage(R.drawable.b_8);
                card[8].setName(getString(R.string.beer_name8));
                card[8].setMobile(getString(R.string.beer_moblie8));
                card[8].setStore(getString(R.string.beer_store8));

                card[9].setName(getString(R.string.beer_name9));
                card[9].setMobile("번호 없음");
                card[9].setStore(getString(R.string.beer_store9));

                card[10].setImage(R.drawable.b_10);
                card[10].setName(getString(R.string.beer_name10));
                card[10].setMobile(getString(R.string.beer_moblie10));
                card[10].setStore(getString(R.string.beer_store10));

                card[11].setImage(R.drawable.b_11);
                card[11].setName(getString(R.string.beer_name11));
                card[11].setMobile(getString(R.string.beer_moblie11));
                card[11].setStore(getString(R.string.beer_store11));

                card[12].setImage(R.drawable.b_12);
                card[12].setName(getString(R.string.beer_name12));
                card[12].setMobile("번호 없음");
                card[12].setStore(getString(R.string.beer_store12));

                card[13].setImage(R.drawable.b_13);
                card[13].setName(getString(R.string.beer_name13));
                card[13].setMobile(getString(R.string.beer_moblie13));
                card[13].setStore(getString(R.string.beer_store13));

                card[14].setName(getString(R.string.beer_name14));
                card[14].setMobile(getString(R.string.beer_moblie14));
                card[14].setStore(getString(R.string.beer_store14));

                card[15].setName(getString(R.string.beer_name15));
                card[15].setMobile(getString(R.string.beer_moblie15));
                card[15].setStore(getString(R.string.beer_store15));

                card[16].setImage(R.drawable.b_16);
                card[16].setName(getString(R.string.beer_name16));
                card[16].setMobile("번호 없음");
                card[16].setStore(getString(R.string.beer_store16));


                break;

            case 8:// 편의점 (최신화 완료)

                card[0].setImage(R.drawable.cu);
                card[0].setName(getString(R.string.store_name0));
                card[0].setMobile(getString(R.string.store_moblie0));
                card[0].setStore(getString(R.string.store_store0));

                card[1].setImage(R.drawable.cu);
                card[1].setName(getString(R.string.store_name1));
                card[1].setMobile("번호 없음");
                card[1].setStore(getString(R.string.store_store1));

                card[2].setImage(R.drawable.cu);
                card[2].setName(getString(R.string.store_name2));
                card[2].setMobile(getString(R.string.store_moblie2));
                card[2].setStore(getString(R.string.store_store2));

                card[3].setImage(R.drawable.cu);
                card[3].setName(getString(R.string.store_name3));
                card[3].setMobile(getString(R.string.store_moblie3));
                card[3].setStore(getString(R.string.store_store3));

                card[4].setImage(R.drawable.cu);
                card[4].setName(getString(R.string.store_name4));
                card[4].setMobile("번호 없음");
                card[4].setStore(getString(R.string.store_store4));

                card[5].setImage(R.drawable.cu);
                card[5].setName(getString(R.string.store_name5));
                card[5].setMobile(getString(R.string.store_moblie5));
                card[5].setStore(getString(R.string.store_store5));

                card[6].setImage(R.drawable.cu);
                card[6].setName(getString(R.string.store_name6));
                card[6].setMobile(getString(R.string.store_moblie6));
                card[6].setStore(getString(R.string.store_store6));

                card[7].setImage(R.drawable.eleven);
                card[7].setName(getString(R.string.store_name7));
                card[7].setMobile("번호 없음");
                card[7].setStore(getString(R.string.store_store7));

                card[8].setImage(R.drawable.eleven);
                card[8].setName(getString(R.string.store_name8));
                card[8].setMobile(getString(R.string.store_moblie8));
                card[8].setStore(getString(R.string.store_store8));

                card[9].setImage(R.drawable.eleven);
                card[9].setName(getString(R.string.store_name9));
                card[9].setMobile("번호 없음");
                card[9].setStore(getString(R.string.store_store9));

                card[10].setImage(R.drawable.eleven);
                card[10].setName(getString(R.string.store_name10));
                card[10].setMobile(getString(R.string.store_moblie10));
                card[10].setStore(getString(R.string.store_store10));

                card[11].setImage(R.drawable.gs25);
                card[11].setName(getString(R.string.store_name11));
                card[11].setMobile(getString(R.string.store_moblie11));
                card[11].setStore(getString(R.string.store_store11));

                card[12].setImage(R.drawable.gs25);
                card[12].setName(getString(R.string.store_name12));
                card[12].setMobile(getString(R.string.store_moblie12));
                card[12].setStore(getString(R.string.store_store12));

                card[13].setImage(R.drawable.gs25);
                card[13].setName(getString(R.string.store_name13));
                card[13].setMobile(getString(R.string.store_moblie13));
                card[13].setStore(getString(R.string.store_store13));

                card[14].setImage(R.drawable.gs25);
                card[14].setName(getString(R.string.store_name14));
                card[14].setMobile(getString(R.string.store_moblie14));
                card[14].setStore(getString(R.string.store_store14));

                break;

        }
    }
}
