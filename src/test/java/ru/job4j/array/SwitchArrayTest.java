package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SwitchArrayTest {

    @Test
    void whenSwap0To3() {
        int[] array = new int[] {1, 2, 3, 4};
        int source = 0;
        int dest = array.length - 1;
        int[] rsl = SwitchArray.swap(array, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    void whenSwap1To6() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 1;
        int dest = 6;
        int[] rsl = SwitchArray.swap(array, source, dest);
        int[] expected = {1, 7, 3, 4, 5, 6, 2, 8};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    void whenSwap3To5() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 3;
        int dest = 5;
        int[] rsl = SwitchArray.swap(array, source, dest);
        int[] expected = {1, 2, 3, 6, 5, 4, 7, 8};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    void whenSwap0To1() {
        int[] array = new int[] {11, 22, 33, 44, 55};
        int source = 0;
        int dest = 1;
        int[] rsl = SwitchArray.swap(array, source, dest);
        int[] expected = {22, 11, 33, 44, 55};
        assertThat(rsl).containsExactly(expected);
    }
}