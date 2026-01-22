package com.mjc813;

public class Q12 {
    public void run() {
//- 1-1 : 1차원 배열 double[] dArray 갯수 25개 배열을 생성한다.
//		이 배열의 원소에는 난수 0.000 ~ 99.99999 값 25개 가 저장되도록 한다.
        double[] dAray = new double[25];


        for (int i = 0; i < dAray.length; i++) {
            double randomDouble = Math.random();
            dAray[i] = randomDouble * 100;
        }

        int[] nArray = new int[25];
        int sum = 0;

        for (int i = 0; i < dAray.length; i++) {
            nArray[i] = (int) dAray[i];
            sum += nArray[i];
        }

    }




    {

    }

    {

    }
}

