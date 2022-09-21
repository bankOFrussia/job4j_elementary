package ru.job4j.condition;

public class DammyBot {
    public static String answer(String question) {
        String rsl = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            rsl = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            rsl = "See you later.";
        }
        return rsl;

    }

    public static void main(String[] args) {
        String rsl = DammyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DammyBot.answer("Bye.");
        System.out.println(rsl);
    }
}
