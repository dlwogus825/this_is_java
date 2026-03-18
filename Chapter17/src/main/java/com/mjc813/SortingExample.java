package com.mjc813;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
    public static void main(String[] args){

        // Student3 리스트 생성 (이름, 점수)
        List<Student3> student3List = new ArrayList<>();
        student3List.add(new Student3("홍길동", 30));
        student3List.add(new Student3("신용권", 10));
        student3List.add(new Student3("유미선", 20));

        // 오름차순 정렬 - Student3의 compareTo() 기준 (점수 낮은 순)
        student3List.stream()
                .sorted()  // compareTo() 기준으로 자동 정렬
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
        System.out.println();

        // 내림차순 정렬 - reverseOrder()로 compareTo() 반대로 뒤집음
        student3List.stream()
                .sorted(Comparator.reverseOrder()) // 점수 높은 순
                .forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
    }
}
