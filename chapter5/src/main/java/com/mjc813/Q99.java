package com.mjc813;

public class Q99 {
    public void run() {
//        1번 : 10개의 boolean 값이 원소인 1차원 배열의 짝수번째 인덱스가 true 이고 다른 인덱스는 false 로 만들어서 출력하세요
//        입력 =>
//        boolean[] boolArray = new boolean[10];
//        처리 => 반복문을 사용하세요, 짝수번째 인덱스의 원소를 true, 홀수는 false 로 할당
//        한줄에 출력 =>
//        true, false, true, false, ..., true, false

        boolean[] demension = new boolean[10];

        for (int i = 0; i < demension.length; i++) {

            if (i % 2 == 0) {
                demension[i] = true;

            } else {
                demension[i] = false;
            }

            System.out.printf("%B ", demension[i]);
        }
        System.out.println();


        int[] gantegong = new int[30];
        for (int i = 0; i < gantegong.length; i++) {
            gantegong[i] = i;

            System.out.printf("%d", gantegong[i]);
        }


        char[] Why = new char[20];

        {
            System.out.printf("char형 1차원 배열을 선언하고 길이는 %s입니다.", Why.length);

        }


        boolean[][] chess = new boolean[3][4];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                chess[i][j] = true;


                System.out.print(chess[i][j] + " ");
            }


            System.out.println();

        }

        String[] demenfirst = new String[50];
        for (int i = 0; i < demenfirst.length; i++) {

            demenfirst[i] = "empty";
            System.out.println(demenfirst[i]);
        }


//                - 2번 : 0,1 로 이루어진
//                [[2차원 직사각형 배열이 있습니다. 0의 갯수와 1의 갯수를 출력하세요
//        입력 =>
//        int[][] intDemention2 = {
//                {0, 0, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}
//                , {0, 1, 0, 1, 0, 0}, {0, 0, 1, 1, 0, 1}
//                , {1, 0, 0, 0, 1, 0}
//        };
//        처리 => 반복문을 사용하세요
//        한줄에 출력 =>
//        0의 갯수는 ?개, 1의 갯수는 ?개.

        int[][] intDemention2 = {
                {1, 0, 1, 0, 0, 1}
                , {1, 0, 1, 1, 0, 1}
                , {0, 1, 0, 1, 0, 0}
                , {1, 0, 0, 1, 0, 1}
                , {1, 0, 1, 0, 0, 1}
        };

        int[][] rentegle = {
                {0, 0, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}
                , {0, 1, 0, 1, 0, 0}, {0, 0, 1, 1, 0, 1}
                , {1, 0, 0, 0, 1, 0}


        };
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < intDemention2.length; i++) {
            for (int j = 0; j < intDemention2[i].length; j++) {

                if (intDemention2[i][j] == 0) {
                    count++;
                } else
                    count1++;

            }
        }
        System.out.printf("0 is %d, 1 is %d .", count, count1);


//                - 3번 : 입 아래와 같을때 출력을 아래와 같이 만드세요
//        입력 =>
//        char[][] chInput = {
//                {'*', '*', '*', '*', ' '},
//                {'*', '*', ' ', ' ', ' '},
//                {'*', ' ', '*', '*', '*'}
//        };
//	****
//	**
//	* ***
//        처리 => 반복문 사용하세요
//        출력 배열 =>력이
//        char[][] chOutput = {
//                {'*', '*', '*'},
//                {'*', '*', ' '},
//                {'*', ' ', '*'},
//                {'*', ' ', '*'},
//                {' ', ' ', '*'},
//        };
//	***
//	**
//	* *
//	* *
//	  *


        char[][] chInput = new char[][]{
                {'*', '*', '*', '*', ' '},
                {'*', '*', ' ', ' ', ' '},
                {'*', ' ', '*', '*', '*'}
        };


        for (int i = 0; i < chInput.length; i++) {
            for (int j = 0; j < chInput[i].length; j++) {

                System.out.printf("%s ",chInput[i][j]);



            };
        }

        };

    }
