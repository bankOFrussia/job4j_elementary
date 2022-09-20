package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert2000RblThen28dot57Euro() {
        float in = 2000;
        float expected = 28.57f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert700RblThen11dot66Dlr() {
        float in = 700;
        float expected = 11.66f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.01f;
        Assert.assertEquals(expected, out, eps);
    }
}