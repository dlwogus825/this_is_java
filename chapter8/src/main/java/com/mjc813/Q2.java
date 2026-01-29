package com.mjc813;

public class Q2 {
    public static void run(){
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}
