package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K8Square3dot55() {
        double expected = 3.55;
        int p = 12;
        int k = 8;
        double out = SqArea.square(12, 8);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K3Square27() {
        int expected = 27;
        int p = 24;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP33K3Square51dot04() {
        double expected = 51.04;
        int p = 33;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}