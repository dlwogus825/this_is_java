package com.mjc813;

public class Q23 {

    public void run() {
        char[][] chiDiamond = new char[5][5];
        for (int i = 0; i < chiDiamond.length; i++) {
            for (int j = 0; j < chiDiamond.length; j++) {
                if (i == 0 || i == 4) {
                    if (j == 2) {
                        chiDiamond[i][j] = '*';
                    } else {
                        chiDiamond[i][j] = ' ';
                    }


                } else if (i == 1 || i == 3) {
                    if (j >= 1 && j<=3) {
                        chiDiamond[i][j] = '*';
                    }
                } else if (i == 2) {
                    chiDiamond[i][j] = '*';
                }
            }


        }

        for (int i =0; i<chiDiamond.length; i++){
            for (int j = 0; j < chiDiamond.length; j++) {
                System.out.print(chiDiamond[i][j]);
            }
            System.out.println();
        }

    }

}