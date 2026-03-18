package com.mjc813;

public class GuguDan7to9 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 7; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.println("[7~9단] " + i + " * " + j + " = " + (i * j));
                    Thread.sleep(50);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
