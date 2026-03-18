package com.mjc813;

public class Q1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수 " + result);
    }


    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // 이 망할거 때문에 오류 발생!
        System.out.println("[프로그램 종료]");
    }

}