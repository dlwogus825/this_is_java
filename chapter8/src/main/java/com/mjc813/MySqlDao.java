package com.mjc813;

public class MySqlDao implements DataAccessObject{

    @Override
    public void select(){
        System.out.println("Mysql에 검색");
    }
    @Override
    public void insert(){
        System.out.println("Mysql에 삽입");
    }@Override
    public void update(){
        System.out.println("Mysql에 수정");
    }
    @Override
    public void delete(){
        System.out.println("Mysql에 삭제");
    }
}
