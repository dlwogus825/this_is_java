package com.mjc813;

public class Q1 {
    public static void run() {

        RemoteControl rc = new Television1();
        rc.turnOn();
        //인터페이스를 구현한 클래스의 객체는 담을 수 있다.
        //turnOn() { System.out.println("Tv를 켭니다"); }  ← 이 코드 전체를 통째로 담았다.

    }
}
