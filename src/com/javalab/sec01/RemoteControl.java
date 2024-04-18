package com.javalab.sec01;

/**
 * 인터페이스
 * 추상 메소드 묶음이다
 * 업무에 대한 공통적인 사항을 간추려서 추상 메소드로 정의해놓았다.
 * 이 인터페이스를 구현(상속)하는 클래스는 추상 메소드를 반드시 구현해야 한다.
 *  구성요소로는 상수, 추상메소드, 디폴트메소드, 정적메소드를 가질 수 있다.
 */
public interface RemoteControl {
    /**
     * 추상 메소드
     * - 내용부가 없는 껍데기 메소드
     * - public abstract 이 생략되어 있다.
     * - 전원을 켜는 기능
     */
    public abstract void turnOn();

}
