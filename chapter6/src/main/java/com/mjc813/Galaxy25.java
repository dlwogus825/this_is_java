package com.mjc813;

public class Galaxy25 {

    String Company = "삼성";
    String model = "Galaxy25+";
    String color = "검정";
    String memory = "12GB";
    int batterysize = 4900;
    int weight = 190;
    int size = 169;
    int phonenumber = 010 - 6494 - 7516;

    void setbattery(int batterysize) {
        this.batterysize = batterysize;
    }

    boolean leftbattery() {
        if (batterysize == 0) {
            System.out.println("배터리가 없수다");
            return false;
        }
        System.out.println("배터리가 있습니다.");
        return true;
    }

    void run() {
        while (true) {
            if (batterysize > 0) {
                System.out.println("작동중.(batterysize:" + batterysize + ")");
                batterysize -= 1;
            } else {
                System.out.println("작동을 중지합니다.(batterysize:" + batterysize + ")");
                return;
            }

        }
    }
}
//package com.mjc813;
//
//public class Car3 {
//    int gas;
//
//    void setGas(int gas) {
//        this.gas = gas;
//    }
//
//    boolean isLeftGas() {
//        if (gas == 0) {
//            System.out.println("가스가 없습니다");
//            return false;
//
//        }
//        System.out.println("gas가 있습니다.");
//        return true;
//
//    }
//
//    void run(){
//        while (true){
//            if (gas > 0){
//                System.out.println("달립니다.(gas잔량:"+gas+")");
//                gas -=1;
//            }else{
//                System.out.println("멈춥니다.(gas잔량:"+ gas+ ")");
//                return;
//            }
//        }
//    }
//}