package com.mjc813.chapter07;

public class SmartPhone2 extends Phone2{
    SmartPhone2(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
