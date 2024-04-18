package com.javalab.sec01;

/**
 * Audio 클래스
 * RemoteControl 인터페이스를 구현한 클래스
 * 인터페이스에 정의된 추상 메소드를 오버라이드 해야한다.
 */
public class Audio implements RemoteControl{
    // 인터페이스의 추상 메소드를 오버라이드
    @Override
    public void turnon(){
        System.out.println("Audio 를 켭니다");
    }
}
