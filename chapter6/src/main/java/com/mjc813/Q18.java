package com.mjc813;

public class Q18 {
    public void run(){
        Singleton obj1 = Singleton.getInstance();  // I를 i로
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 singleton 객체입니다.");
        } else {
            System.out.println("다른 singleton 객체입니다.");
        }
    }
}