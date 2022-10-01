package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            result = data[1] == data[i];
            if (data[1] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
