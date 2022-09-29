package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBound7Then0149162536() {
        int bound = 7;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16, 25, 36};
        assertThat(result).containsExactly(expected);
    }
}