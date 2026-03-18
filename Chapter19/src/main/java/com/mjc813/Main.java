package com.mjc813;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main.java
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new GuguDan4to6());
        t1.start();

        GuguDan7to9 t2 = new GuguDan7to9();
        t2.start();

        for (int i = 2; i <= 3; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println("[main 2~3단] " + i + " * " + j + " = " + (i * j));
                Thread.sleep(50);
            }
        }
    }
}