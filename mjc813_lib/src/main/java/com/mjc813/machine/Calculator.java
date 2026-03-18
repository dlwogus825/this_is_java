package com.mjc813.machine;


//items 배열의 원소의 총합을 long 형을 구해서 리턴합니다.

/*
@param items
@return 매개변수들의 총 합계
 */

public class Calculator {
    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int multiply(int... numbers) {
        if (numbers.length == 0) return 1;
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}