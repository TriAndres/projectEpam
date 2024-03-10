package org.example.menu;

import org.example.console.ReadConsole;
import org.example.exseption.MyException;
import org.example.manage.ManageNumber;

public class MenuManageNumber extends Menu{
    public MenuManageNumber(ManageNumber manageNumber) {
        super(manageNumber);
    }

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
                        \t0 - Выход из меню цифр
                        """);
                int num = ReadConsole.getInteger();
                if (num == 0) break;
                switch (num) {
                    case 1 -> factoryManageNumber.addNewNum();
                    case 2 -> factoryManageNumber.addListNum();
                    case 3 -> factoryManageNumber.removeById();
                    case 4 -> factoryManageNumber.clear();
                    case 5 -> factoryManageNumber.show();
                    default -> throw new MyException("Ошибка, не верный ввод.");
                }
            } catch (MyException e) {
                System.out.println(e);;
            }
        }

    }
}
