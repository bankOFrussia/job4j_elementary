package ru.job4j.condition;

public class Games {
    public static void permisson(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.permisson(true, true);
        Games.permisson(true, false);
        Games.permisson(false, true);
        Games.permisson(false, false);
    }
}
