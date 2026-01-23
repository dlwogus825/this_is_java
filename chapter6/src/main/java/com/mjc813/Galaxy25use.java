package com.mjc813;

public class Galaxy25use {
    public void run() {

        Galaxy25 galaxy25 = new Galaxy25();

        System.out.println("회사명" + galaxy25.Company);
        System.out.println("모델명" + galaxy25.model);
        System.out.println("핸드폰색깔" + galaxy25.color);
        System.out.println("핸드폰메모리" + galaxy25.memory);
        System.out.println("핸드폰배터리양" + galaxy25.batterysize);
        System.out.println("핸드폰무게" + galaxy25.weight);
        System.out.println("핸드폰사이즈" + galaxy25.size);
        System.out.println("핸드폰전번" + galaxy25.phonenumber);


        galaxy25.setbattery(5);

        if (galaxy25.leftbattery()) {
            System.out.println("작동시작합니다..");
            galaxy25.run();

        }
        System.out.println("전원 연결 부탁드립니다.");
    }
}


