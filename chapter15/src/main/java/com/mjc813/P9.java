package com.mjc813;

import java.lang.reflect.Member;

public class P9 {

    public static void main(String[] args){
        P8 m = new P8("winter","눈송이",25);

        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();


        P8 m1 = new P8("winter", "눈송이",25);
        P8 m2 = new P8("winter", "눈송이",25);

        System.out.println("m1.hashCode():"+m1.hashCode());
        System.out.println("m2.hashCode():"+m2.hashCode());
        System.out.println("m1.hashCode(m2):"+m1.equals(m2) );
    }
}
