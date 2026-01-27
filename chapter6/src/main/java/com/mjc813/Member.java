package com.mjc813;

public class Member {
    String name = "이재현";
    String id = "2020051078";
    String password = "pancake2026";
    int age = 26;


    class Address {
        String city = "서울";
        String street = "강남대로";
        int zipCode = 12345;

        void printAddress() {
            System.out.println(name + "의 주소" + city + " " + street);
        }
    }
    class ContactInfo{
        String phone = "010-1234-5678";
        String email = "test@example.com";

        void printContact() {
            System.out.println(name + "의 연락처"+phone);
        }
    }
}