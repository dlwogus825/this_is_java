package com.mjc813;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q7 {
    public static void main(String[] args) throws Exception {
        String filePath = "C:/git/this_is_java/chapter10/Chapter18/src/main/java/com/mjc813/Q7.java";

        // FileReader : 파일을 문자 스트림으로 열기
        FileReader fr = new FileReader(filePath);

        // BufferedReader : 한 줄씩 읽기 위해 FileReader를 감싸줌
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;  // 줄 번호 카운터
        String rowData;     // 읽어온 한 줄 데이터

        while (true) {
            rowData = br.readLine(); // 한 줄 읽기 (더 읽을 게 없으면 null 반환)

            if (rowData == null) break; // 파일 끝이면 종료

            rowNumber++;  // 줄 번호 증가

            // 줄 번호 + 내용 출력
            System.out.println(rowNumber + "\t" + rowData);
        }

        br.close(); // BufferedReader 닫기
        fr.close(); // FileReader 닫기
    }
}