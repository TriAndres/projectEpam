package org.example.menu;

import org.example.console.ReadConsole;
import org.example.exseption.MyException;
import org.example.manage.ManageNumber;

public class MenuTask extends Menu{
    public MenuTask(ManageNumber manageNumber) {
        super(manageNumber);
    }

    public void game() {
        while (true) {
            try {
                System.out.println("""
                        \n\tВыбирите действие:
                        \t1 - Задача1.
                        \t2 - Задача2.
                        \t3 - Задача3.
                        \t4 - Задача4.
                        \t5 - Задача5.
                        \t6 - Задача6.
                        \t7 - Задача7.
                        \t8 - Задача8.
                        \t9 - Задача9.
                        \t0 - Выход из меню задач
                        """);
                int num = ReadConsole.getInteger();
                if (num == 0) break;
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
                    default -> throw new MyException("Ошибка, не верный ввод.");
                }
            } catch (MyException e) {
                System.out.println(e);;
            }
        }

    }
}
