package com.mjc813;

public class Report2Class {
    public static void main(String[] args) throws InterruptedException {
        // 별도 스레드 생성 및 시작 (5~9단)
//        SubThread thread = new SubThread();
//        thread.start(); // 여기서 별도 스레드 출발!

        // main 스레드에서 2~4단 출력
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println("[main] " + i + " * " + j + " = " + (i * j));
                Thread.sleep(50); // 50ms 대기
            }
        }
    }
}
