package com.mjc813.chapter07;

public class Q6 {
    public static void run(){
        Car2 mycar = new Car2();

        mycar.tire = new Tire();
        mycar.run();

        mycar.tire = new HankookTire();
        mycar.run();

        mycar.tire = new KumhoTire();
        mycar.run();
    }
}
