package ru.job4j.io;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columnCount = Integer.parseInt(sc.nextLine());
        String star = "*";
        String space = " ";
        String[][] array = new String[columnCount][columnCount];
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == array.length - 1) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = star;
                }
            } else {
                array[i][i] = star;
                array[i][array.length - 1 - i] = star;
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == null) {
                        array[i][j] = space;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
