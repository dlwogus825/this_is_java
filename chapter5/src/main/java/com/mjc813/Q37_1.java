package com.mjc813;

public class Q37_1 {
    public void run(){
        int[] aray = { 1, 5, 3, 8, 2};
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<aray.length;i++){
            int B = aray[i];

            if (B < min){

                min = B;
            }

        }
        System.out.printf("%d",min);

    }
}
