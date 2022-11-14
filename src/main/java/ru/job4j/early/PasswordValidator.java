package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {
    public static String validate(String password) throws IllegalArgumentException {
        int countNumbers = 0;
        int countSymbols = 0;
        String[] illegalPasswords = {"qwerty", "password", "admin", "user", "12345"};
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (password.equals(password.toUpperCase())) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (password.equals(password.toLowerCase())) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        for (char one : password.toCharArray()) {
            if (countSymbols > 0 && countNumbers > 0) {
                break;
            } else if (isDigit(one)) {
                countNumbers++;
            } else if (!isLetterOrDigit(one)) {
                countSymbols++;
            }
        }
        if (countNumbers == 0) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (countSymbols == 0) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        for (String pass : illegalPasswords) {
            if (password.toLowerCase().indexOf(pass) > 0) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}

