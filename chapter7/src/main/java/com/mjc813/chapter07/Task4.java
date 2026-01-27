package com.mjc813.chapter07;

public class Task4 {
    public void run(){

        Subject subject1 = new Subject("A1", "파이썬", "813호", "화,수,1시~2시까지", "정교수", 5, 95.5, "A+");
        Subject subject2 = new Subject("B2", "수질역학", "213호", "월,금,3시~5시까지", "김교수", 4, 88.0, "B+");
        Subject subject3 = new Subject("C4", "문학과 종교 심리학의 상호관계에 대한 거시적 고찰", "444호", "평일 오전 9시부터 12시까지", "이교수", 5, 78.5, "C+");

        Student student1 = new Student("김프란시스","2020051078","남성","dlwogus825@gmail.com",110949457 , 2020);
        Student student2 = new Student("데미안","226230691","여성", "abrasas666@gmail.com", 66666666, 1800);
        Student student3 = new Student("아잔 브라후머","19806842","남성","budda1234@gmail.com",119, 1980);

        System.out.println("========== 수강 신청 ==========");
        student1.enrollSubject(subject1);

        student2.enrollSubject(subject2);

        student3.enrollSubject(subject3);

        student1.printstudentinfo();
        student2.printstudentinfo();
        student3.printstudentinfo();

        subject1.setGrade("A+");
        subject2.setGrade("B+");
        subject3.setGrade("C+");
        System.out.println(student1.getName() + " - " + subject1.getSubjectName() + ": " + subject1.getGrade());
        System.out.println(student2.getName() + " - " + subject2.getSubjectName() + ": " + subject2.getGrade());
        System.out.println(student3.getName() + " - " + subject3.getSubjectName() + ": " + subject3.getGrade());

    }
}
