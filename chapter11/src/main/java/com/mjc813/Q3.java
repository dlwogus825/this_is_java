package com.mjc813;

public class Q3 {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("java.lang.String 이 이미 존재함");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            Class.forName("java.lang.String2");
            System.out.println("java.lang.String 이 이미 존재함");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
