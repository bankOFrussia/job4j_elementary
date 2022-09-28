package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MortgageTest {

    @Test
    public void whenAmount1000Salary1200Percent1ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int expected = 1;
        int out = Mortgage.year(amount, salary, percent);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenAmount100Salary120Percent50ThenYear2() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int expected = 2;
        int out = Mortgage.year(amount, salary, percent);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenAmount1000Salary1200Percent20ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 20;
        int expected = 1;
        int out = Mortgage.year(amount, salary, percent);
        assertThat(out).isEqualTo(expected);
    }
}