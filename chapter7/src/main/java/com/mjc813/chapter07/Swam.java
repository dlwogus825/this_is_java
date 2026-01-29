package com.mjc813.chapter07;

public class Swam extends Animalobj {

    @Override
    public Object eat(Animalobj obj) {
        System.out.println("Swam은 동물을 먹지 못합니다.");
        return null;
    }

    @Override
    public void breathe() {
        System.out.println("Swam은 아가미로 숨을 쉽니다.");
    }
}