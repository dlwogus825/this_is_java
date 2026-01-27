package com.mjc813.chapter07;

public class Dclass extends Aclass{

    public Dclass() {
        super();
    }

    public void method1(){
        this.field = "value";
        this.method();
    }

    public void method2(){
        Aclass a = new Aclass();
        a.field = "value";
        a.method();
    }
}
