package com.mjc813;

import java.util.HashSet;

public class P5 {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();

        P3 s1 = new P3(1,"홍길동");
        hashSet.add(s1);
        System.out.println("저장된 객체 수 :"+ hashSet.size());

        P3 s2 = new P3(1,"홍길동");
        hashSet.add(s2);
        System.out.println("저장된 객체 수 :"+ hashSet.size());

        P3 s3 = new P3(2,"홍길동");
        hashSet.add(s3);
        System.out.println("저장된 객체 수 :"+ hashSet.size());
    }
}
