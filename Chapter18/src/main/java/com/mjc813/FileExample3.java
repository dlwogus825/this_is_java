package com.mjc813;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample3 {
    public static void main(String[] args) throws Exception {

        // 파일/디렉토리 객체 생성 (실제로 만드는 게 아니라 경로 지정만 함)
        File dir   = new File("C:/Temp/images");   // ⚠️ "C:Temp" → "C:/Temp" 슬래시 빠짐
        File file1 = new File("C:/Temp/file1.txt");
        File file2 = new File("C:/Temp/file2.txt");
        File file3 = new File("C:/Temp/file3.txt");
        File file4 = new File("C:/Temp/file4.txt");
        File file5 = new File("C:/Temp/file5.txt");
        File file6 = new File("C:/Temp/file6.txt");

        // 디렉토리 없으면 생성
        if (dir.exists() == false) {
            dir.mkdir();
        }
        // 파일 없으면 생성
        if (file1.exists() == false) { file1.createNewFile(); }
        if (file2.exists() == false) { file2.createNewFile(); }
        if (file3.exists() == false) { file3.createNewFile(); }
        if (file4.exists() == false) { file4.createNewFile(); }
        if (file5.exists() == false) { file5.createNewFile(); }
        if (file6.exists() == false) { file6.createNewFile(); }

        // C:/Temp 폴더 안의 모든 파일/폴더 목록 가져오기
        File temp = new File("C:/Temp");
        File[] contents = temp.listFiles();

        // 날짜 출력 형식 지정 (예: 2024-01-15 오전 09:30)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        for(File file : contents) {
            // 마지막 수정 날짜 출력 (25칸 고정)
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));

            if(file.isDirectory()) {
                // 디렉토리면 <DIR> 표시
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                // 파일이면 파일 크기(bytes) 표시
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println(); // 줄바꿈
        }
    }
}