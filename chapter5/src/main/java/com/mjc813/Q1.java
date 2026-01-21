package com.mjc813;

public class Q1 {
    public void run1(){
        int[] arr1;
        int[] arr2;
        int[] arr3;


        arr1 = new int[] {1,2,3};
        arr2 = new int[] {1,2,3};
        arr3 = arr2;

        System.out.println(arr1 == arr2); //항목은 같으나 대입되는 번지가 다르므로 false가 출려된다


        System.out.println(arr2 == arr3);// 애초에 arr3은 arr2의 번지에 있는 값을 참고했으므로 true가 출력된다.

    }
}
