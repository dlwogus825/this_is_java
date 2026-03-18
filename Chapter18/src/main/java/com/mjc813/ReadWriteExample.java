package com.mjc813;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteExample {
    public static void main(String[] args) throws Exception {

        // 1. txt 파일 만들고 내용 쓰기
        FileWriter fw = new FileWriter("C:/Temp/hello.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("안녕");      // 첫 번째 줄
        bw.newLine();          // 줄바꿈
        bw.write("친구야");    // 두 번째 줄

        bw.close();
        fw.close();

        // 2. 만든 파일 한 줄씩 읽기
        FileReader fr = new FileReader("C:/Temp/hello.txt");
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 0;
        String rowData;

        while (true) {
            rowData = br.readLine(); // 한 줄씩 읽기
            if (rowData == null) break; // 파일 끝이면 종료

            rowNumber++;
            System.out.println(rowNumber + "\t" + rowData);
        }

        br.close();
        fr.close();
    }
}