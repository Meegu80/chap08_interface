package com.javalab.sec04;

public class Bird implements Animal2, Flyable{
    private String name;
    // 생성자
    public Bird(String name) {
        this.name = name;
    }
    // eat 메소드 구현
    @Override
    public void eat() {
        System.out.println(name + "이(가) 먹이를 먹습니다.");
    }
    // fly 메소드 구현
    @Override
    public void fly() {
        if(name.equals("참새")) {
            System.out.println(name + "이(가) 날개를 퍼덕이며 날아갑니다.");
            return;
        }else{
            System.out.println(name + "이(가) 날아갑니다.");
        }
    }
}