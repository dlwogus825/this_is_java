package com.mjc813;

public class Q2 {
    public static void run(){
        RemoteControl2 rc;

        rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}
