package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int rsl = 1;
        for (int i = 2; i <= n; i++) {
            rsl = rsl * i;
        }
        return rsl;
    }
}
