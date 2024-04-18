package com.javalab.sec01;

public class RemoteconMain {
    public static void main(String[] args) {
        // 인터페이스 변수 선언, RemoteControl 인터페이스 타입 변수 rc
        RemoteControl rc;
        rc = new Audio(); // Audio 객체를 rc에 대입
        rc.turnOn(); // Audio 객체의 turnOn() 메소드 호출

        Television tv = new Televison(); // Television 객체 생성
        rc = tv; //  rc에 tv대입
        rc.turnOn(); // Television 객체의 turnOn() 메소드 호출
    }
}
