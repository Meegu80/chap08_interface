package com.javalab.sec03;

/**
 * Wearable 인터페이스
 * - 착용 가능한 기기들을 사용할 수 있도록 연결자 역할을 한다.
 */
public interface Wearable {
    // 추상 메소드
    public abstract void putOn(); // 착용하다
    public abstract void putOff(); // 벗다
}
