package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    public void whenFactorial5Is120() {
        int in = 5;
        int expected = 120;
        int out = Factorial.calc(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenFactorial100Is3628800() {
        int in = 10;
        int expected = 3_628_800;
        int out = Factorial.calc(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenFactorialForZeroThenOne() {
        int in = 0;
        int expected = 1;
        int out = Factorial.calc(in);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenFactorialForMinus2ThenOne() {
        int in = -2;
        int expected = 1;
        int out = Factorial.calc(in);
        assertThat(out).isEqualTo(expected);
    }
}