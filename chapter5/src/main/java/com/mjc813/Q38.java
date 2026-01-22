package com.mjc813;

public class Q38 {
    public void run() {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int A =0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {



                A += array[i][j];





            }
        }
        System.out.println("총합 = " + A);
        System.out.println("평균 = " + A / 10);

    }
}