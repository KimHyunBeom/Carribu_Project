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

        CardActivity card0 = findViewById(R.id.store0); //한식

        CardActivity card1 = findViewById(R.id.store1); //한식

        CardActivity card2 = findViewById(R.id.store2); //한식

        CardActivity card3 = findViewById(R.id.store3); //한식

        CardActivity card4 = findViewById(R.id.store4); //한식

        CardActivity card5 = findViewById(R.id.store5); //한식

        CardActivity card6 = findViewById(R.id.store6); //한식

        CardActivity card7 = findViewById(R.id.store7); //한식

        CardActivity card8 = findViewById(R.id.store8); //한식

        CardActivity card9 = findViewById(R.id.store9); //한식




        number = intent.getIntExtra("number", -1); //MainAdapter에서 전달된 데이터를 받음.

        switch (number) {  //각각의 아이템에 따라 어떻게 화면이 바뀔지 swith문으로 나타냄.
            case 0: //  한식

                card0.setImage(R.mipmap.ic_launcher);
                card0.setName("민속식당");
                card0.setMobile("031-751-7977");
                card0.setStore("경기 성남시 수정구 복정로 28");

                card1.setImage(R.mipmap.ic_launcher);
                card1.setName("알촌");
                card1.setMobile("070-7768-0598");
                card1.setStore("경기 성남시 수정구 복정로 20");

                card2.setImage(R.mipmap.ic_launcher);
                card2.setName("육마니 한방보쌈");
                card2.setMobile("031-752-1972");
                card2.setStore("경기 성남시 수정구 복정로20번길 1");

                card3.setImage(R.mipmap.ic_launcher);
                card3.setName("국대오리");
                card3.setMobile("031-756-5289");
                card3.setStore("경기 성남시 수정구 복정로 23"); //주소 겹칩

                card4.setImage(R.mipmap.ic_launcher);
                card4.setName("돈돈이네");
                card4.setMobile("031-756-9282");
                card4.setStore("경기 성남시 수정구 복정로 23"); //주소 겹칩

                card5.setImage(R.mipmap.ic_launcher);
                card5.setName("다정 한식뷔페");
                card5.setMobile("031-757-6552");
                card5.setStore("경기 성남시 수정구 복정로 45");

                card6.setImage(R.mipmap.ic_launcher);
                card6.setName("백채 김치찌개");
                card6.setMobile("031-722-5690");
                card6.setStore("경기 성남시 수정구 복정로 88");

                card7.setImage(R.mipmap.ic_launcher);
                card7.setName("8257 의정부 부대찌개");
                card7.setMobile("031-758-8939");
                card7.setStore("경기 성남시 수정구 복정로 45");

                card8.setImage(R.mipmap.ic_launcher);
                card8.setName("할매순대국 동서울대점");
                card8.setMobile("031-758-6637");
                card8.setStore("경기 성남시 수정구 복정로 92-1");

                card9.setImage(R.mipmap.ic_launcher);
                card9.setName("전통할매순대국 복정점");
                card9.setMobile("031-756-3258");
                card9.setStore("경기 성남시 수정구 복정로 64");

                break;

            case 1: //중식
                card0.setImage(R.mipmap.ic_launcher);
                card0.setName("홍짜장");
                card0.setMobile("031-755-4071");
                card0.setStore("경기 성남시 수정구 복정로 28");

                card1.setImage(R.mipmap.ic_launcher);
                card1.setName("황궁");
                card1.setMobile("010-9135-7165");
                card1.setStore("경기 성남시 수정구 복정로 14");

                card2.setImage(R.mipmap.ic_launcher);
                card2.setName("만다린");
                card2.setMobile("031-751-4455");
                card2.setStore("경기 성남시 수정구 복정로 58");

                card3.setImage(R.mipmap.ic_launcher);
                card3.setName("참진 해물짬뽕짜장");
                card3.setMobile("031-723-8786");
                card3.setStore("경기 성남시 수정구 복정로 51-1 1층");

                card4.setImage(R.mipmap.ic_launcher);
                card4.setName("현짜장");
                card4.setMobile("031-721-4775");
                card4.setStore("경기 성남시 수정구 복정로 83 1층");

                card5.setImage(R.mipmap.ic_launcher);
                card5.setName("부자뿅의전설");
                card5.setMobile("031-753-8680");
                card5.setStore("경기 성남시 수정구 복정로 105");

                card6.setImage(R.mipmap.ic_launcher);
                card6.setName("장원각");
                card6.setMobile("031-625-0072");
                card6.setStore("경기 성남시 수정구 복정로20번길 1");

                card7.setImage(R.mipmap.ic_launcher);
                card7.setName("마라킹");
                card7.setMobile("070-8621-2771");
                card7.setStore("경기 성남시 수정구 복정로 92 102호");

                card8.setImage(R.mipmap.ic_launcher);
                card8.setName("행복로드마라탕");
                card8.setMobile("070-7543-6867");
                card8.setStore("경기 성남시 수정구 복정로 81");

                card9.setImage(R.mipmap.ic_launcher);
                card9.setName("중림");
                card9.setMobile("031-722-4881");
                card9.setStore("경기 성남시 수정구 복정로 127-1");

                break;

            case 2://아시안 양식
                card0.setImage(R.mipmap.ic_launcher);
                card0.setName("테리엔치킨/카페테리 파스타");
                card0.setMobile("0507-1412-9060");
                card0.setStore("경기 성남시 수정구 복정로40");

                card1.setImage(R.mipmap.ic_launcher);
                card1.setName("피자스쿨");
                card1.setMobile("031-755-1002");
                card1.setStore("경기 성남시 수정구 복정로 43");

                card2.setImage(R.mipmap.ic_launcher);
                card2.setName("스파게티 올리브");
                card2.setMobile("031-756-7788");
                card2.setStore("경기 성남시 수정구 복정로 68 1층");

                card3.setImage(R.mipmap.ic_launcher);
                card3.setName("via.246");
                card3.setMobile("0507-1350-8942");
                card3.setStore("경기 성남시 수정구 복정로106번길 4");

                card4.setImage(R.mipmap.ic_launcher);
                card4.setName("몽둥이 부리또");
                card4.setMobile("031-721-5022");
                card4.setStore("경기 성남시 수정구 복정로 86");


                break;


            case 3://일식

                card0.setImage(R.mipmap.ic_launcher);
                card0.setName("스타동");
                card0.setMobile("031-757-5922");
                card0.setStore("경기 성남시 수정구 복정로 45 1층");

                card1.setImage(R.mipmap.ic_launcher);
                card1.setName("겐코 덮밥 라멘집");
                card1.setMobile("031-752-2527");
                card1.setStore("경기 성남시 수정구 복정로 18 1층");

                card2.setImage(R.mipmap.ic_launcher);
                card2.setName("도모다찌 오코노미야끼");
                card2.setMobile("031-752-7955");
                card2.setStore("경기 성남시 수정구 복정로 29");

                card3.setImage(R.mipmap.ic_launcher);
                card3.setName("가츠야");
                card3.setMobile("0507-1400-5057");
                card3.setStore("경기 성남시 수정구 성남대로1518번길 10");

                card4.setImage(R.mipmap.ic_launcher);
                card4.setName("정진욱의 돈까스가게");
                card4.setMobile("0507-1318-2859");
                card4.setStore("경기 성남시 수정구 복정로106번길 1");

                card5.setImage(R.mipmap.ic_launcher);
                card5.setName("카츠선 동서울대본점");
                card5.setMobile("0507-1323-5076");
                card5.setStore("경기 성남시 수정구 복정로 64 1층 카츠선");

                card6.setImage(R.mipmap.ic_launcher);
                card6.setName("회스시");
                card6.setMobile("0507-1313-9710");
                card6.setStore("경기 성남시 수정구 성남대로1416번길 14");

                card7.setImage(R.mipmap.ic_launcher);
                card7.setName("희락돈까스");
                card7.setMobile("031-759-0982");
                card7.setStore("경기 성남시 수정구 복정로 43");

                card8.setImage(R.mipmap.ic_launcher);
                card8.setName(" 포크포크");
                card8.setMobile("031-751-3223");
                card8.setStore("경기 성남시 수정구 복정로 30");

                card9.setImage(R.mipmap.ic_launcher);
                card9.setName("WAMAN 돈까스");
                card9.setMobile("031-756-9288");
                card9.setStore("경기 성남시 수정구 복정로 53 1층");


                break;
            case 4://분식

                card0.setImage(R.mipmap.ic_launcher);
                card0.setName("미스터 떡볶이");
                card0.setMobile("031-751-8250");
                card0.setStore("경기 성남시 수정구 복정로 68");

                card1.setImage(R.mipmap.ic_launcher);
                card1.setName("신전 떡볶이");
                card1.setMobile("031-753-9399");
                card1.setStore("경기 성남시 수정구 복정로42번길 1");

                card2.setImage(R.mipmap.ic_launcher);
                card2.setName("서경꼬마김밥");
                card2.setMobile("031-755-5575");
                card2.setStore("경기 성남시 수정구 복정로 66");

                card3.setImage(R.mipmap.ic_launcher);
                card3.setName("오떡후 복정점");
                card3.setMobile("031-758-5296");
                card3.setStore("경기 성남시 수정구 복정로158번길 11 1층");

                card4.setImage(R.mipmap.ic_launcher);
                card4.setName("우짜돈 본점");
                card4.setMobile("031-751-2111");
                card4.setStore("경기 성남시 수정구 성남대로 1522 1층");

                card5.setImage(R.mipmap.ic_launcher);
                card5.setName("그집김밥");
                card5.setMobile("031-757-1434");
                card5.setStore("경기 성남시 수정구 성남대로1518번길 8");

                card6.setImage(R.mipmap.ic_launcher);
                card6.setName("회스시");
                card6.setMobile("0507-1313-9710");
                card6.setStore("경기 성남시 수정구 성남대로1416번길 14");

                card7.setImage(R.mipmap.ic_launcher);
                card7.setName("참새방앗간");
                card7.setMobile("031-757-3159");
                card7.setStore("경기 성남시 수정구 성남대로1480번길 9");

                card8.setImage(R.mipmap.ic_launcher);
                card8.setName(" 엉터리분식");
                card8.setMobile("031-759-5388");
                card8.setStore("경기 성남시 수정구 복정로 18 지산빌딩");

                card9.setImage(R.mipmap.ic_launcher);
                card9.setName("밥마리김밥");
                card9.setMobile("031-755-7977");
                card9.setStore("경기 성남시 수정구 복정로 68");

                break;

            case 5://페스트푸드

                card0.setImage(R.mipmap.ic_launcher);
                card0.setName("노브랜드");
                card0.setMobile("031-759-0352");
                card0.setStore("경기 성남시 수정구 복정로 69");

                card1.setImage(R.mipmap.ic_launcher);
                card1.setName("맘스터치");
                card1.setMobile("031-751-0027");
                card1.setStore("경기 성남시 수정구 복정로 86");

                card2.setImage(R.mipmap.ic_launcher);
                card2.setName("봉구통닭");
                card2.setMobile("031-755-6644");
                card2.setStore("경기 성남시 수정구 복정로 47 1층");

                card3.setImage(R.mipmap.ic_launcher);
                card3.setName("부뚜막 치킨");
                card3.setMobile("031-759-5582");
                card3.setStore("경기 성남시 수정구 복정로 48");

                card4.setImage(R.mipmap.ic_launcher);
                card4.setName("처갓집양념치킨");
                card4.setMobile("031-759-0680");
                card4.setStore("경기 성남시 수정구 복정로 92-1");

                card5.setImage(R.mipmap.ic_launcher);
                card5.setName("알랑치킨");
                card5.setMobile("031-756-9288");
                card5.setStore("경기 성남시 수정구 복정로 53");

                card6.setImage(R.mipmap.ic_launcher);
                card6.setName("비어킹");
                card6.setMobile("031-753-1966");
                card6.setStore("경기 성남시 수정구 복정로 52");

                card7.setImage(R.mipmap.ic_launcher);
                card7.setName("쁘이치킨");
                card7.setMobile("031-751-0564");
                card7.setStore("경기 성남시 수정구 복정로106번길 1");


                break;
            case 6://카페 베이커리


                card0.setImage(R.mipmap.ic_launcher);
                card0.setName("좋은날");
                card0.setMobile("0507-1359-4587");
                card0.setStore("경기 성남시 수정구 복정로 71");

                card1.setImage(R.mipmap.ic_launcher);
                card1.setName("빽다방");
                card1.setMobile("031-753-9399");
                card1.setStore("경기 성남시 수정구 복정로72번길 4");

                card2.setImage(R.mipmap.ic_launcher);
                card2.setName("장산다방");
                card2.setMobile("031-756-0248");
                card2.setStore("경기 성남시 수정구 복정로 67 장산다방 동서울대점");

                card3.setImage(R.mipmap.ic_launcher);
                card3.setName("카페 컴퍼");
                card3.setMobile("031-759-7655");
                card3.setStore("경기 성남시 수정구 복정로 91 쎄븐빌딩 1층");

                card4.setImage(R.mipmap.ic_launcher);
                card4.setName("예니네 카페");
                card4.setMobile("0507-1395-1112");
                card4.setStore("경기 성남시 수정구 복정로 57 1층");

                card5.setImage(R.mipmap.ic_launcher);
                card5.setName("카페 1988");
                card5.setMobile("0507-1388-2444");
                card5.setStore("경기 성남시 수정구 복정로 5 1F");

                card6.setImage(R.mipmap.ic_launcher);
                card6.setName("오르막커피");
                card6.setMobile("0507-1325-5552");
                card6.setStore("경기 성남시 수정구 복정로 5-1");

                card7.setImage(R.mipmap.ic_launcher);
                card7.setName("이디야커피");
                card7.setMobile("031-755-2575");
                card7.setStore("경기 성남시 수정구 복정로 121");

                card8.setImage(R.mipmap.ic_launcher);
                card8.setName("이디야커피 동서울대점");
                card8.setMobile("031-757-7523");
                card8.setStore("경기 성남시 수정구 복정로 68");

                card9.setImage(R.mipmap.ic_launcher);
                card9.setName("몬스타커피(도서관건물1층)");
                card9.setMobile("070-4200-0133");
                card9.setStore("경기 성남시 수정구 복정로 76");

                break;
            case 7:// 술집
                card0.setImage(R.mipmap.ic_launcher);
                card0.setName("리어카포차");
                card0.setMobile("0507-1378-3282");
                card0.setStore("경기 성남시 수정구 복정로 46 1층 실내포차");

                card1.setImage(R.mipmap.ic_launcher);
                card1.setName("둥근달포차");
                card1.setMobile("031-756-9447");
                card1.setStore("경기 성남시 수정구 복정로 51 101");

                card2.setImage(R.mipmap.ic_launcher);
                card2.setName("UP & DOWN 포차");
                card2.setMobile("031-752-8845");
                card2.setStore("경기 성남시 수정구 복정로 56");

                card3.setImage(R.mipmap.ic_launcher);
                card3.setName("BLISS 펍");
                card3.setMobile("0507-1449-2045");
                card3.setStore("경기 성남시 수정구 복정로 63-1 블리스펍 2층");

                card4.setImage(R.mipmap.ic_launcher);
                card4.setName("아랫달밤");
                card4.setMobile("031-753-0991");
                card4.setStore("경기 성남시 수정구 복정로42번길 1");

                card5.setImage(R.mipmap.ic_launcher);
                card5.setName("역전할머니 맥주");
                card5.setMobile("031-723-7282");
                card5.setStore("경기 성남시 수정구 복정로 61");

                card6.setImage(R.mipmap.ic_launcher);
                card6.setName("아지트");
                card6.setMobile("031-759-7119");
                card6.setStore("경기 성남시 수정구 복정로20번길 14");

                card7.setImage(R.mipmap.ic_launcher);
                card7.setName("늘푸른바다포차");
                card7.setMobile("010-9135-7165");
                card7.setStore("경기 성남시 수정구 복정로 7");

                card8.setImage(R.mipmap.ic_launcher);
                card8.setName("은하");
                card8.setMobile("0507-1354-2910");
                card8.setStore("경기 성남시 수정구 복정로 116-1");

                card9.setImage(R.mipmap.ic_launcher);
                card9.setName("킹핀비어");
                card9.setMobile("031-758-6169");
                card9.setStore("경기 성남시 수정구 복정로 89");
                break;

            case 8:// 편의점

                card0.setImage(R.mipmap.ic_launcher);
                card0.setName("CU 복정하나점");
                card0.setMobile("031-753-9809");
                card0.setStore("경기 성남시 수정구 복정로 135 미보빌딩");

                card1.setImage(R.mipmap.ic_launcher);
                card1.setName("CU 복정빌리지점");
                card1.setMobile("번호 없음");
                card1.setStore("경기 성남시 수정구 복정로134번길 22-10 - 10");

                card2.setImage(R.mipmap.ic_launcher);
                card2.setName("CU 동서울대도서관점");
                card2.setMobile("02-3397-6252");
                card2.setStore("경기 성남시 수정구 복정로 76 동서울대학교 학산도서관");

                card3.setImage(R.mipmap.ic_launcher);
                card3.setName("CU 복정원룸점");
                card3.setMobile("031-723-6315");
                card3.setStore("경기 성남시 수정구 복정로96번길 18");

                card4.setImage(R.mipmap.ic_launcher);
                card4.setName("CU 성남복정프리미엄점");
                card4.setMobile("전화없음");
                card4.setStore("경기 성남시 수정구 복정로 67");

                card5.setImage(R.mipmap.ic_launcher);
                card5.setName("CU 성남복정점");
                card5.setMobile("031-755-3690");
                card5.setStore("경기 성남시 수정구 복정로32번길 1");

                card6.setImage(R.mipmap.ic_launcher);
                card6.setName("CU 복정으뜸점");
                card6.setMobile("031-754-7270");
                card6.setStore("경기 성남시 수정구 성남대로1390번길 25-2");

                card7.setImage(R.mipmap.ic_launcher);
                card7.setName("GS25 복정도서관점");
                card7.setMobile("031-723-0040");
                card7.setStore("경기 성남시 수정구 복정로72번길 4");

                card8.setImage(R.mipmap.ic_launcher);
                card8.setName("세븐일레븐 성남복정국제점");
                card8.setMobile("전화 없음");
                card8.setStore("경기 성남시 수정구 복정로134번길 12");

                card9.setImage(R.mipmap.ic_launcher);
                card9.setName("세븐일레븐 복정라이브러리점");
                card9.setMobile("031-759-0438");
                card9.setStore("경기 성남시 수정구 복정로118번길 1");



                break;
        }
    }
}
