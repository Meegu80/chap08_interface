package com.javalab.sec06;

/**
 * 기본 뮤직 플레이어
 * - MusicPlayer 인터페이스를 구현한 클래스
 */
public class BasicPlayer implements MusicPlayer {
    @Override
    public void play(String song){
        System.out.println(song + " 곡을 재생합니다.");
    }
}
