package com.mjc813.chapter07;

public class Q5 {
    public void run(){
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();
    }
}
