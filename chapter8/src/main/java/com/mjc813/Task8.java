package com.mjc813;

public class Task8 {
    public static void action(A a){
        //“A 자격증 가진 사람 아무나 한 명 데려와”A는 인터페이스 a는 매개변수이며 A에 속한 객체의 값의 매개변수를 a로 가져오는 것을 뜻한다.
        //다만 A는 인터페이스이기에 a는 A에 객체를 가져오는 것이 아닌 A를 구현한 객체를 외부에서 받아 a에 사용한다가 더 적합하다.
        a.method1(); //메소드1을 매개변수를 받아작동 on
            if(a instanceof C c){ //C가 클래스이고 c가 매개변수이다. 씨타입의  변수 c인지 확인
            c.method2();
        }
    }

    public static void run(){
        action(new B());
        action(new C());
    }
}
