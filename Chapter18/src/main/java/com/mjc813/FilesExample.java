package com.mjc813;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args){
        try{
            // 파일에 저장할 문자열 데이터 선언
            String data = "" +
                    "id:winter\n" +
                    "email: winter@mycompany.com\n" +
                    "tel: 010-123-1234";

            // 파일 경로 객체 생성
            Path path = Paths.get("C:/Temp/user.txt");

            // data를 UTF-8 인코딩으로 user.txt에 저장 (없으면 자동 생성)
            Files.writeString(Paths.get("C:/Temp/user.txt"), data, Charset.forName("UTF-8"));

            // 파일 유형 출력 (예: text/plain)
            System.out.println("파일 유형: " + Files.probeContentType(path));
            // 파일 크기 출력 (바이트 단위)
            System.out.println("파일 크기: " + Files.size(path) + "bytes");

            // 저장된 파일을 UTF-8로 읽어서 문자열로 반환
            String content = Files.readString(path, Charset.forName("UTF-8"));
            // 읽어온 내용 출력
            System.out.println(content);

        }catch (IOException e){
            e.printStackTrace(); // 예외 발생 시 오류 내용 출력
        }
    }
}
