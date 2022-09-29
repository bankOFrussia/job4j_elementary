package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] array = new int[] {5, 10, 3};
        int el = 5;
        int rsl = FindLoop.indexOf(array, el);
        int expected = 0;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] array = new int[] {3, 4, 6, 9, 23};
        int el = 10;
        int rsl = FindLoop.indexOf(array, el);
        int expected = -1;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas11Then2() {
        int[] array = new int[] {3, 1, 11, 14};
        int el = 11;
        int rsl = FindLoop.indexOf(array, el);
        int expected = 2;
        assertThat(rsl).isEqualTo(expected);
    }
}