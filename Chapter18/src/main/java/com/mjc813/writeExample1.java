package com.mjc813;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class writeExample1 {
    public static void main(String[] args){
        try{
            // C:/Temp/test2.db 파일을 쓰기 모드로 열기 (없으면 자동 생성)
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");

            // 파일에 쓸 바이트 배열 선언
            byte[] array = { 10, 20, 30 };

            // 배열 전체를 한 번에 파일에 씀 (이전 예제에서 write() 3번 호출한 것과 동일한 결과)
            os.write(array);

            // 버퍼에 남은 데이터를 파일로 강제 전송
            os.flush();
            // 파일 스트림 닫기 (리소스 해제)
            os.close();

        }catch (IOException e){
            e.printStackTrace(); // 예외 발생 시 오류 내용 출력
        }
    }
}