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
    private CardActivity[] card = new CardActivity[20];
    private Integer[] cardIDs = { R.id.store0, R.id.store1, R.id.store2, R.id.store3, R.id.store4, R.id.store5, R.id.store6, R.id.store7, R.id.store8, R.id.store9, R.id.store10, R.id.store11, R.id.store12, R.id.store13, R.id.store14, R.id.store15, R.id.store16, R.id.store17, R.id.store18,
            R.id.store19, R.id.store20, };


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


        number = intent.getIntExtra("number", -1); //MainAdapter에서 전달된 데이터를 받음.

        switch (number) {  //각각의 아이템에 따라 어떻게 화면이 바뀔지 swith문으로 나타냄.
            case 0: //  한식

                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName("민속식당");
                card[0].setMobile("031-751-7977");
                card[0].setStore("경기 성남시 수정구 복정로 28");

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName("알촌");
                card[1].setMobile("070-7768-0598");
                card[1].setStore("경기 성남시 수정구 복정로 20");

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName("육마니 한방보쌈");
                card[2].setMobile("031-752-1972");
                card[2].setStore("경기 성남시 수정구 복정로20번길 1");

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName("국대오리");
                card[3].setMobile("031-756-5289");
                card[3].setStore("경기 성남시 수정구 복정로 23"); //주소 겹칩

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName("돈돈이네");
                card[4].setMobile("031-756-9282");
                card[4].setStore("경기 성남시 수정구 복정로 23"); //주소 겹칩

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName("다정 한식뷔페");
                card[5].setMobile("031-757-6552");
                card[5].setStore("경기 성남시 수정구 복정로 45");

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName("백채 김치찌개");
                card[6].setMobile("031-722-5690");
                card[6].setStore("경기 성남시 수정구 복정로 88");

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName("8257 의정부 부대찌개");
                card[7].setMobile("031-758-8939");
                card[7].setStore("경기 성남시 수정구 복정로 45");

                card[8].setImage(R.mipmap.ic_launcher);
                card[8].setName("할매순대국 동서울대점");
                card[8].setMobile("031-758-6637");
                card[8].setStore("경기 성남시 수정구 복정로 92-1");

                card[9].setImage(R.mipmap.ic_launcher);
                card[9].setName("전통할매순대국 복정점");
                card[9].setMobile("031-756-3258");
                card[9].setStore("경기 성남시 수정구 복정로 64");

                break;

            case 1: //중식

                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName("홍짜장");
                card[0].setMobile("031-755-4071");
                card[0].setStore("경기 성남시 수정구 복정로 28");

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName("황궁");
                card[1].setMobile("010-9135-7165");
                card[1].setStore("경기 성남시 수정구 복정로 14");

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName("만다린");
                card[2].setMobile("031-751-4455");
                card[2].setStore("경기 성남시 수정구 복정로 58");

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName("참진 해물짬뽕짜장");
                card[3].setMobile("031-723-8786");
                card[3].setStore("경기 성남시 수정구 복정로 51-1 1층");

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName("현짜장");
                card[4].setMobile("031-721-4775");
                card[4].setStore("경기 성남시 수정구 복정로 83 1층");

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName("부자뿅의전설");
                card[5].setMobile("031-753-8680");
                card[5].setStore("경기 성남시 수정구 복정로 105");

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName("장원각");
                card[6].setMobile("031-625-0072");
                card[6].setStore("경기 성남시 수정구 복정로20번길 1");

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName("마라킹");
                card[7].setMobile("070-8621-2771");
                card[7].setStore("경기 성남시 수정구 복정로 92 102호");

                card[8].setImage(R.mipmap.ic_launcher);
                card[8].setName("행복로드마라탕");
                card[8].setMobile("070-7543-6867");
                card[8].setStore("경기 성남시 수정구 복정로 81");

                card[9].setImage(R.mipmap.ic_launcher);
                card[9].setName("중림");
                card[9].setMobile("031-722-4881");
                card[9].setStore("경기 성남시 수정구 복정로 127-1");

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

                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName("스타동");
                card[0].setMobile("031-757-5922");
                card[0].setStore("경기 성남시 수정구 복정로 45 1층");

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName("겐코 덮밥 라멘집");
                card[1].setMobile("031-752-2527");
                card[1].setStore("경기 성남시 수정구 복정로 18 1층");

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName("도모다찌 오코노미야끼");
                card[2].setMobile("031-752-7955");
                card[2].setStore("경기 성남시 수정구 복정로 29");

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName("가츠야");
                card[3].setMobile("0507-1400-5057");
                card[3].setStore("경기 성남시 수정구 성남대로1518번길 10");

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName("정진욱의 돈까스가게");
                card[4].setMobile("0507-1318-2859");
                card[4].setStore("경기 성남시 수정구 복정로106번길 1");

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName("카츠선 동서울대본점");
                card[5].setMobile("0507-1323-5076");
                card[5].setStore("경기 성남시 수정구 복정로 64 1층 카츠선");

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName("회스시");
                card[6].setMobile("0507-1313-9710");
                card[6].setStore("경기 성남시 수정구 성남대로1416번길 14");

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName("희락돈까스");
                card[7].setMobile("031-759-0982");
                card[7].setStore("경기 성남시 수정구 복정로 43");

                card[8].setImage(R.mipmap.ic_launcher);
                card[8].setName(" 포크포크");
                card[8].setMobile("031-751-3223");
                card[8].setStore("경기 성남시 수정구 복정로 30");

                card[9].setImage(R.mipmap.ic_launcher);
                card[9].setName("WAMAN 돈까스");
                card[9].setMobile("031-756-9288");
                card[9].setStore("경기 성남시 수정구 복정로 53 1층");

                break;

            case 4://분식

                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName("미스터 떡볶이");
                card[0].setMobile("031-751-8250");
                card[0].setStore("경기 성남시 수정구 복정로 68");

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName("신전 떡볶이");
                card[1].setMobile("031-753-9399");
                card[1].setStore("경기 성남시 수정구 복정로42번길 1");

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName("서경꼬마김밥");
                card[2].setMobile("031-755-5575");
                card[2].setStore("경기 성남시 수정구 복정로 66");

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName("오떡후 복정점");
                card[3].setMobile("031-758-5296");
                card[3].setStore("경기 성남시 수정구 복정로158번길 11 1층");

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName("우짜돈 본점");
                card[4].setMobile("031-751-2111");
                card[4].setStore("경기 성남시 수정구 성남대로 1522 1층");

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName("그집김밥");
                card[5].setMobile("031-757-1434");
                card[5].setStore("경기 성남시 수정구 성남대로1518번길 8");

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName("회스시");
                card[6].setMobile("0507-1313-9710");
                card[6].setStore("경기 성남시 수정구 성남대로1416번길 14");

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName("참새방앗간");
                card[7].setMobile("031-757-3159");
                card[7].setStore("경기 성남시 수정구 성남대로1480번길 9");

                card[8].setImage(R.mipmap.ic_launcher);
                card[8].setName(" 엉터리분식");
                card[8].setMobile("031-759-5388");
                card[8].setStore("경기 성남시 수정구 복정로 18 지산빌딩");

                card[9].setImage(R.mipmap.ic_launcher);
                card[9].setName("밥마리김밥");
                card[9].setMobile("031-755-7977");
                card[9].setStore("경기 성남시 수정구 복정로 68");

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
            case 6://카페 베이커리

                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName("좋은날");
                card[0].setMobile("0507-1359-4587");
                card[0].setStore("경기 성남시 수정구 복정로 71");

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName("빽다방");
                card[1].setMobile("031-753-9399");
                card[1].setStore("경기 성남시 수정구 복정로72번길 4");

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName("장산다방");
                card[2].setMobile("031-756-0248");
                card[2].setStore("경기 성남시 수정구 복정로 67 장산다방 동서울대점");

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName("카페 컴퍼");
                card[3].setMobile("031-759-7655");
                card[3].setStore("경기 성남시 수정구 복정로 91 쎄븐빌딩 1층");

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName("예니네 카페");
                card[4].setMobile("0507-1395-1112");
                card[4].setStore("경기 성남시 수정구 복정로 57 1층");

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName("카페 1988");
                card[5].setMobile("0507-1388-2444");
                card[5].setStore("경기 성남시 수정구 복정로 5 1F");

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName("오르막커피");
                card[6].setMobile("0507-1325-5552");
                card[6].setStore("경기 성남시 수정구 복정로 5-1");

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName("이디야커피");
                card[7].setMobile("031-755-2575");
                card[7].setStore("경기 성남시 수정구 복정로 121");

                card[8].setImage(R.mipmap.ic_launcher);
                card[8].setName("이디야커피 동서울대점");
                card[8].setMobile("031-757-7523");
                card[8].setStore("경기 성남시 수정구 복정로 68");

                card[9].setImage(R.mipmap.ic_launcher);
                card[9].setName("몬스타커피(도서관건물1층)");
                card[9].setMobile("070-4200-0133");
                card[9].setStore("경기 성남시 수정구 복정로 76");

                break;

            case 7:// 술집

                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName("리어카포차");
                card[0].setMobile("0507-1378-3282");
                card[0].setStore("경기 성남시 수정구 복정로 46 1층 실내포차");

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName("둥근달포차");
                card[1].setMobile("031-756-9447");
                card[1].setStore("경기 성남시 수정구 복정로 51 101");

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName("UP & DOWN 포차");
                card[2].setMobile("031-752-8845");
                card[2].setStore("경기 성남시 수정구 복정로 56");

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName("BLISS 펍");
                card[2].setMobile("0507-1449-2045");
                card[2].setStore("경기 성남시 수정구 복정로 63-1 블리스펍 2층");

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName("아랫달밤");
                card[3].setMobile("031-753-0991");
                card[3].setStore("경기 성남시 수정구 복정로42번길 1");

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName("역전할머니 맥주");
                card[4].setMobile("031-723-7282");
                card[4].setStore("경기 성남시 수정구 복정로 61");

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName("아지트");
                card[5].setMobile("031-759-7119");
                card[5].setStore("경기 성남시 수정구 복정로20번길 14");

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName("늘푸른바다포차");
                card[6].setMobile("010-9135-7165");
                card[6].setStore("경기 성남시 수정구 복정로 7");

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName("은하");
                card[7].setMobile("0507-1354-2910");
                card[7].setStore("경기 성남시 수정구 복정로 116-1");

                card[8].setImage(R.mipmap.ic_launcher);
                card[8].setName("킹핀비어");
                card[8].setMobile("031-758-6169");
                card[8].setStore("경기 성남시 수정구 복정로 89");
                break;

            case 8:// 편의점

                card[0].setImage(R.mipmap.ic_launcher);
                card[0].setName("CU 복정하나점");
                card[0].setMobile("031-753-9809");
                card[0].setStore("경기 성남시 수정구 복정로 135 미보빌딩");

                card[1].setImage(R.mipmap.ic_launcher);
                card[1].setName("CU 복정빌리지점");
                card[1].setMobile("번호 없음");
                card[1].setStore("경기 성남시 수정구 복정로134번길 22-10 - 10");

                card[2].setImage(R.mipmap.ic_launcher);
                card[2].setName("CU 동서울대도서관점");
                card[2].setMobile("02-3397-6252");
                card[2].setStore("경기 성남시 수정구 복정로 76 동서울대학교 학산도서관");

                card[3].setImage(R.mipmap.ic_launcher);
                card[3].setName("CU 복정원룸점");
                card[3].setMobile("031-723-6315");
                card[3].setStore("경기 성남시 수정구 복정로96번길 18");

                card[4].setImage(R.mipmap.ic_launcher);
                card[4].setName("CU 성남복정프리미엄점");
                card[4].setMobile("전화없음");
                card[4].setStore("경기 성남시 수정구 복정로 67");

                card[5].setImage(R.mipmap.ic_launcher);
                card[5].setName("CU 성남복정점");
                card[5].setMobile("031-755-3690");
                card[5].setStore("경기 성남시 수정구 복정로32번길 1");

                card[6].setImage(R.mipmap.ic_launcher);
                card[6].setName("CU 복정으뜸점");
                card[6].setMobile("031-754-7270");
                card[6].setStore("경기 성남시 수정구 성남대로1390번길 25-2");

                card[7].setImage(R.mipmap.ic_launcher);
                card[7].setName("GS25 복정도서관점");
                card[7].setMobile("031-723-0040");
                card[7].setStore("경기 성남시 수정구 복정로72번길 4");

                card[8].setImage(R.mipmap.ic_launcher);
                card[8].setName("세븐일레븐 성남복정국제점");
                card[8].setMobile("전화 없음");
                card[8].setStore("경기 성남시 수정구 복정로134번길 12");

                card[9].setImage(R.mipmap.ic_launcher);
                card[9].setName("세븐일레븐 복정라이브러리점");
                card[9].setMobile("031-759-0438");
                card[9].setStore("경기 성남시 수정구 복정로118번길 1");

                break;

        }
    }
}
