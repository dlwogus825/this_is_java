package com.mjc813.chapter07;

public class Tiger extends Animalobj{

    @Override
    public Object eat(Animalobj obj) {
        if (obj instanceof Rabbit) {
            System.out.println("Tiger가 Rabbit을 먹습니다.");
            return obj;
        }
        System.out.println("Tiger는 Rabbit만 먹을 수 있습니다.");
        return null;
    }

    @Override
    public void breathe() {
        System.out.println("Tiger는 폐로 숨을 쉽니다.");
    }
}
