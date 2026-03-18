package com.mjc813;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {

        // 학생 리스트 생성 (이름, 성별, 점수)
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동", "남", 92));
        totalList.add(new Student("김수영", "여", 87));
        totalList.add(new Student("감자바", "남", 95));
        totalList.add(new Student("오해영", "여", 93));

        // 성별로 그룹핑 후 각 그룹의 평균 점수를 Map으로 수집
        Map<String, Double> map = totalList.stream()
                .collect(
                        Collectors.groupingBy(
                                s -> s.getSex(),                         // 성별 기준으로 그룹핑
                                Collectors.averagingDouble(s -> s.getScore()) // 각 그룹 평균 계산
                        )
                );

        System.out.println(map); // → {남=93.5, 여=90.0}
    }
}
