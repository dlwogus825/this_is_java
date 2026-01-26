package com.mjc813;

public class SIngleton {

    private static SIngleton singleton = SIngleton();


    private SIngleton(){

    }
    public static SIngleton getInstance(){
        return singleton;
    }
}
