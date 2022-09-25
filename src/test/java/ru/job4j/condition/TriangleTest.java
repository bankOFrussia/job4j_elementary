package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean out = Triangle.exist(ab, ac, bc);
        assertThat(out).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 3.0;
        double ac = 4.0;
        double bc = 8.0;
        boolean out = Triangle.exist(ab, ac, bc);
        assertThat(out).isFalse();
    }
}