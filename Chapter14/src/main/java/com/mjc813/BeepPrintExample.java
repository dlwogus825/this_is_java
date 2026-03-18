package com.mjc813;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args){

        Toolkit toolkit = Toolkit.getDefaultToolkit(); // AWT 툴킷 인스턴스 가져오기 (beep 사용 목적)

        // beep 5번 반복 (0.5초 간격)
        for(int i=0; i<5; i++) {
            toolkit.beep(); // 시스템 비프음 재생
            try { Thread.sleep(500); } catch(Exception e) {} // 0.5초 대기
        }

        // "띵" 출력 5번 반복 (0.5초 간격)
        for(int i=0; i<5; i++){
            System.out.println("띵"); // 콘솔에 출력
            try { Thread.sleep(500); } catch(Exception e) {} // 0.5초 대기
        }
    }
}