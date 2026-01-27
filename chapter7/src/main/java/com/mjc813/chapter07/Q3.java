package com.mjc813.chapter07;


//메소드 오버라이딩에 대한 부분이다. 상속된 메소드를 자식 클래스에서 재정의 하는것을 의미한다.
public class Q3 {
    public void run(){

        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적:" + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적"+ computer.areaCircle(r));



    }
}
