package com.mjc813;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args){

        // 학생 리스트 생성 (이름, 성별, 점수)
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", "남", 92),
                new Student("신용권", "남", 95),
                new Student("감자튀김", "여", 88)
        );

        // 방법1 - mapToInt로 점수 추출 후 sum()으로 합산
        int sum1 = studentList.stream()
                .mapToInt(Student::getScore) // 점수만 추출 (IntStream으로 변환)
                .sum();                      // 합계

        // 방법2 - map으로 점수 추출 후 reduce로 직접 누적 합산
        int sum2 = studentList.stream()
                .map(Student::getScore)      // 점수만 추출 (Stream<Integer>)
                .reduce(0, (a, b) -> a + b); // 0부터 시작해서 a+b 누적

        System.out.println("sum1:" + sum1); // → sum1: 275
        System.out.println("sum2:" + sum2); // → sum2: 275
    }
}