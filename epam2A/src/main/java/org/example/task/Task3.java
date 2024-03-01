package org.example.task;

import org.example.model.Numbers;

import java.util.List;

/*
 3. Вывести на консоль те числа, длина которых меньше (больше) средней,
 а также длину.
 */
public class Task3 extends Task{
    public Task3(List<Numbers> numberList) {
        super(numberList);

    }

    @Override
    public void task() {
        System.out.println("\n3. Вывести на консоль те числа, длина которых меньше (больше) средней,\n" +
                "а также длину.");
    }
}
