package com.mjc813;

public class Audio implements RemoteControl2 {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl2.MAX_VOLUME) {
            this.volume = RemoteControl2.MAX_VOLUME;

        } else if (volume < RemoteControl2.MIN_VOLUME) {
            this.volume = RemoteControl2.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨: " + this.volume);
    }
}
    //필드
//    private int memoryVolume;

//    //디폴트 메소드 재정의
//    @Override
//    public void setMute(boolean mute) {
//        if(mute) {
//            this.memoryVolume = this.volume;
//            setVolume(RemoteControl2.MIN_VOLUME);
//        } else {
//            setVolume(this.memoryVolume);
//        }
//    }
//}