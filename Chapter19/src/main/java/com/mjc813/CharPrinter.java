package com.mjc813;

public class CharPrinter {

    static volatile char sharedChar = ' ';

    public static void main(String[] args) throws Exception {

        // 출력 스레드 생성 및 시작
        PrintThread printer = new PrintThread();
        printer.start();

        // main 스레드 = 키보드 입력 담당
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("한 글자를 입력하고 엔터를 누르세요. (종료: q)");

        while (true) {
            String input = scanner.nextLine().trim(); // 입력 받기

            if (input.equals("q")) {          // q 입력 시 종료
                printer.interrupt();          // 출력 스레드 중단 요청
                System.out.println("프로그램 종료");
                break;
            }

            if (!input.isEmpty()) {
                sharedChar = input.charAt(0); // 첫 글자만 공유 변수에 저장
            }
        }

        scanner.close();
    }
}
