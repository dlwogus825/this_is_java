package com.mjc813;

public class Task5 implements Remocon{

    @Override
    public void powerOn(){
        System.out.println("전원이 켜졌소");
    }

    public static void run(){
        Remocon r = new Task5();
        r.powerOn();
    }
}



