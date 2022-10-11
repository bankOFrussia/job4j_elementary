package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int expected = 3;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int expected = 5;
        int out = Max.max(left, right);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenMax2To5To7Then7() {
        int left = 2;
        int right = 5;
        int up = 7;
        int expected = 7;
        int out = Max.max(left, right, up);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenMax3To6To4To9Then9() {
        int left = 3;
        int right = 6;
        int up = 4;
        int down = 9;
        int expected = 9;
        int rsl = Max.max(left, right, up, down);
        assertThat(rsl).isEqualTo(expected);
    }
}