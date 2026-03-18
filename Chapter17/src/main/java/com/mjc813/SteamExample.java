package com.mjc813;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SteamExample {
    public static void main(String[] args){

        // String 배열 생성
        String[] strArray = {"홍길동", "신용권", "김미나"};

        // 배열을 String 스트림으로 변환
        Stream<String> strStream = Arrays.stream(strArray);

        // 각 요소를 쉼표와 함께 한 줄에 출력
        strStream.forEach(item -> System.out.print(item + ","));
        System.out.println(); // 줄바꿈

        // int 배열 생성
        int[] intArray = {1, 2, 3, 4, 5};

        // 배열을 int 전용 스트림(IntStream)으로 변환
        IntStream intStream = Arrays.stream(intArray);

        // 각 요소를 쉼표와 함께 한 줄에 출력
        intStream.forEach(item -> System.out.print(item + ","));
        System.out.println(); // 줄바꿈
    }
}