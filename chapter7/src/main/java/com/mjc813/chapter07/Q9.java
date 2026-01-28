package com.mjc813.chapter07;

public class Q9 {
    public static void run(){
        SmartPhone2 smartPhone2 = new SmartPhone2("홍길동");

        System.out.println("소유자: "+ smartPhone2.getOwner());

        smartPhone2.turnOn();
        smartPhone2.internetSearch();
        smartPhone2.turnOff();

        System.out.println(smartPhone2.getOwner() + "님의 폰 사용 종료");
    }
}
