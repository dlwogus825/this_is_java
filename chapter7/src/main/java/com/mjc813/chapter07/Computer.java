package com.mjc813.chapter07;

public class Computer extends Calculator {

    @Override // 이것이 메소드 오버라이드이다. 상속되는 값을 변환시킬
    public double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI*r*r;
    }

}
