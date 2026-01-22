package com.mjc813;

import java.util.Scanner;

public class Q22 {

    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요:");
        int number = sc.nextInt();

        char[][] square = new char[number][number];

        System.out.println(number + "행" + number + "열");

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == 0 && j == 0) {
                    square[i][j] = 'r';
                } else if (i == 0 && j == number - 1) {
                    square[i][j] = '┐';
                } else if (i == number - 1 && j == 0) {
                    square[i][j] = '└';
                } else if (i == number - 1 && j == number - 1) {
                    square[i][j] = '┘';
                } else if (i == 0 || i == number - 1) {
                    square[i][j] = '─';
                } else if (j == 0 || j == number - 1) {
                    square[i][j] = '│';
                } else {
                    square[i][j] = ' ';


                }


            }

            System.out.println();
        }

        sc.close();
    }
}

