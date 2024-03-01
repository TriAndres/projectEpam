package org.example.task;

import org.example.model.Numbers;

import java.util.List;

/*
 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если
 таких чисел несколько, найти первое из них.
 */
public class Task6 extends Task{
    public Task6(List<Numbers> numberList) {
        super(numberList);

    }

    @Override
    public void task() {
        System.out.println("\n1. Найти самое короткое и самое длинное число. Вывести найденные числа\n" +
                "и их длину.");
    }
}
