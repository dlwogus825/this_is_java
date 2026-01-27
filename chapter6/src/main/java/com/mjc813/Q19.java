package com.mjc813;

public class Q19 {
    public void run(){
        Member member = new Member();

        Member.Address addr = member.new Address();
        addr.printAddress();
        Member.ContactInfo contact = member.new ContactInfo();
        contact.printContact();

    }
}
