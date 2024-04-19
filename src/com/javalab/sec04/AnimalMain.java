package com.javalab.sec04;

public class AnimalMain {
    public static void main(String[] args) {
        Bird bird = new Bird("참새");
        bird.eat(); // 참새이(가) 먹이를 먹습니다.
        bird.fly(); // 참새이(가) 날개를 퍼덕이며 날아갑니다.

        Fish fish = new Fish("구피");
        fish.eat(); // 구피이(가) 먹이를 먹습니다.
        fish.swim(); // 구피이(가) 헤엄칩니다.
    }
}