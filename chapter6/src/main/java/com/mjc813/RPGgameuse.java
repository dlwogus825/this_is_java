package com.mjc813;

public class RPGgameuse {
    public void run(){

        RPGgame rpg = new RPGgame();

        System.out.println("캐릭터 이름: " + rpg.name);
        System.out.println("직업: " + rpg.job);
        System.out.println("성별: " + rpg.gender);
        System.out.println("생년월일: " + rpg.birth);
        System.out.println("체력(HP): " + rpg.HP);
        System.out.println("마나(MP): " + rpg.MP);
        System.out.println("힘(STR): " + rpg.STR);
        System.out.println("지능(INT): " + rpg.INT);
        System.out.println("민첩(DEX): " + rpg.DEX);
        System.out.println("행운(LUK): " + rpg.LUX);




    }
}
