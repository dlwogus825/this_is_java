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


        int[] Rantegong = new int[30];
        for (int i = 0; i < Rantegong.length; i++) {
            Rantegong[i] = i;

            System.out.printf("%d", Rantegong[i]);
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



        int[][] intDemention2 = {{1, 0, 1, 0, 0, 1}, {1, 0, 1, 1, 0, 1}, {0, 1, 0, 1, 0, 0}, {1, 0, 0, 1, 0, 1}, {1, 0, 1, 0, 0, 1}};

        int[][] rentegle = {{0, 0, 1, 1, 0, 0}, {1, 0, 0, 1, 0, 0}, {0, 1, 0, 1, 0, 0}, {0, 0, 1, 1, 0, 1}, {1, 0, 0, 0, 1, 0}


        };
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < intDemention2.length; i++) {
            for (int j = 0; j < intDemention2[i].length; j++) {

                if (intDemention2[i][j] == 0) {
                    count++;
                } else count1++;

            }
        }
        System.out.printf("0 is %d, 1 is %d .", count, count1);





        char[][] chInput = new char[][]{{'*', '*', '*', '*', ' '}, {'*', '*', ' ', ' ', ' '}, {'*', ' ', '*', '*', '*'}};


        for (int i = 0; i < chInput.length; i++) {
            for (int j = 0; j < chInput[i].length; j++) {

                System.out.printf("%s ", chInput[i][j]);


            }
            ;
        }

    }

    ;

}
