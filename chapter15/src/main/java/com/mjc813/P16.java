package com.mjc813;

import java.util.Arrays;

public class P16 {

    public static void main(String[] args) throws Exception {
        // 원본 문자열
        String data = "자바";

        // 1. 기본 인코딩(UTF-8)으로 바이트 배열 변환
        byte[] arr1 = data.getBytes();  // "자바"를 바이트로 변환
        System.out.println("arr1: " + Arrays.toString(arr1));  // [-20, -98, -90, -21, -80, -108] 출력

        // 바이트 배열을 다시 문자열로 복원
        String str1  = new String(arr1);  // UTF-8로 디코딩
        System.out.println("str1: " + str1);  // "자바" 출력

        // 2. EUC-KR 인코딩으로 바이트 배열 변환
        byte[] arr2 = data.getBytes("EUC-KR");  // "자바"를 EUC-KR 방식으로 변환
        System.out.println("arr2: " + Arrays.toString(arr2));  // [-64, -38, -71, -41] 출력 (UTF-8과 다름)

        // 바이트 배열을 EUC-KR로 다시 문자열로 복원
        String str2 = new String(arr2, "EUC-KR");  // EUC-KR로 디코딩
        System.out.println("str2: " + str2);  // "자바" 출력
    }
}
