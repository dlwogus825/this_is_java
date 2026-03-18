package com.mjc813;

// Comparable 인터페이스 구현 - 정렬 기준을 직접 정의
public class Student3 implements Comparable<Student3> {
    private String name;
    private int score;

    // 생성자 - 이름과 점수 초기화
    public Student3(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }

    // 정렬 기준 정의 - 점수 기준 오름차순
    @Override
    public int compareTo(Student3 o){
        return Integer.compare(score, o.score);
        //     ↑
        // this.score와 o.score를 비교
        // 음수 → 내가 앞 / 0 → 같음 / 양수 → 내가 뒤
    }
}





