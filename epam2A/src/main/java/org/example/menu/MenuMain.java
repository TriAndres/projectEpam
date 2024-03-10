package org.example.menu;

import org.example.console.ReadConsole;
import org.example.exseption.MyException;
import org.example.manage.ManageNumber;

public class MenuMain {
    private ManageNumber manageNumber;
    private MenuManageNumber menuManageNumber;
    private MenuTask menuTask;
    public MenuMain() {
        manageNumber = new ManageNumber();
        menuManageNumber = new MenuManageNumber(manageNumber);
        menuTask = new MenuTask(manageNumber);
    }
    public void game() {
        while (true) {
            try {
                System.out.println("""
                        \n\tВыбирите действие:
                        \t1 - Меню цифр.
                        \t2 - Меню задач.
                        \t0 - Выход 
                        """);
                int num = ReadConsole.getInteger();
                if (num == 0) break;
                switch (num) {
                    case 1 -> menuManageNumber.game();
                    case 2 -> menuTask.game();
                    default -> throw new MyException("Ошибка, не верный ввод.");
                }
            } catch (MyException e) {
                System.out.println(e);;
            }
        }

    }
}
