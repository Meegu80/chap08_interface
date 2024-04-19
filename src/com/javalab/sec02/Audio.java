package com.javalab.sec02;

public class Audio implements RemoteControl{
    // 필드 선언
    private int volume;
    // turnOn 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }
    // turnOff 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }
    @Override
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("현재 Audio 볼륨: " + volume);

    }
}
