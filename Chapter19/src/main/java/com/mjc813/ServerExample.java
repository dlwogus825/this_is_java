package com.mjc813;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
    // 서버 소켓 (클래스 전체에서 공유하기 위해 static)
    private static ServerSocket serverSocket = null;

    public void run() {
        System.out.println("--------------------------------------------");
        System.out.println("서버를 종료하려면 q를 입력하고 enter키를 입력하세요.");
        System.out.println("--------------------------------------------");

        this.startServer(); // 서버 시작 (별도 스레드에서 실행됨)

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String key = scanner.nextLine(); // 키보드 입력 대기
            if (key.equalsIgnoreCase("q")) { // q 입력시 루프 탈출
                break;
            }
        }
        scanner.close();

        this.stopServer(); // 서버 종료
    }

    private void startServer() {
        // 별도 스레드로 실행 → 메인 스레드가 q 입력 대기하는 동안 서버도 동시에 돌아감
        Thread thread = new Thread(() -> {
            try {
                serverSocket = new ServerSocket(50001); // 50001 포트 열고 대기
                System.out.println("[서버] 시작됨");

                while (true) {
                    System.out.println("\n[서버] 연결 요청을 기다림\n");
                    Socket socket = serverSocket.accept(); // 클라이언트 연결 올 때까지 블로킹

                    // 연결된 클라이언트의 IP 주소 가져오기
                    InetSocketAddress isa =
                            (InetSocketAddress) socket.getRemoteSocketAddress();
                    System.out.println("[서버] " + isa.getHostString() + "의 연결 요청을 수락함");

                    socket.close(); // 데이터 통신 없이 바로 연결 끊음 (예제라서)
                    System.out.println("[서버] " + isa.getHostString() + "의 연결 요청을 끊음");
                }
            } catch (IOException e) {
                // stopServer()에서 serverSocket.close() 하면 여기로 빠져나옴 (정상 종료)
                System.out.println("[서버] " + e.getMessage());
            }
        });
        thread.start(); // 스레드 시작
    }

    private void stopServer() {
        try {
            serverSocket.close(); // 서버 소켓 닫기 → accept() 블로킹 해제됨
            System.out.println("[서버] 종료됨");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ServerExample se = new ServerExample();
        se.run(); // 서버 실행 진입점
    }
}