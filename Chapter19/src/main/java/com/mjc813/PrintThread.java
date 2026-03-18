package com.mjc813;

public class PrintThread extends Thread {

    @Override
    public void run() {
        while (!isInterrupted()) { // 인터럽트 신호가 올 때까지 반복
            try {
                // 현재 공유 글자가 공백이 아닌 경우에만 출력
                if (CharPrinter.sharedChar != ' ') {
                    System.out.println(CharPrinter.sharedChar);
                }
                Thread.sleep(300); // 300ms 대기
            } catch (InterruptedException e) {
                // sleep 중에 인터럽트가 오면 루프 종료
                break;
            }
        }
    }
}
