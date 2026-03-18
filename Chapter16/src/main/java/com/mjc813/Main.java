package com.mjc813;

public class Main {
    public static void main(String[] args) {

        // 일반 인터페이스 객체 생성 후 메소드 호출
        NormalUseInterface n1 = new NormalUseInterface();
        n1.doSome();

        // 람다 인터페이스 객체 생성
        LamdaUseInterface L1 = new LamdaUseInterface();

        // str 길이와 n이 같은지 비교하는 람다
        L1.dosome((str, n) -> {
            System.out.println(str.length() == n ? "같다" : "다르다");
        }, "abc", 3);

        // i번 반복 출력하는 람다 (str 출력도 람다 블록 안으로 이동)
        L1.dosome((sss, i) -> {
            for (int m = 0; m < i; m++) {
                System.out.print(sss);
            }
            System.out.println(sss); // ← 람다 블록 안으로 이동, str → sss로 수정
        });
    }
}