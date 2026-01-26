package com.mjc813;

public class Singleton {  // I를 i로

    private static Singleton singleton = new Singleton();  // new 추가!

    private Singleton(){
    }

    public static Singleton getInstance(){
        return singleton;
    }
}