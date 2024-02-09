package org.example.menu;

import org.example.console.ReadConsole;
import org.example.factory.FactoryTask;

public class Menu {
    private FactoryTask factoryTask;

    public Menu() {
        factoryTask = new FactoryTask();
    }

    public void game() {
        while (true) {
            menu();
            String line = ReadConsole.getString();
            if (line.equals("0")) break;
            select(line);
        }
        System.out.println("Вышли из программы");
    }

    public void menu() {
        System.out.println("""
                \tВыбирите действие:
                \t1 - Здача N1.
                \t2 - Здача N2.
                \t3 - Здача N3.
                \t4 - Здача N4.
                \t5 - Здача N5.
                \t6 - Здача N6.
                \t0 - Выход.
                """);
    }

    public void select(String line) {
        switch(line) {
            case "1" -> factoryTask.task1();
            case "2" -> factoryTask.task2();
            case "3" -> factoryTask.task3();
            case "4" -> factoryTask.task4();
            case "5" -> factoryTask.task5();
            case "6" -> factoryTask.task6();
            default -> {
                System.out.println("команды нет такой");
            }
        }
    }
}
