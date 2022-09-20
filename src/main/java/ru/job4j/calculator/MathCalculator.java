package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndSplit(double first, double second) {
        return subtract(first, second)
                + split(first, second);
    }

    public static double sumAllResults(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtract(first, second)
                + split(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Вычитание и деление: " + subtractAndSplit(50, 10));
        System.out.println("Сумма четырёх операций равна: " + sumAllResults(30, 10));
    }
}
