package com.mjc813;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {

        // 1~5 정수 배열 생성
        int[] intArr = {1, 2, 3, 4, 5};

        // peek만 쓰면 최종 연산이 없어서 아무것도 출력 안 됨!
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0) // 2의 배수만 필터 (2, 4)
                .peek(n -> System.out.println(n)); // 중간 확인용 (최종 연산 없어서 실행 안 됨)

        // peek + sum() - sum()이 최종 연산이라 peek도 같이 실행됨
        int total = Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)          // 2의 배수만 필터 (2, 4)
                .peek(n -> System.out.println(n)) // 중간에 값 확인 (2, 4 출력)
                .sum();                            // 최종 연산 - 합계 (6)
        System.out.println("총합" + total + "\n");

        // forEach - 최종 연산이라 바로 실행됨
        Arrays.stream(intArr)
                .filter(a -> a % 2 == 0)          // 2의 배수만 필터 (2, 4)
                .forEach(n -> System.out.println(n)); // 최종 연산 - 바로 출력
    }
}