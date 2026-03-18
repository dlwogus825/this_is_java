package com.mjc813;

import java.util.ArrayList;
import java.util.List;

public class FiliteringExample {
    public static void main(String[] args){

        // 이름 리스트 생성 (신용권 중복 포함)
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("신용권");
        list.add("감자바");
        list.add("신용권"); // 중복
        list.add("신민철");

        // distinct - 중복 제거 후 출력
        list.stream()
                .distinct()                          // 중복 제거 (신용권 1개 제거)
                .forEach(n -> System.out.println(n)); // 홍길동, 신용권, 감자바, 신민철
        System.out.println();

        // filter - "신"으로 시작하는 이름만 출력 (중복 포함)
        list.stream()
                .filter(n -> n.startsWith("신"))     // "신"으로 시작하는 것만 통과
                .forEach(n -> System.out.println(n)); // 신용권, 신용권, 신민철
        System.out.println();

        // distinct + filter - 중복 제거 후 "신"으로 시작하는 이름만 출력
        list.stream()
                .distinct()                          // 중복 제거
                .filter(n -> n.startsWith("신"))     // "신"으로 시작하는 것만 통과
                .forEach(n -> System.out.println(n)); // 신용권, 신민철
    }
}
