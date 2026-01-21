package com.mjc813;

public class Q2 {
    public void run(){
        String grade = "B";

        int score1 = 0;
        switch (grade){
            case "A","a" -> {
                System.out.println("축하해요당신의 스코어는?");
                score1 = 100;
                break;
            }
                case "B","b" -> {
                    System.out.println("축하해요당신의 스코어는?");
                    int result = 100 - 20;
                    score1 = result;
                    break;
                }
                    default -> {
                        score1 = 60;
                    }
                }

            }
        }


