package com.mjc813;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        Stream<String> stream = set.stream();// 컨베이어 벨트에 올리기
        stream.forEach( name -> System.out.println(name)); // 컨베이어 벨트에 꺼내서 하나씩 출력
    }
}
