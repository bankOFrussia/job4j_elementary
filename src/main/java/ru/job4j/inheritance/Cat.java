package ru.job4j.inheritance;

public class Cat extends Animal {
    @Override
    public void instanceInvoke() {
        System.out.println("Вызов экземпляра Cat");
    }

    public static void staticInvoke() {
        System.out.println("Вызов статического экземпляра Cat");
    }
}
