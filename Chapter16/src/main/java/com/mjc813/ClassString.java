package com.mjc813;

public class ClassString implements MyString{
    @Override
    public void proString(String str, int num) {
        int lengthStr = str.length();
        if ( lengthStr == num ){
            System.out.println("str의 길이와, num의 수치는 같습니다");
        }else {
            System.out.println("str의 길이와, num의 수치는 다릅니다");
        }
    }
}
