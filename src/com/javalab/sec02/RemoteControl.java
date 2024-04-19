package com.javalab.sec02;

/**
 * 리모컨 인터페이스
 * - 상수, 추상메소드를 요소로 갖는 인터페이스
 */
public interface RemoteControl {
    // 상수 필드
    public static final int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    // 추상 메소드
    public abstract void turnOn(); // 전원 켜는 추상 메소드
    public abstract void turnOff(); // 전원 끄는 추상 메소드
    void setVolume(int volume); // 볼륨 설정하는 추상 메소드
}
