package com.mjc813.chapter07;
import lombok.Getter;
import lombok.Setter;

@Getter  // 모든 필드에 getter 자동 생성
@Setter
public class Phone {
    private  String model;
    private  String color;


    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }

}