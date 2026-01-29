package com.mjc813.chapter07;

public class Fox extends Animalobj {

    @Override
    public Object eat(Animalobj obj) {
        if (obj instanceof Swam || obj instanceof Rabbit) {
            System.out.println("Fox가 먹이를 먹습니다.");
            return obj;
        }
        System.out.println("Fox는 Swam과 Rabbit만 먹을 수 있습니다.");
        return null;
    }

    @Override
    public void breathe() {
        System.out.println("Fox는 폐로 숨을 쉽니다.");
    }
}
