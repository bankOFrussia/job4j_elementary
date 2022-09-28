package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CheckPrimeNumberTest {

    @Test
    public void when5() {
        int number = 5;
        boolean out = CheckPrimeNumber.check(number);
        assertThat(out).isTrue();
    }

    @Test
    public void when4() {
        int number = 4;
        boolean out = CheckPrimeNumber.check(number);
        assertThat(out).isFalse();
    }

    @Test
    public void when1() {
        int number = 1;
        boolean out = CheckPrimeNumber.check(number);
        assertThat(out).isFalse();
    }
}