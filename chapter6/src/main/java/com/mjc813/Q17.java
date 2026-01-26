package com.mjc813;

public class Q17 {
    public void run(){

        Car6 myCar = new Car6();

        myCar.setSpeed(-50);
        System.out.println("현재속도:"+ myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재속도: "+ myCar.getSpeed());

        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재속도" + myCar.getSpeed());
    }
}
