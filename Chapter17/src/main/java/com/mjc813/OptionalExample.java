package com.mjc813;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

    public static void main(String[] args) {

        // 빈 리스트 생성 (평균값이 없는 상황을 테스트)
        List<Integer> list = new ArrayList<>();

        // ===== 방법1 - isPresent()로 값 존재 여부 직접 확인 =====
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue) // Integer → int 변환
                .average();                  // 평균 계산 (빈 리스트라 값 없음)

        if(optional.isPresent()) {           // 값이 있으면
            System.out.println("방법1_평균" + optional.getAsDouble());
        } else {                             // 값이 없으면
            System.out.println("방법1_평균: 0.0");
        }

        // ===== 방법2 - orElse()로 값 없을 때 기본값 지정 =====
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0); // 값 없으면 0.0으로 대체
        System.out.println("방법2_평균: " + avg);

        // ===== 방법3 - ifPresent()로 값 있을 때만 실행 =====
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균: " + a));
        // 값이 없으면 아예 실행 안 됨
    }
}