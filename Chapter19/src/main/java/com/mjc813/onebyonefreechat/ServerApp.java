package com.mjc813.onebyonefreechat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {
    private ServerSocket serverSocket;

    public ServerApp() throws IOException {
        this.serverSocket = new ServerSocket(59997); // 포트 59997로 서버소켓 생성
    }

    public Socket accept() throws IOException {
        return this.serverSocket.accept(); // 클라이언트 연결 대기 (블로킹)
    }

    public void close() throws IOException {
        this.serverSocket.close();
    }

    public static void main(String[] args) {
        ServerApp sa = null;
        ServerCommuicateSocket scs = null;
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            sa = new ServerApp();

            System.out.println("클라이언트 연결 대기 중...");
            Socket socket = sa.accept(); // 클라이언트 접속 올 때까지 대기
            System.out.println("클라이언트 연결 완료!");

            scs = new ServerCommuicateSocket(socket); // 통신 소켓 생성

            // 수신 전담 스레드 - 클라이언트 메시지를 계속 읽어서 출력 (블로킹이라 별도 스레드 필요)
            final ServerCommuicateSocket finalScs = scs;
            Thread receiveThread = new Thread(() -> {
                while (true) {
                    String received = finalScs.read();
                    if (received == null || received.isEmpty()) break; // 연결 끊김
                    System.out.println("CLIENT: " + received);
                }
            });
            receiveThread.start(); // 수신 스레드 시작

            // 메인 스레드 - 콘솔 입력 → 클라이언트로 전송
            while (true) {
                String str = scanner.nextLine();
                scs.send(str); // writeUTF()로 클라이언트에게 전송
            }

        } catch (Exception e) {
            System.err.println(e.toString());
        } finally {
            if (scs != null) scs.close();
            try {
                if (sa != null) sa.close();
            } catch (Exception ex) {}
        }
    }
}