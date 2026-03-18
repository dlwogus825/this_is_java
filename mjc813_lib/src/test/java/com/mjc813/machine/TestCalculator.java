package com.mjc813.machine;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class TestCalculator {
    @Test
    public void testAdd(){
        Calculator cal = new Calculator();

        // 여러 숫자 더하기
        assertThat(cal.add(1, 2, 3, 7, 8)).isEqualTo(21);

        // 아무것도 안 넣으면 0
        assertThat(cal.add()).isEqualTo(0);

        // 숫자 하나만
        assertThat(cal.add(5)).isEqualTo(5);

        // 두 개 더하기
        assertThat(cal.add(10, 20)).isEqualTo(30);

        // 음수 포함
        assertThat(cal.add(-5, 10, -3)).isEqualTo(2);

        // 큰 숫자들
        assertThat(cal.add(100, 200, 300)).isEqualTo(600);
    }


    }
