package ru.job4j.array;


import static java.lang.Character.isDigit;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean rsl = false;
        char[] array = name.toCharArray();

        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isSpecialSymbol(code) || isUpperLatinLetter(code) || isLowerLatinLetter(code) || isDigit(code)) {
                rsl = true;
            } else {
                rsl = false;
            }
        }
        if (name.isEmpty() || isDigit(name.charAt(0)) || isUpperLatinLetter(array[0])) {
            rsl = false;
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean rsl = false;
        if (code == 36 || code == 95) {
            rsl = true;
        }
        return rsl;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean rsl = false;
        if (code >= 65 && code <= 90) {
        rsl = true;
        }
    return rsl;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean rsl = false;
        if (code >= 97 && code <= 122) {
            rsl = true;
        }
        return rsl;
    }
}
