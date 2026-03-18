package com.mjc813;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParalleExample {
    public static void main(String[] args){

        // 랜덤 숫자 생성기
        Random random = new Random();

        // 1억개의 랜덤 점수(0~100)를 리스트에 저장
        List<Integer> scores = new ArrayList<>();
        for(int i = 0; i < 100000000; i++){
            scores.add(random.nextInt(101)); // 0~100 랜덤 정수
        }

        // 평균값, 시작/종료/경과 시간 변수 초기화
        double avg = 0.0;
        long startTime = 0;
        long endTime = 0;
        long time = 0;

        // ===== 일반 스트림 =====
        Stream<Integer> stream = scores.stream();
        startTime = System.nanoTime(); // 시작 시간 기록 (나노초)
        avg = stream
                .mapToInt(i -> i.intValue()) // Integer → int 변환
                .average()                   // 평균 계산
                .getAsDouble();              // double로 꺼냄
        endTime = System.nanoTime();         // 종료 시간 기록
        time = endTime - startTime;          // 경과 시간 계산
        System.out.println("avg: " + avg + ", 일반 스트림 처리 시간: " + time + "ns");

        // ===== 병렬 스트림 =====
        Stream<Integer> parallelStream = scores.parallelStream();
        startTime = System.nanoTime(); // 시작 시간 기록
        avg = parallelStream
                .mapToInt(i -> i.intValue()) // Integer → int 변환
                .average()                   // 평균 계산 (여러 스레드가 동시에)
                .getAsDouble();              // double로 꺼냄
        endTime = System.nanoTime();         // 종료 시간 기록
        time = endTime - startTime;          // 경과 시간 계산
        System.out.println("avg: " + avg + ", 병렬 스트림 처리 시간: " + time + "ns");
    }
}