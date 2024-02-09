package org.example.task;

import org.example.console.ReadConsole;

/*
1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */
public class Task1 extends Task{
    @Override
    public void task() {
        System.out.println("1. Приветствовать любого пользователя при " +
                "вводе его имени через командную строку.");
        action();
    }
    public void action() {
        String name;
        while (true){
            System.out.println("Введите своё имя или 0 для выхода");
            name = ReadConsole.getString();
            if (name.equals("0")) {
                System.out.println("вышли из цикла");
                break;
            }
            System.out.println(name + ", вас приветствую!");
        }
    }
}