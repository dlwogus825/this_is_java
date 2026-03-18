package com.mjc813;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        // ArrayList: 내부적으로 배열(array)을 사용하는 리스트
        List<String> list1 = new ArrayList<String>();

        // LinkedList: 노드(node)들이 연결된 구조를 사용하는 리스트
        List<String> list2 = new LinkedList<String>();

        long startTime; // 시작 시간 저장 변수
        long endTime;   // 종료 시간 저장 변수


        // ===== ArrayList 성능 측정 =====
        startTime = System.nanoTime(); // 시작 시간 기록 (나노초 단위)

        for(int i = 0; i < 10000; i++) {
            // index 0(맨 앞)에 삽입 → ArrayList는 기존 요소를 전부 한 칸씩 뒤로 밀어야 해서 느림 (O(n))
            list1.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime(); // 종료 시간 기록
        // 걸린 시간 출력 (endTime - startTime = 실제 소요 시간)
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime - startTime));


        // ===== LinkedList 성능 측정 =====
        startTime = System.nanoTime(); // 시작 시간 기록

        for(int i = 0; i < 10000; i++) {
            // index 0(맨 앞)에 삽입 → LinkedList는 head 포인터만 바꾸면 되므로 빠름 (O(1))
            list2.add(0, String.valueOf(i));
        }

        endTime = System.nanoTime(); // 종료 시간 기록
        // 걸린 시간 출력
        System.out.printf("%-17s %8d ns \n", "LinkedList 걸린시간: ", (endTime - startTime));
    }
}