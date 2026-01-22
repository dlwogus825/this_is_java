package com.mjc813;

public class Q37 {
    public void run(){
        int[] array = {10, 5, 3, 8, 2, 21, 999};
        int max = Integer.MIN_VALUE;
        for(int i =0; i<array.length; i++){
            int A = array[i];

            if(A > max){
                max = A;
            }

        }
        System.out.printf("%d", max);
    }
}
