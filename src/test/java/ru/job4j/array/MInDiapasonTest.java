package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class MInDiapasonTest {

    @Test
    public void whenFirstMin() {
       int[] array = {-1, 0, 5, 10};
       int start = 1;
       int finish = 3;
       int expected = 0;
       int result = MInDiapason.findMin(array, start, finish);
       assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = {10, 5, 3, 1};
        int start = 1;
        int finish = 3;
        int expected = 1;
        int result = MInDiapason.findMin(array, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = {10, 2, 5, 1};
        int start = 0;
        int finish = 2;
        int expected = 2;
        int result = MInDiapason.findMin(array, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}