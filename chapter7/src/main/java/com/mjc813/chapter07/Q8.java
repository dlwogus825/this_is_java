package com.mjc813.chapter07;

public class Q8 {
    public static void personInfo(Person person){
        System.out.println("name: "+ person.name);
        person.walk();

        if(person instanceof Student1 student) {
            System.out.println("studentNo: " + student.studentNo);
            student.study();  //
        }
    }

    public static void run(String[] args){  //
        Person p1 = new Person("이재현");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student1("김길동", 10);
        personInfo(p2);
    }
}