package com.mjc813.chapter07;

public class Phone1 {

    private String model;
    private String color;

    public Phone1(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone생성자 실행");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
