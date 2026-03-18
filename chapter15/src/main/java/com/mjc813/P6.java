package com.mjc813;

public class P6 {
    private String company;
    private String os;

    public P6(String company, String os){
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString(){
        return company +","+os;
    }
}
