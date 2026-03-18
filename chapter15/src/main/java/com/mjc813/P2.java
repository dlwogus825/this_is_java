package com.mjc813;

public class P2 {
    public static void main(String[] args){
        P1 obj1 = new P1("blue");
        P1 obj2 = new P1("blue");
        P1 obj3 = new P1("red");


        if(obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 동등합니다.");
        }else{
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }


        if(obj1.equals(obj3)){
            System.out.println("obj1과 obj3는 동등합니다.");
        }else{
            System.out.println("obj1과 obj3은 동등하지 않습니다.");
        }
    }
}
