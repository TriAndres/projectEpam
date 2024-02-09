package org.example.console;

import java.util.Scanner;

public class ReadConsole {
    private static Scanner scanner = new Scanner(System.in);
    public static String getString() {
        return scanner.nextLine();
    }
}
