package ru.job4j.loop;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        for (int i = 0; i < columnCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (i <= columnCount / 2 && j == columnCount - i - 1) {
                    System.out.print(star);
                    break;
                } else if (i == 0 || i == j || i == columnCount - 1) {
                    System.out.print(star);
                } else {
                    System.out.print(space);
                }
            }
            System.out.println();
        }
    }
}