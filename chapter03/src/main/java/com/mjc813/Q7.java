package com.mjc813;

public class Q7 {
    public void run(){
        double x =5.0;
        double y = 0.0;
        double z = 5 % y;
        if(x % y == z) {
            System.out.println("0.0으로 나눌 수 없습니다");
        }else{
            double result = z + 10;
            System.out.println("결과:" + result);
        }

    }
}
