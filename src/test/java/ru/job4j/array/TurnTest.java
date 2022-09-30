package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenElementsThenTurnArray() {
        int[] array = {4, 1, 6, 2};
        int[] expected = {2, 6, 1, 4};
        int[] rsl = Turn.back(array);
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThanTurnedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(array);
        assertThat(rsl).containsExactly(expected);
    }
}