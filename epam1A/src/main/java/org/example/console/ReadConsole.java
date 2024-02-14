package org.example.console;

import java.util.Scanner;

public class ReadConsole {
    private static Scanner scanner = new Scanner(System.in);
    public static String getString() {
        return scanner.next();
    }

    public static Integer getInteger() {
        int a = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                break;
            } else {
                scanner.nextLine();
            }
        }
        return a;
    }
}
