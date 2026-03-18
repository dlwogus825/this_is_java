package com.mjc813;

// Q2 클래스 - 이름과 나이를 가진 사람 정보를 저장하는 클래스
public class Q2 {
    // 필드(속성)
    public String name;  // 이름
    public int age;      // 나이

    // 생성자 - 객체 생성 시 이름과 나이를 초기화
    public Q2(String name, int age){
        this.name = name;  // 매개변수 name을 필드 name에 저장
        this.age = age;    // 매개변수 age를 필드 age에 저장
    }

    // hashCode 메서드 오버라이드
    // HashSet, HashMap 등에서 객체를 빠르게 찾기 위해 사용
    // 같은 name과 age를 가진 객체는 같은 해시코드 반환
    @Override
    public int hashCode(){
        return name.hashCode() + age;  // 이름의 해시코드 + 나이
    }

    // equals 메서드 오버라이드
    // 두 객체가 "논리적으로 같은지" 비교
    // name과 age가 모두 같으면 같은 객체로 판단
    @Override
    public boolean equals(Object obj){
        // obj가 Q2 타입인지 확인하고, 맞으면 target 변수에 할당
        if(obj instanceof Q2 target){
            // 이름이 같고 AND 나이가 같으면 true 반환
            return target.name.equals(name) && (target.age==age);
        }else{
            // Q2 타입이 아니면 false 반환
            return false;
        }
    }
}