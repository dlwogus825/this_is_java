package com.mjc813.onebyonechat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerApp {
    private ServerSocket serverSocket;

    public ServerApp() throws IOException {
        this.serverSocket = new ServerSocket(59999); // 서버 소켓 생성
    }

    public Socket accept() throws IOException {
        return this.serverSocket.accept(); // 클라이언트 접속 대기 (블로킹)
    }

    public void close() throws IOException {
        this.serverSocket.close(); // 서버 소켓 닫기
    }

    public static void main(String[] args) {
        try {
            ServerApp sa = new ServerApp();

            while (true) {
                Socket socket = sa.accept(); // ① 클라이언트 접속 대기
                System.out.println("클라이언트 접속: " + socket.getInetAddress());

                // ② 클라이언트가 보낸 메시지 먼저 수신
                byte[] buf = new byte[1024];
                int num = socket.getInputStream().read(buf);
                String msg = new String(buf, 0, num, StandardCharsets.UTF_8); // num만큼만 변환
                System.out.println("클라이언트: " + msg);

                // ③ 서버 응답 전송
                String response = "서버가 받았어요: " + msg;
                socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
                socket.getOutputStream().flush();

                socket.close(); // 통신 소켓 닫기 (서버 소켓은 유지)
            }

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}