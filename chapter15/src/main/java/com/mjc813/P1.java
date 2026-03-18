package com.mjc813;

public class P1 {
    public String id;

    public P1(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof P1 target){  // obj가 P1 타입인지 확인
            if(id.equals(target.id)){  // ID가 같은지 비교
                return true;  // 같으면 true
            }
        }
        return false;  // 다르면 false
    }
}
