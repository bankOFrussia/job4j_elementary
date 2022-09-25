package ru.job4j.condition;

public class IfElseReturn {
    public static boolean greatThen(int first, int second) {
        return first > second;
    }

    public static void main(String[] args) {
        System.out.println(greatThen(10, 2));
    }
}
