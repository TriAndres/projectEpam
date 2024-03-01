package org.example.task;

import org.example.model.Numbers;

import java.util.List;

/**
 *1. Найти самое короткое и самое длинное число. Вывести найденные числа
 * и их длину.
 */
public class Task9 extends Task{
    public Task9(List<Numbers> numberList) {
        super(numberList);

    }

    @Override
    public void task() {
        System.out.println("\n1. Найти самое короткое и самое длинное число. Вывести найденные числа\n" +
                "и их длину.");
    }
}
