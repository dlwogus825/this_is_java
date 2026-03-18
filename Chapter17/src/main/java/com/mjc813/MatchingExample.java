package com.mjc813;

import java.util.Arrays;

public class MatchingExample {
    public static void main(String[] args) {

        // 2, 4, 6 정수 배열 생성
        int[] intArr = {2, 4, 6};

        // allMatch - 모든 요소가 조건을 만족하는지 (2,4,6 전부 2의 배수?) → true
        boolean result = Arrays.stream(intArr)
                .allMatch(a -> a % 2 == 0); // 모든 요소가 2의 배수면 true
        System.out.println("모두 2의 배수인가? " + result);

        // anyMatch - 하나라도 조건을 만족하는지 (2,4,6 중 3의 배수 있나?) → true (6)
        result = Arrays.stream(intArr)
                .anyMatch(a -> a % 3 == 0); // 하나라도 3의 배수면 true
        System.out.println("하나라도 3의 배수가 있는가? " + result);

        // noneMatch - 조건을 만족하는 요소가 하나도 없는지 (3의 배수 없나?) → false (6 있음)
        result = Arrays.stream(intArr)
                .noneMatch(a -> a % 3 == 0); // 3의 배수가 하나도 없으면 true
        System.out.println("3의 배수는 없나? " + result);
    }
}