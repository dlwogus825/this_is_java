package com.mjc813;

public class P17 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

// 1단계: append("DEF")
        sb.append("DEF");        // 결과: "DEF"

// 2단계: insert(0, "ABC")
        sb.insert(0, "ABC");     // 0번 위치에 "ABC" 삽입
        // 결과: "ABCDEF"

// 3단계: delete(3, 4)
        sb.delete(3, 4);         // 3번~4번 사이 문자 삭제 (3번 인덱스 'D' 삭제)
        // 결과: "ABCEF"

// 4단계: toString()
        String data = sb.toString();  // StringBuilder → String 변환
        System.out.println(data);
    }
}
