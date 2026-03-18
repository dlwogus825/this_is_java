package com.mjc813;

public class Product {
    // 상품 번호, 이름, 회사, 가격 (외부 직접 접근 불가)
    private int pno;
    private String name;
    private String company;
    private int price;

    // 생성자 - 상품 객체 생성 시 4가지 값 초기화
    public Product(int pno, String name, String company, int price){
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    // Getter 메소드들
    public int getPno() { return pno; }
    public String getName() { return name; }
    public String getCompany() { return company; }
    public int getPrice() { return price; }

    // 객체를 문자열로 변환 (출력할 때 자동 호출됨)
    @Override
    public String toString(){
        return new StringBuilder()
                .append("{")
                .append("pno:" + pno + ", ")
                .append("name:" + name + ", ")       // name+name 버그 수정
                .append("company:" + company + ", ") // "company" 문자열 버그 수정
                .append("price:" + price)            // "price" 문자열 버그 수정
                .append("}")
                .toString();
    }
}