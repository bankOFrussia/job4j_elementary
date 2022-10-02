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

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isTrue();
    }

    @Test
    public void whenHasMonoVerticalIsAbsent() {
        char[][] input = {
                {' ', 'X', 'X'},
                {'X', ' ', ' '},
                {' ', ' ', 'X'},
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        assertThat(result).isFalse();
    }

    @Test
    public void whenDiagonalFullX() {
        char[][] in = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'}
        };
        char[] expected = {'X', 'X', 'X'};
        char[] rsl = MatrixCheck.extractDiagonal(in);
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] in = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'}
        };
        char[] expected = {'1', '1', '1'};
        char[] rsl = MatrixCheck.extractDiagonal(in);
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] in = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'}
        };
        char[] expected = {'X', 'Y', 'Z'};
        char[] rsl = MatrixCheck.extractDiagonal(in);
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenDataMonoTrueThenTrue() {
        char[][] in = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        boolean rsl = MatrixCheck.isWin(in);
        assertThat(rsl).isTrue();
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] in = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        boolean rsl = MatrixCheck.isWin(in);
        assertThat(rsl).isFalse();
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] in = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '}
        };
        boolean rsl = MatrixCheck.isWin(in);
        assertThat(rsl).isTrue();
    }
}