package com.javalab.sec06;

public class MusicPlayerMain {
    public static void main(String[] args) {
        // 구현객체 생성 인터페이스(부모) 타입에 저장
        MusicPlayer basicPlayer = new BasicPlayer();
        basicPlayer.play("행진곡");
        basicPlayer.shufflePlay(); //"셔플 재생을 시작합니다
    }
}
