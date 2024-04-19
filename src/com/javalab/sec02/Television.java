package com.javalab.sec02;

public class Television implements RemoteControl{
    // 필드
    private int volume;

    // 인터페이스에 있는 메소드 구현
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV 볼륨을 " + volume + "으로 설정합니다.");
    }
}
