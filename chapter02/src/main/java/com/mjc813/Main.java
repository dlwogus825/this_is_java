package com.mjc813;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Variable01 v01 = new Variable01();
        v01.howToUseVariable();

        IntegerType integerType = new IntegerType();
        integerType.useInteger();

        // OperationPromotionExample의 main 호출
        OperationPromotionExample.main(args);

        TranslateType tt = new TranslateType();
        tt.useTranslate();
    }
}
