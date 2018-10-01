package com.yikyung.thirty;

import java.lang.String;
import java.time.LocalDateTime;

public class MoneyDiary {
    int 수입;
    int 지출;
    int 잔액;
    String 내용;
    LocalDateTime 날짜;

    //main은 하나의 클래스에 하나만 있을 수 있고, 클래스에서 가장 먼저 호출되는 메소드이다.
    public static void main(String[] args) {

        MoneyDiary moneyDiary = new MoneyDiary();

        System.out.println(moneyDiary.잔액);
    }
}