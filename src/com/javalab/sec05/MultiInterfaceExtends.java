package com.javalab.sec05;

public class MultiInterfaceExtends implements InterfaceC {
    // 인터페이스에이의 추상 메소드 구현
    @Override
    public void methodA(){
        System.out.println("Multi-methodA() 실행");
    }
    // 인터페이스B의 추상 메소드 구현
    @Override
    public void methodB(){
        System.out.println("Multi-methodB() 실행");
    }
    // 인터페이스C의 추상 메소드 구현
    @Override
    public void methodC(){
        System.out.println("Multi-methodC() 실행");
    }

}
