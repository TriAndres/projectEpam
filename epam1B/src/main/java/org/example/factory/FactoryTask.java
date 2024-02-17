package org.example.factory;

import org.example.begin.ArrayNumber;
import org.example.console.ReadConsole;
import org.example.task.Task;
import org.example.task.*;

public class FactoryTask {
    private final ArrayNumber arrayNumber;
    private Task task;

    public FactoryTask() {
        arrayNumber = new ArrayNumber();
    }

    private int[] input() {
        int[] num = new int[1];
        System.out.println("Введите количество целых чисел:");
        num[0] = ReadConsole.getInteger();
        System.out.println("Вывод");
        return num;
    }

    public void task1() {
        int[] num = input();
        arrayNumber.showArray(num[0], 1, 100, 10);
        task = new Task1(arrayNumber.getArray());
        task.task();
    }

    public void task2() {
        int[] num = input();
        arrayNumber.showArray(num[0],1, 100, 10);
        task = new Task2(arrayNumber.getArray());
        task.task();
    }

    public void task3() {
        int[] num = input();
        arrayNumber.showArray(num[0],1, 100, 10);
        task = new Task3(arrayNumber.getArray());
        task.task();
    }

    public void task4() {
        int[] num = input();
        arrayNumber.showArray(num[0],1, 100, 10);
        task = new Task4(arrayNumber.getArray());
        task.task();
    }

    public void task5() {
        int[] num = input();
        arrayNumber.showArray(num[0],100, 999, 10);
        task = new Task5(arrayNumber.getArray());
        task.task();
    }

    public void task6() {
        int[] num = input();
        arrayNumber.showArray(num[0],1, 100, 10);
        task = new Task6(arrayNumber.getArray());
        task.task();
    }

    public void task7() {
        int[] num = input();
        arrayNumber.showArray(num[0],1, 100, 10);
        task = new Task7(arrayNumber.getArray());
        task.task();
    }

    public void task8() {
        int[] num = input();
        arrayNumber.showArray(num[0],1, 100, 10);
        task = new Task8(arrayNumber.getArray());
        task.task();
    }

    public void task9() {
        int[] num = input();
        arrayNumber.showArray(num[0],1, 100, 10);
        task = new Task9(arrayNumber.getArray());
        task.task();
    }

    public void task10() {
        int[] num = input();
        arrayNumber.showArray(num[0],1, 100, 10);
        task = new Task10(arrayNumber.getArray());
        task.task();
    }

    public void task11() {
        int[] num = input();
        arrayNumber.showArray(num[0],1, 100, 10);
        task = new Task11(arrayNumber.getArray());
        task.task();
    }
}