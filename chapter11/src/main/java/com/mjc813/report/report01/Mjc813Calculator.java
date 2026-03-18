package com.mjc813.report.report01;

public class Mjc813Calculator {
    public Long sum(Integer... arrs) { //intger은 정수를 가질 수 있는 객체이다.
        Long result = 0L;


        if (arrs == null) {
            throw new NullPointerException();
        }

        try {
            for (Integer a : arrs) {
                result += a;
            }
        } catch (NullPointerException e) {
            System.out.println("null 값입니다.휴먼 값을 재정립 하십시오");
        }

        // arrs 값들의 모든 합을 구해야 합니다.
        // 다만 arrs 배열이 null 일 수 있으므로 예외처리를 이곳이든 이곳을 호출하는 메소드에서든 꼭 해야 합니다.
        return result;
    }

    public Long sum(Integer[] arrs, Integer start, Integer end) throws NullPointerException {
        Long result = 0L;

        // null 체크
        if (arrs == null) {
            throw new NullPointerException();
        }
        if (start == null) {
            throw new NullPointerException();
        }
        if (end == null) {
            throw new NullPointerException();
        }

        if (start < 0 || end >= arrs.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = start; i <= end; i++) {
            if (arrs[i] == null) {  // 각 원소도 null 체크
                throw new NullPointerException();
            }
            result += arrs[i];
        }

        return result;
    }

}