package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void when5() {
        int finish = 5;
        int expected = 3;
        int out = PrimeNumber.calc(finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void when11() {
        int finish = 11;
        int expected = 5;
        int out = PrimeNumber.calc(finish);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void when2() {
        int finish = 2;
        int expected = 1;
        int out = PrimeNumber.calc(finish);
        assertThat(out).isEqualTo(expected);
    }
}