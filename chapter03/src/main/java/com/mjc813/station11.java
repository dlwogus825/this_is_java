package com.mjc813;

public class station11 {
    public void run(){
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80)? 'B' : 'C');
        System.out.println("점은" + grade+"입니다");

    }
}
