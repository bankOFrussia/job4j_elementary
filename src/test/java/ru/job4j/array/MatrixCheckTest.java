package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MatrixCheckTest {

    @Test
    public void whenMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        int row = 1;
        boolean rsl = MatrixCheck.monoHorizontal(input, row);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenMonoHorizontalIsAbsent() {
        char[][] input = {
                {' ', 'X', ' '},
                {'X', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int row = 2;
        boolean rsl = MatrixCheck.monoHorizontal(input, row);
        assertThat(rsl).isFalse();
    }
}