package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    public void whenSumByEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int rsl = Counter.sumByEven(start, finish);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenSumByEvenNumbersFrom4To24Then154() {
        int start = 4;
        int finish = 24;
        int expected = 154;
        int rsl = Counter.sumByEven(start, finish);
        assertThat(rsl).isEqualTo(expected);
    }
}