package org.example.task;

import org.example.console.ReadConsole;

/*
4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
 */
public class Task4 extends Task {
    @Override
    public void task() {
        System.out.println("4. Ввести пароль из командной строки и сравнить его со строкой-образцом.");
        action();

    }

    private void action() {
        String password = "password";
        while (true) {
            System.out.println("Введите пароль или 0 для выхода:");
            String line = ReadConsole.getString();
            if (line.equals("0")) break;
            if (line.equals(password)) {
                System.out.println("Верный ввод");
                break;
            }
        }
        System.out.println("Вышли из цикла.");
    }
}