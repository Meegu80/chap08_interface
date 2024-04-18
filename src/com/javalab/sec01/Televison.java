package com.javalab.sec01;
/**
 * Television 클래스
 * -RemoteControl 인터페이스를 구현한 클래스
 */
public interface Televison implements RemoteControl{
    // 인터페이스에 있는 메소드 구현
    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
}