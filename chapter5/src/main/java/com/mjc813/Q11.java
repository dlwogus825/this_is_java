package com.mjc813;

public class Q11 {
    public void run() {
        // 수학 점수 2행 3열
        int[][] mathScores = new int[2][3];

        // 기본값(0) 출력
        for (int i = 0; i < mathScores.length; i++) {
            for (int k = 0; k < mathScores[i].length; k++) {
                System.out.println("mathScores[" + i + "][" + k + "]:" + mathScores[i][k]);
            }
        }
        System.out.println();

        // 수학 점수 대입
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        int totalMathStudent = 0;
        int totalMathSum = 0;

        for (int i = 0; i < mathScores.length; i++) {
            totalMathStudent += mathScores[i].length;
            for (int k = 0; k < mathScores[i].length; k++) {
                totalMathSum += mathScores[i][k];
            }
        }

        double totalMathAvg = (double) totalMathSum / totalMathStudent;
        System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
        System.out.println();

        // 영어 점수 (가변 배열)
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2]; // 0행: 2명
        englishScores[1] = new int[3]; // 1행: 3명

        // 필요하면 여기서 점수 직접 넣어도 됨
        // englishScores[0][0] = 70; 이런 식으로

        int totalEnglishStudent = 0;
        int totalEnglishSum = 0;   // ★ 누락됐던 부분

        for (int i = 0; i < englishScores.length; i++) {
            totalEnglishStudent += englishScores[i].length;
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println("englishScores[" + i + "][" + k + "]:" + englishScores[i][k]);
                totalEnglishSum += englishScores[i][k];
            }
        }

        double totalEnglishAvg = 0;
        if (totalEnglishStudent != 0) {
            totalEnglishAvg = (double) totalEnglishSum / totalEnglishStudent;
        }
        System.out.println("전체 학생의 영어 평균: " + totalEnglishAvg);
    }


}
