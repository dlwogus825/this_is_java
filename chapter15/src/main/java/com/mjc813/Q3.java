package com.mjc813;


import java.util.HashSet;

import java.util.*;

public class Q3 {
    public static void main(String[] args){
        Set<Q2> set = new HashSet<Q2>();

        set.add(new Q2("홍길동",30));
        set.add(new Q2("홍길동",30));

        System.out.println("총 객체수"+ set.size());
    }
}
