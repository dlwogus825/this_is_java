package com.mjc813;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {

        // beep 담당 스레드 생성 (Runnable 익명 클래스 방식)
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷 인스턴스 가져오기
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); // 비프음 재생
                    try {
                        Thread.sleep(500); // 0.5초 대기
                    } catch (Exception e) {}
                }
            }
        });

        thread.start(); // beep 스레드 시작 (메인 스레드와 동시 실행)

        // 메인 스레드 - "띵" 출력 담당
        for (int i = 0; i < 5; i++) {
            System.out.println("띵"); // 콘솔 출력
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (Exception e) {}
        }
    }
}