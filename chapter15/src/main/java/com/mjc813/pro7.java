package com.mjc813;

public class pro7 {
    private String title; // 이 클래스에서만 접근 가능한 문자열 변수 title
    private String content;

    public pro7(String title, String content) {
        this.title = title;
        this.content = content;

    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

}
