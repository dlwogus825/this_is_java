package com.mjc813;

public class Q4 {
    public void run(){

        Korean K1 = new Korean("박자바", "01125-1234567");

        System.out.println("k1.nation"+ K1.nation);
        System.out.println("k1.name"+ K1.name);
        System.out.println("k1.ssn :"+ K1.ssn);
        System.out.println();

        Korean k2 = new Korean("김자바","930525-0654321");

        System.out.println("k2.nation"+ k2.nation);
        System.out.println("k2.name"+ k2.name);
        System.out.println("k2.ssn"+ k2.ssn);

    }
}
