package org.example.menu;

import org.example.console.ReadConsole;
import org.example.factory.FactoryTask;

public class Menu {
    private final FactoryTask factoryTask;

    public Menu() {
        factoryTask = new FactoryTask();
    }

    public void Game() {
        while (true) {
            int num = menu();
            if (num == 0) break;
            select(num);
        }
        System.out.println("Вышли из программы");
    }

    private int menu() {
        System.out.println("\n\tДействие:" +
                "\n\t1 -  Зaдача N1" +
                "\n\t2 -  Зaдача N2" +
                "\n\t3 -  Зaдача N3" +
                "\n\t4 -  Зaдача N4" +
                "\n\t5 -  Зaдача N5" +
                "\n\t6 -  Зaдача N6" +
                "\n\t7 -  Зaдача N7" +
                "\n\t8 -  Зaдача N8" +
                "\n\t9 -  Зaдача N9" +
                "\n\t10 - Зaдача N10" +
                "\n\t11 - Зaдача N11" +
                "\n\t0 - Выйти из программы"
        );
        return ReadConsole.getInteger();
    }

    private void select(int num) {
        switch (num) {
            case 1 -> factoryTask.task1();
            case 2 -> factoryTask.task2();
            case 3 -> factoryTask.task3();
            case 4 -> factoryTask.task4();
            case 5 -> factoryTask.task5();
            case 6 -> factoryTask.task6();
            case 7 -> factoryTask.task7();
            case 8 -> factoryTask.task8();
            case 9 -> factoryTask.task9();
            case 10 -> factoryTask.task10();
            case 11 -> factoryTask.task11();
        }
    }
}