package com.mjc813;

public class Gugudan100ms {
    public static void main(String[] args) throws InterruptedException {
        //2단부터 9단 까지 반복
        for(int i= 2; i <=9; i++) {
            // 1부터 9까지 곱하기
            for (int j = 1; j <=9; j++){
                System.out.println(i+"*"+j+"="+(i*j));
                Thread.sleep(100);
            }
        }
    }
}
