package com.mjc813;

public class Television1 implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }
}