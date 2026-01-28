package com.mjc813.chapter07;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Employee extends Person2{
    @Override
    public void work(){
        System.out.println("제품을 생산합니다.");
    }
}
