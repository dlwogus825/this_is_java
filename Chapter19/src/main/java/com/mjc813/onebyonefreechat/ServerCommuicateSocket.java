package com.mjc813.onebyonefreechat;

import java.io.*;
import java.net.Socket;

public class ServerCommuicateSocket {
    private Socket socket;
    private BufferedReader br;       // 클라이언트가 BufferedWriter로 보내므로 BufferedReader로 수신
    private DataOutputStream dos;   // 클라이언트가 readUTF()로 읽으므로 writeUTF()로 송신

    public ServerCommuicateSocket(Socket socket) throws Exception {
        this.socket = socket;
        // 클라이언트 send() = BufferedWriter + newLine → 서버는 BufferedReader로 읽어야 함
        this.br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // 클라이언트 read() = DataInputStream.readUTF() → 서버는 DataOutputStream.writeUTF()로 보내야 함
        this.dos = new DataOutputStream(socket.getOutputStream());
    }

    public void send(String msg) {
        try {
            this.dos.writeUTF(msg); // 클라이언트의 readUTF()에 맞게 writeUTF로 전송
            this.dos.flush();       // 버퍼 즉시 비우기
        } catch (Exception e) {
            System.err.println("전송 실패: " + e.getMessage());
        }
    }

    public String read() {
        String str = "";
        try {
            str = this.br.readLine(); // 클라이언트의 BufferedWriter+newLine에 맞게 readLine으로 수신 (블로킹)
        } catch (Exception e) {
            System.err.println("수신 실패: " + e.getMessage());
        }
        return str;
    }

    public void close() {
        try { this.dos.close(); } catch (Exception e) {}
        try { this.br.close();  } catch (Exception e) {}
        try { this.socket.close(); } catch (Exception e) {}
    }
}