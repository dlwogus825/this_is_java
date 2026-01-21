package com.mjc813;

public class Q12 {
    public void run(){
//- 1-1 : 1차원 배열 double[] dArray 갯수 25개 배열을 생성한다.
//		이 배열의 원소에는 난수 0.000 ~ 99.99999 값 25개 가 저장되도록 한다.
        double[] dAray = new double[25];



        for(int i = 0; i < dAray.length; i++) {
            double randomDouble = Math.random();
            dAray[i] = randomDouble*100;


        }
        for(int i = 0; i < dAray.length; i++){
        System.out.printf( "%.5f", dAray[i]);

            System.out.printf("%d%n", (int)dAray[i]);      //
        }
        for(int i = 0; i < dAray.length; i++) {



            System.out.printf( "%.5f", dAray[i]);

            int a =0;

            boolean b = (dAray[i] * i) % 25 == a;

        }



//        1차원 배열 int[] nArray 갯수 25개 배열을 생성한다.
//                이 배열의 원소는 dArray 배열원소에서 소숫점빼고 정수 부분만 저장한다.
//        전체 원소들의 합과 평균을 구해서 출력해보자



        int[] nArray = new int[25];



    }
}

