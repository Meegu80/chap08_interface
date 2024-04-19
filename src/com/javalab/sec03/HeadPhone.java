package com.javalab.sec03;

/**
 * HeadPhone 클래스
 * - Wearable 인터페이스를 구현한 클래스
 */
public class HeadPhone implements Wearable{

    @Override
    public void putOn() {
        System.out.println("헤드폰을 착용합니다.");
    }

    @Override
    public void putOff() {
        System.out.println("헤드폰을 벗습니다.");
    }
}
