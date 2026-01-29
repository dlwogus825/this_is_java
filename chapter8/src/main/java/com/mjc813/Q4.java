package com.mjc813;

public class Q4 {
    public static void run(){
        RemoteControl2 rc;

        rc = new Television2();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
