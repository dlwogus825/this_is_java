package com.mjc813;

public class Student {
    // 학생 이름 (외부 직접 접근 불가)
    private String name;
    // 학생 점수 (외부 직접 접근 불가)

    private String sex;
    private int score;



    // 생성자 - 객체 생성할 때 이름과 점수를 초기화
    public Student (String name, String sex, int score){
        this.name = name;   // 매개변수 name → 필드 name에 저장

        this.sex = sex;
        this.score = score; // 매개변수 score → 필드 score에 저장

    }

    // name 반환 (Getter)
    public String getName() { return name; }

    public String getSex() { return sex;}
    // score 반환 (Getter)
    public int getScore() { return score; }

}