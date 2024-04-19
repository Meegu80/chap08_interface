package com.javalab.sec05;

public class MultiExtendsMain {
    public static void main(String[] args) {
        // 3개의 인터페이스를 구현한 multiInterfaceExtends 객체 생성
        MultiInterfaceExtends multi = new MultiInterfaceExtends();
        // multi를 부모 타입인 InterfaceA에 할당
        InterfaceA ia = multi; // 자동 형변환
        ia.methodA();
        System.out.println("--------------------------------------------------------------");

        InterfaceB ib = multi; // multi를 부모 타입인 InterfaceB에 할당
        ib.methodB(); // multi의 methodB() 호출
        System.out.println();
        System.out.println("==============================================================");
        InterfaceC ic = multi;  // multi를 부모 타입인 InterfaceC에 할당
        ic.methodC(); // multi의 methodC() 호출
    }
}
