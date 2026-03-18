package com.mjc813;

import java.util.HashSet;
import java.util.Set;

public class Q1 {
    public static void main(String[]args){
        // HashSet 객체 생성 - 중복을 허용하지 않는 집합
        Set<String> set = new HashSet<String>();

        // 요소 추가 - add() 메서드 사용
        set.add("Java");    // "Java" 추가
        set.add("JDBC");    // "JDBC" 추가
        set.add("JSP");     // "JSP" 추가
        set.add("Java");    // "Java" 중복 - 추가 안 됨!
        set.add("Spring");  // "Spring" 추가

        // Set의 크기(저장된 요소 개수) 가져오기
        int size = set.size();

        // 결과 출력 - 중복 제거되어 4개만 저장됨
        System.out.println("총객체 수: " + size);  // 출력: 총객체 수: 4
    }
}
