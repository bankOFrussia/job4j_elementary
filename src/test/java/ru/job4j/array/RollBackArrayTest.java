package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RollBackArrayTest {

    @Test
    public void whenEmpty() {
        int[] in = new int[] {};
        int[] expected = new int[] {};
        int[] rsl = RollBackArray.rollback(in);
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenOne() {
        int[] in = new int[] {1};
        int[] expected = new int[] {1};
        int[] rsl = RollBackArray.rollback(in);
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenFull() {
        int[] in = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1};
        int[] rsl = RollBackArray.rollback(in);
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenTheSame() {
        int[] in = new int[] {1, 1, 1, 1};
        int[] expected = new int[] {1, 1, 1, 1};
        int[] rsl = RollBackArray.rollback(in);
        assertThat(rsl).containsExactly(expected);
    }
}