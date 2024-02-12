package org.example.task;

import org.example.console.ReadConsole;

import java.util.Random;

/*
3. Вывести заданное количество случайных чисел с переходом и без перехода
    на новую строку.
 */
public class Task3 extends Task{
    private int[] array;
    @Override
    public void task() {
        System.out.println("3. Вывести заданное количество случайных чисел с переходом и без перехода\n" +
                "    на новую строку.");
        while (true) {
            System.out.println("Введите количество случайных чисел или 0 для выхода:");
            int num = ReadConsole.getInteger();
            initArray(num);
            setArrayRandom(100);
            int size = 10;
            System.out.println("С переходом: " + size);
            show(size);
            System.out.println("Без перехода:");
            show(0);
        }
    }

    public void initArray(int size) {
        array = new int[size];
    }

    public void setArrayRandom(int random) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(random);
        }
    }

    public void show(int size) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            System.out.print(array[i] + "\t");
            if (count == size) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();
    }

}