package com.javalab.sec05;

/**
 * 인터페이스의 다중 상속
 * 인터페이스는 다중 구형이 가능하다
 * 인터페이스는 다중 상속이 가낭하다.
 * InterfaceC는 InterfaceA와 InterfaceB를 상속받는다.
 */
public interface InterfaceC extends InterfaceA,InterfaceB{

    void methodC();

}
