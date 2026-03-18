package com.mjc813.onebyonechat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ClientApp {
    private Socket socket;

    public ClientApp() throws IOException {
        this.socket = new Socket(); // 클라이언트 소켓 생성
    }

    public void connect() throws IOException {
        this.socket.connect(new InetSocketAddress("localhost", 59999)); // 서버 연결
    }

    public void close() throws IOException {
        this.socket.close(); // 소켓 닫기
    }

    public void send(String msg) throws IOException {
        this.socket.getOutputStream().write(msg.getBytes(StandardCharsets.UTF_8)); // 메시지 전송
        this.socket.getOutputStream().flush(); // 버퍼 비우기
    }

    public String read() throws IOException {
        byte[] buf = new byte[1024];
        int count = this.socket.getInputStream().read(buf); // 서버 응답 수신
        return new String(buf, 0, count, StandardCharsets.UTF_8); // count만큼만 변환
    }

    public static void main(String[] args) {
        try {
            ClientApp ca = new ClientApp();
            ca.connect();
            // 키보드 입력 받기
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("서버에 보낼 메시지 입력: ");
            String input = br.readLine(); // 키보드에서 한 줄 읽기

            ca.send(input); // ① 클라이언트 → 서버 전송 (클라이언트가 먼저!)

            String response = ca.read(); // ② 서버 응답 수신
            System.out.println("서버: " + response);

            ca.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}

