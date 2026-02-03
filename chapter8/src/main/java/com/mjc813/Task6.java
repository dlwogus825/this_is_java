package com.mjc813;

public class Task6 {

    public static void printSound(Soundable soundalbe){

        System.out.println(soundalbe.sound());
    }
    public static void run(){
        printSound(new Cat());
        printSound(new Dog());
    }

}
