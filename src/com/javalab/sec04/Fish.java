package com.javalab.sec04;

public class Fish implements Animal2, Swimmable{
    private String name; // 이름
    // 생성자
    public Fish(String name) {
        this.name = name;
    }
    // eat 메소드 구현
    @Override
    public void eat() {
        System.out.println(name + "이(가) 먹이를 먹습니다.");
    }
    // swim 메소드 구현
    @Override
    public void swim() {
        System.out.println(name + "이(가) 헤엄칩니다.");
    }
}