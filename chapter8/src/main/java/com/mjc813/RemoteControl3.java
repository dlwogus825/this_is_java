package com.mjc813;

public interface RemoteControl3 {

    //상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    //추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int vOlume);

    //디폴트 인스턴스 메소드
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리 합니다.");

            setVOlume(MIN_VOLUME);
        }else {
            System.out.println("무음을 해제합니다.");
        }
    }

}
