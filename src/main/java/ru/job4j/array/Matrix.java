package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 1; i <= array.length; i++) {
            for (int j = 1; j <= array.length; j++) {
                array[i - 1][j - 1] = i * j;
            }
        }
        return array;
    }
}
