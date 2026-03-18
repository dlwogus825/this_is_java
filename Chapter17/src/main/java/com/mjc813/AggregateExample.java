package com.mjc813;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {

        // 1~5 정수 배열 생성
        int[] arr = {1, 2, 3, 4, 5};

        // 2의 배수 개수 (2, 4) → 2개
        long count = Arrays.stream(arr)
                .filter(n -> n % 2 == 0) // 2의 배수만 필터
                .count();                // 개수 집계
        System.out.println("2의 배수의 개수: " + count);

        // 2의 배수 합계 (2 + 4) → 6
        long sum = Arrays.stream(arr)
                .filter(n -> n % 2 == 0) // 2의 배수만 필터
                .sum();                  // 합계 집계
        System.out.println("2의 배수의 합: " + sum);

        // 2의 배수 평균 (2 + 4) / 2 → 3.0
        double avg = Arrays.stream(arr)
                .filter(n -> n % 2 == 0) // 2의 배수만 필터
                .average()               // 평균 집계
                .getAsDouble();          // Optional 껍데기 벗김
        System.out.println("2의 배수의 평균: " + avg);

        // 2의 배수 최댓값 (2, 4 중) → 4
        int max = Arrays.stream(arr)
                .filter(n -> n % 2 == 0) // 2의 배수만 필터
                .max()                   // 최댓값 집계
                .getAsInt();             // Optional 껍데기 벗김
        System.out.println("최대값: " + max);

        // 2의 배수 최솟값 (2, 4 중) → 2
        int min = Arrays.stream(arr)
                .filter(n -> n % 2 == 0) // 2의 배수만 필터
                .min()                   // 최솟값 집계
                .getAsInt();             // Optional 껍데기 벗김
        System.out.println("최솟값: " + min);

        // 3의 배수 중 첫 번째 요소 (3) → 3
        int first = Arrays.stream(arr)
                .filter(n -> n % 3 == 0) // 3의 배수만 필터
                .findFirst()             // 첫 번째 요소 찾기
                .getAsInt();             // Optional 껍데기 벗김
        System.out.println("첫번째 3의 배수: " + first);
    }
}