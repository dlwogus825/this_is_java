package com.mjc813;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {
    public static void main(String[] args){

        // Student 객체 3개를 리스트로 생성
        List<Student> list = Arrays.asList(
                new Student("홍길동","남자", 10),
                new Student("신용권","남자", 20),
                new Student("유미선","남자",30)
        );

        double avg = list.stream()               // 리스트를 스트림으로 변환
                .mapToInt(student -> student.getScore()) // Student 객체에서 점수(int)만 추출
                .average()                       // 추출한 점수들의 평균 계산
                .getAsDouble();                  // 결과를 double 타입으로 꺼냄

        System.out.println("평균점수" + avg);    // → 평균점수20.0
    }
}