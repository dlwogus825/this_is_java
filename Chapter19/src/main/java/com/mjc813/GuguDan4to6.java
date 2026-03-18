package com.mjc813;

public class GuguDan4to6 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 4; i <= 6; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println("[4~6단] " + i + " * " + j + " = " + (i * j));
                    Thread.sleep(50);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}