package org.example.factory.factorys;

import org.example.console.ReadConsole;
import org.example.factory.interfaces.FactoryManageNumbers;
import org.example.model.Numbers;

import java.util.List;

public class FactoryManageNumber extends Factory implements FactoryManageNumbers {

    public void addNewNum() {
        System.out.println("Введите чмсло:");
        manageNumber.addNewNum(new Numbers(ReadConsole.getInteger()));
        System.out.println("Успешно ввели.");
    }

    public void addListNum() {
        System.out.println("Введите количество цифр:");
        int size = ReadConsole.getInteger();
        System.out.println("Введите диапозон цифр от:");
        int from = ReadConsole.getInteger();
        System.out.println("Введите диапозон цифр до:");
        int to = 0;
        do {
            to = ReadConsole.getInteger();
        } while (to <= from);
        manageNumber.addListNum(size,from,to);
        System.out.println("Успешно ввели.");
    }

    public void removeById() {
        System.out.println("Введите id удаляемой цифры:");
        manageNumber.removeById(ReadConsole.getInteger());
        System.out.println("Успешно удалили.");
    }

    public void clear() {
        manageNumber.clear();
        System.out.println("Успешно удалили.");
    }

    public void show() {
        int count = 0;
        int len = 10;
        List<Numbers> numbersList = manageNumber.getNumberList();
        for (Numbers numbers : numbersList) {
            count++;
            System.out.print(numbers.getId() + "-" + numbers.getNum() + " ");
            if (count == len) {
                System.out.println();
                count = 0;
            }
        }
    }
}
