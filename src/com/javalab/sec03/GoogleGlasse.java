package com.javalab.sec03;

public class GoogleGlasse implements Wearable{
    @Override
    public void putOn() {
        System.out.println("구글 글래스를 착용합니다.");
    }

    @Override
    public void putOff() {
        System.out.println("구글 글래스를 벗습니다.");
    }
}
