package com.mjc813;

public class P7 {
    public static void main(String[] args){
        P6 myPhone = new P6("삼성전자", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone);
    }
}
