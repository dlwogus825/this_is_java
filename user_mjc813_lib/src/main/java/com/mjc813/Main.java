package com.mjc813;

import com.mjc813.machine.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        // 계산하기
        long result = cal.add(1, 2, 3, 4, 5);
        System.out.println("결과: " + result);
    }
}