package com.mjc813;

public class Q9 {
    public void run(){

        Car3 myCar = new Car3();

        myCar.setGas(5);

        if(myCar.isLeftGas()){
            System.out.println("출발합니다.");

            myCar.run();
        }
        System.out.println("가스를 주입하세용><");
    }
}
