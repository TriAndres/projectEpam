package org.example.task;

import org.example.console.ReadConsole;

/*
2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */
public class Task2 extends Task{
    @Override
    public void task() {
        System.out.println("2. Отобразить в окне консоли аргументы командной строки в обратном порядке.");
        action2();
    }
    public void action1() {
        while (true) {
            System.out.println("введите аргумент или 0 для выхода:");
            String line = ReadConsole.getString();
            if (line.equals("0")) break;
            System.out.println("обратном порядке:");
            System.out.println(new StringBuilder().append(line).reverse());
        }
        System.out.println("Вышли из цикла.");
    }

    public void action2() {
        while (true) {
            System.out.println("введите аргумент или 0 для выхода:");
            String line = ReadConsole.getString();
            if (line.equals("0")) break;
            System.out.println("обратном порядке:");
            String[] array = line.split("");
            for (int i = array.length; i > 0; i--) {
                System.out.print(array[i - 1]);
            }
            System.out.println();
        }
        System.out.println("Вышли из цикла.");
    }
}