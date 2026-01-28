package com.mjc813.chapter07;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student1 extends Person{
    private int studentNo;

    public Student1(String name, int studentNo){
        super(name);
        this.studentNo = studentNo;

    }
    public void study(){
        System.out.println("공부를 합니다.");
    }
}
