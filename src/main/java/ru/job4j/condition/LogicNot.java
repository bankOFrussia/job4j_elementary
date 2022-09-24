package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPozitive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPozitive(int num) {
        return (!isEven(num) || isPositive(num));
    }

    public static boolean evenOrNotPozitive(int num) {
        return isEven(num) && !isPositive(num);
    }
}
