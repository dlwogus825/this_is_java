package com.mjc813;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args){

        // Vector: ArrayList와 달리 멀티스레드 환경에서 안전한 리스트
        // 여러 스레드가 동시에 접근해도 데이터가 꼬이지 않음 (thread-safe)
        List<Board> list = new Vector<>();

        // 스레드A 정의: 1번~1000번 게시글을 리스트에 추가
        // Thread를 익명 클래스로 만들고 run()을 직접 오버라이드
        Thread threadA = new Thread(){
            @Override
            public void run(){
                for(int i=1; i<=1000; i++){
                    list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
                }
            }
        };

        // 스레드B 정의: 1001번~2000번 게시글을 리스트에 추가
        Thread threadB = new Thread(){
            @Override
            public void run(){
                for(int i=1001; i<=2000; i++){
                    list.add(new Board("제목"+i, "내용"+i,"글쓴이"+i));
                }
            }
        };

        // 두 스레드 동시 실행 시작
        // threadA: 1~1000 추가, threadB: 1001~2000 추가가 동시에 진행됨
        threadA.start();
        threadB.start();

        try {
            // join(): 해당 스레드가 완전히 끝날 때까지 main 스레드를 대기시킴
            // join() 없으면 스레드가 끝나기 전에 size()를 출력해버릴 수 있음
            threadA.join();
            threadB.join();
        } catch(Exception e){
            // 스레드 대기 중 인터럽트 발생 시 예외 처리
            // 실무에서는 e.printStackTrace() 등으로 로그를 남기는 것이 좋음
        }

        // 두 스레드가 모두 끝난 후 최종 객체 수 출력
        // Vector를 사용했으므로 정확히 2000이 출력됨
        // ArrayList였다면 2000보다 작게 나오거나 오류가 날 수 있음
        int size = list.size();
        System.out.println("총객체 수" + size);
        System.out.println();
    }
}
