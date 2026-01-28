package com.mjc813.chapter07;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {
    private String name;
    private String studentId;
    private String gender;
    private String email;
    private long phoneNumber;
    private int admissionYear;
    private double score;
    private String grade;

    public Student(String name, String studentId, String gender, String email, long phoneNumber, int admissionYear) {
        this.name = name;
        this.studentId = studentId;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.admissionYear = admissionYear;
        this.score = 0.0;
        this.grade = "미입력";
    }

    //과목 수강 신청 파트
    public void enrollSubject(Subject subject) {

        System.out.println(this.name + " 학생이 " + subject.getSubjectName() + " 과목을 수강 신청 했습니다. ");
    }

    //학생 정보 출력

    public void printstudentinfo() {
        System.out.println("상기 학생의 이름은 " + this.name + " 이며 아이디는 " + this.studentId + " 사회적 성별은 " + this.gender
                + " 이고 이메일 주소는 " + this.email + " 이며 폰 번호는 " + this.phoneNumber + " 입학 년도는 " + this.admissionYear + " 입니다.");

    }


    public void learnresult() {
        double randomValue = Math.random() * 100;
        this.score = randomValue;

        if (randomValue >= 95) {
            this.grade = "A+";
        } else if (randomValue >= 85) {
            this.grade = "B+";
        } else if (randomValue >= 75) {
            this.grade = "C+";
        } else if (randomValue >= 65) {
            this.grade = "D+";
        } else {
            this.grade = "F";
        }

        System.out.println(this.name + " 학생의 성적: " + this.score + "점 (" + this.grade + ")");
    }


}
