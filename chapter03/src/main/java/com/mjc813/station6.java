package com.mjc813;

public class station6 {
    public void run() {

        int charCode = 'A';


        if((65<=charCode)&(charCode<=90)){
            System.out.println("대문자이구나");
        }

        if((97<=charCode) && (charCode<=122)){
            System.out.println("소문자이구나");
        }
        if((48<=charCode) && (charCode<=57)){
            System.out.println("0~9 사이의 숫자로구나");
        }

        int value = 6;

        if((value%2==0) | (value%3==0)){
            System.out.println("2 또는 3의 배수로구나");
        }

        boolean result = (value%2==0) || (value%3==0);
        if( !result ) {
            System.out.println("2또는 3의 배수가 아니군");
        }
        }
    }
