
        package com.mjc813;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
    public void run(){
        Socket socket = null;
        Scanner scanner = null;
        try {
            //내 IP : 10.11.83.62
            socket = new Socket("10.11.83.61",50001);
            System.out.println("[클라이언트] 연결 성공");

            scanner = new Scanner(System.in);

            String msg = scanner.nextLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write(msg);
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                socket.close();
            } catch (Exception e) {
            }
            System.out.println("[클라이언트] 연결 끊음");
            try {
                scanner.close();
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        ClientExample ce = new ClientExample();
        ce.run();
    }
}