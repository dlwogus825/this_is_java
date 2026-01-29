package com.mjc813.chapter07;

public class Rabbit extends Animalobj{

    @Override
    public Object eat(Animalobj obj) {
        if (obj instanceof Swam) {
            System.out.println("Rabbit이 Swam을 먹습니다.");
            return obj;
        }
        System.out.println("Rabbit은 Swam만 먹을 수 있습니다.");
        return null;
    }

    @Override
    public void breathe() {
        System.out.println("Rabbit은 폐로 숨을 쉽니다.");
    }
}
