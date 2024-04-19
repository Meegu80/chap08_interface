package com.javalab.sec06;

/**
 * 뮤직 플레이어 인터페이스
 * - 음악을 재생하는 기능을 제공하는 인터페이스
 * - play() 메소드를 가지고 있음
 */
public interface MusicPlayer {
    // 추상 메소드
    void play(String song);

    default void shufflePlay(){
        System.out.println("셔플 재생을 시작합니다");
    }
}
