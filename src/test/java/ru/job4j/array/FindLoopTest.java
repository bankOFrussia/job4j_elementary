package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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

    @Test
    public void whenDiapasonHas2Than3() {
        int[] data = {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas5Than2() {
        int[] data = {2, 4, 5, 7, 9};
        int el = 5;
        int start = 1;
        int finish = 4;
        int expected = 2;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = {5, 1, 2, 4, 9, 4, 3, 1};
        int el = 8;
        int start = 4;
        int finish = 7;
        int expected = -1;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}