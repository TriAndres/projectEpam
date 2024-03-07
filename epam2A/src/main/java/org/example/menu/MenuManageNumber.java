package org.example.menu;

import org.example.console.ReadConsole;
import org.example.exseption.MyException;

public class MenuManageNumber extends Menu{
    public void game() {
        while (true) {
            try {
                System.out.println("""
                        \n\tВыбирите действие:
                        \t1 - Добавить цифру.
                        \t2 - Добавить список цифр.
                        \t3 - Удалить по id цифру
                        \t4 - Удалить весь список
                        \t5 - Показать список
                        \t0 - Выход из меню
                        """);
                int num = ReadConsole.getInteger();
                if (num == 0) break;
                switch (num) {
                    case 1 -> factoryMain.factoryManageNumber().addNewNum();
                    case 2 -> factoryMain.factoryManageNumber().addListNum();
                    case 3 -> factoryMain.factoryManageNumber().removeById();
                    case 4 -> factoryMain.factoryManageNumber().clear();
                    case 5 -> factoryMain.factoryManageNumber().show();
                    default -> throw new MyException("Ошибка, не верный ввод.");
                }
            } catch (MyException e) {
                System.out.println(e);;
            }
        }

    }
}
