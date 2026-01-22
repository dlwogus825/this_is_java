package com.mjc813;

public class Q31 {
    public void run(){
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");


        System.out.println( strArray[0] == strArray[1]);
        System.out.println( strArray[0] == strArray[2]);
        System.out.println( strArray[0].equals(strArray[2]));
    }
}
