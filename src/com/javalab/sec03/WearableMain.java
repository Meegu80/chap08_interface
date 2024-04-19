package com.javalab.sec03;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WearableMain {
    public static void main(String[] args) {
        // 인터페이스 타입 변수 선언
        Wearable wearable = null;

        // HeadPhone 객체 생성
        HeadPhone hp = new HeadPhone();
        // HeadPhone 객체를 Wearable 인터페이스 타입 변수에 대입
        wearable = hp; // 인터페이스 타입으로 자동 형변환
        wearable.putOn();
        wearable.putOff();
        System.out.println();

        // GoogleGlasse 객체 생성
        GoogleGlasse gg = new GoogleGlasse();
        // GoogleGlasse 객체를 Wearable 인터페이스 타입 변수에 대입
        wearable = gg; // 인터페이스 타입으로 자동 형변환
        wearable.putOn();
        wearable.putOff();
        System.out.println();

        // 인터페이스 타입 ArrayList 선언
        // Wearable 인터페이스를 구현한 클래스의 객체들을 저장할 수 있다.
        ArrayList<Wearable> wearableList = new ArrayList<Wearable>();
        wearableList.add(hp); // 자동 형변환(자식객체 -> 부모)
        wearableList.add(gg);
        useAllWearable(wearableList);

    }

    // 모든 착용 가능한 기기를 착용하고 벗는 메소드
    public static void useAllWearable(ArrayList<Wearable> wearableList){
        for(Wearable wearable : wearableList){
            wearable.putOn();
            wearable.putOff();
        }

    }
}
