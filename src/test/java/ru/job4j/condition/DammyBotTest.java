package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DammyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi, Bot.";
        String result = DammyBot.answer(in);
        String expected = "Hi, SmartAss.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String in = "Bye.";
        String result = DammyBot.answer(in);
        String expected = "See you later.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String in = "Can you add two plus to?";
        String result = DammyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expected);
    }
}