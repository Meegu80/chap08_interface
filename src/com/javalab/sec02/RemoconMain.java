package com.javalab.sec02;

public class RemoconMain {
    public static void main(String[] args) {
        // 인터페이스 변수 선언
        RemoteControl rc;
        // Audio 객체 생성
        Audio audio = new Audio();
        // Audio 객체를 RemoteControl 인터페이스 타입으로 형변환
        rc = audio;
        rc.turnOn();        // 전원켜기
        rc.setVolume(5);    // 볼륨설정5
        rc.turnOff();       // 전원끄기
    }
}
