package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
}