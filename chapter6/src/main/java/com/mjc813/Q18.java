package com.mjc813;

public class Q18 {
    public void run(){

        SIngleton obj1 = SIngleton.getInstance();
        SIngleton obj2 = SIngleton.getInstance();

        if (obj1 == obj2) {

            System.out.println("같은 singleton 객체입니다.");
        }else{
            System.out.println("다른 singleton 객체입니다.");
        }
    }
}
