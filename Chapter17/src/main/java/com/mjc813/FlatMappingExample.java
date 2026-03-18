package com.mjc813;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {

        // 문장이 담긴 리스트 생성
        List<String> list1 = new ArrayList<>();
        list1.add("this is java");
        list1.add("i am a best developer");

        // flatMap - 문장을 공백 기준으로 쪼개서 단어 하나씩 출력
        list1.stream()
                .flatMap(data -> Arrays.stream(data.split(" ")))
                // "this is java" → ["this", "is", "java"] 로 분리 후 스트림으로 펼침
                .forEach(word -> System.out.println(word));

        System.out.println();

        // 쉼표로 구분된 숫자 문자열 리스트
        List<String> list2 = Arrays.asList("10,20,30,40,50");

        // flatMapToInt - 문자열을 쉼표로 쪼개서 int 배열로 변환 후 출력
        list2.stream()
                .flatMapToInt(data -> {
                    String[] strArr = data.split(",");       // 쉼표 기준으로 분리
                    int[] intArr = new int[strArr.length];   // int 배열 생성
                    for (int i = 0; i < strArr.length; i++) {
                        intArr[i] = Integer.parseInt(strArr[i].trim()); // 문자열 → int 변환
                    }
                    return Arrays.stream(intArr); // int 배열을 IntStream으로 반환
                })
                .forEach(number -> System.out.println(number));
    }
}

