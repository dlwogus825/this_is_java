package com.mjc813.chapter07;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subject {
    private String subjectId;
    private String subjectName; //과목이름
    private String classroom;
    private String schedule;
    private String professor;
    private int recommendpoint;
    private double score; //점수
    private String grade; // 학점

    public Subject(String subjectId, String subjectName, String classroom, String schedule, String professor,int recommendpoint ,double score,String grade ){
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.classroom = classroom;
        this.schedule = schedule;
        this.professor = professor;
        this.recommendpoint = recommendpoint;
        this.score = 0.0;
        this.grade = "미입력";
    }


}
