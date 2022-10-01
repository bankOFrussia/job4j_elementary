package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinTest {

    @Test
    public void whenFirstMin() {
        int[] array = {0, 5, 10};
        int expected = 0;
        int result = Min.findMin(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3};
        int expected = 3;
        int result = Min.findMin(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 2, 5};
        int expected = 2;
        int result = Min.findMin(array);
        assertThat(result).isEqualTo(expected);
    }
}