package com.mjc813;

public class P4 {

    public static void main(String[] args){
        P3 s1 = new P3(1, "홍길동");
        P3 s2 = new P3(1, "홍길동");


        if(s1.hashCode() == s2.hashCode()){
            if(s1.equals(s2)){
                System.out.println("동등객체입니다.");
            }else{
                System.out.println("데이터가 다르므로 동등 객체가 아니오");
            }
        }else{
            System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
        }
    }
}
