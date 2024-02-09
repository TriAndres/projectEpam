package org.example.task;

import org.example.console.ReadConsole;

/*
2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class Task2 extends Task{
    @Override
    public void task() {
        System.out.println("2. Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        action();
    }
    public void action() {
        while (true) {
            System.out.println("ведите аргумент или 0 для выхода:");
            String line = ReadConsole.getString();
            if (line.equals("0")) break;
            System.out.println(" обратном порядке:");
            System.out.println(new StringBuilder().append(line).reverse());
        }
        System.out.println("Вышли из цикла.");
    }
}