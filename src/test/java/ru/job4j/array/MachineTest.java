package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MachineTest {

    @Test
    public void whenMoneyEqualsPrice() {
        int money = 100;
        int price = 100;
        int[] rsl = Machine.change(money, price);
        int[] expected = {};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price35() {
        int money = 50;
        int price = 35;
        int[] rsl = Machine.change(money, price);
        int[] expected = {10, 5};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price21() {
        int money = 50;
        int price = 21;
        int[] rsl = Machine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        assertThat(rsl).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price32() {
        int money = 50;
        int price = 32;
        int[] rsl = Machine.change(money, price);
        int[] expected = {10, 5, 2, 1};
        assertThat(rsl).containsExactly(expected);
    }
}