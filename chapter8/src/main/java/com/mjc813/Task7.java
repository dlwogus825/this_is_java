package com.mjc813;

public class Task7 {

    //매개변수 괄호 안에다가 넣는 이유는 다형성 때문이다. 다형성은 부모 하나가 여러 자식을 다룰 수 있는 능력을 뜻한다.
        public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }
    public static void run(){
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}
