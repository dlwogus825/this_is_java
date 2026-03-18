package com.mjc813;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {

        // 1~5 정수 배열 생성
        int[] intArray = {1, 2, 3, 4, 5};

        // IntStream 생성
        IntStream intStream = Arrays.stream(intArray);

        // asDoubleStream - int를 double로 변환해서 출력
        intStream
                .asDoubleStream()                        // int → double 변환 (1 → 1.0)
                .forEach(d -> System.out.println(d));    // 1.0, 2.0, 3.0, 4.0, 5.0 출력

        System.out.println();

        // 스트림은 한 번 쓰면 재사용 불가 → 새로 생성
        intStream = Arrays.stream(intArray);

        // boxed - 기본형 int를 Integer 객체로 변환해서 출력
        intStream
                .boxed()                                  // int → Integer 박싱
                .forEach(obj -> System.out.println(obj.intValue())); // Integer → int 꺼내서 출력
    }
}