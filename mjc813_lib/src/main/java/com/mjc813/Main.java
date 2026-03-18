package com.mjc813;

import com.mjc813.machine.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int add(int... numbers) {
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }

        return sum;
    }
    }