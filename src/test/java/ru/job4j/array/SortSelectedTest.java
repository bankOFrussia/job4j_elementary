package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class SortSelectedTest {

    @Test
    public void whenSortWith5Numbers() {
        int[] data = {3, 4, 1, 2, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith7Numbers() {
        int[] data = {3, 8, 1, 2, 4, 7, 9};
        int[] expected = {1, 2, 3, 4, 7, 8, 9};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortWith3Numbers() {
        int[] data = {6, 4, 9};
        int[] expected = {4, 6, 9};
        int[] result = SortSelected.sort(data);
        assertThat(result).containsExactly(expected);
    }
}