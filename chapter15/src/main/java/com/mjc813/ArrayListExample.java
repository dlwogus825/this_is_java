package com.mjc813;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){

        // Board 객체를 담는 리스트 생성
        // List(인터페이스) 타입으로 선언, 실제 구현체는 ArrayList
        List<Board> list = new ArrayList<>();

        // Board 객체 5개를 리스트에 추가
        // new Board(...) → 생성자 호출로 객체를 만들면서 바로 추가
        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));

        // 리스트에 들어있는 객체 총 개수 출력 → 5
        int size = list.size();
        System.out.println("총 객체수는 무엇이란 말인가.."+ size);
        System.out.println();

        // index 2번(3번째) 객체 꺼내기 → "제목3, 내용3, 글쓴이3"
        // index는 0부터 시작하므로 2 = 세 번째 요소
        Board board = list.get(2);
        System.out.println(board.getSubject()+"\t"+ board.getContent()+ "\t" + board.getWriter());
        System.out.println();

        // for문으로 리스트 전체 순회하며 출력
        // i=0부터 시작해서 list.size()-1(=4)까지 반복
        for(int i=0; i<list.size(); i++){
            Board b = list.get(i);  // i번째 Board 객체 꺼내기
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        // index 2번 객체 삭제 → "제목3" 삭제
        // 삭제 후 뒤의 요소들이 앞으로 당겨짐
        list.remove(2);

        // 다시 index 2번 객체 삭제 → 앞으로 당겨진 "제목4" 삭제
        // (제목3이 사라졌으므로 제목4가 index 2로 이동했기 때문)
        list.remove(2);

        // 향상된 for문(for-each)으로 남은 객체 전체 출력
        // → 제목1, 제목2, 제목5만 남아있음
        for(Board b : list) {
            System.out.println(b.getSubject()+ "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}
