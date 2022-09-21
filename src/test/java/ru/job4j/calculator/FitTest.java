package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenManHeight187ThenWeight100dot05() {
        short in = 187;
        double expected = 100.05;
        double rsl = Fit.manWeight(in);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenWomanHeight170ThenWeight69() {
        short in = 170;
        double expected = 69;
        double rsl = Fit.womanWeight(in);
        Assert.assertEquals(expected, rsl, 0.01);
    }
}