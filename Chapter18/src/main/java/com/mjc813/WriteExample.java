package com.mjc813;

import java.io.FileOutputStream;
import java.io.IOException; // ← 이게 빠져 있었음
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test1.db"); // 경로도 확인해봐 (점→슬래시)

            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a); // 바이트 하나씩 파일에 씀
            os.write(b);
            os.write(c);

            os.flush(); // 버퍼에 남은 데이터 강제로 내보냄
            os.close(); // 파일 닫기 (안 닫으면 리소스 누수)
        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 오류 내용 출력
        }
    }
}