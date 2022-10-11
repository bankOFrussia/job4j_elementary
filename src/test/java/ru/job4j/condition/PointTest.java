package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to02Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when33to31Then2() {
        Point a = new Point(3, 3);
        Point b = new Point(3, 1);
        int expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to16Then4() {
        Point a = new Point(1, 2);
        Point b = new Point(1, 6);
        int expected = 4;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}