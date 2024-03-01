package org.example.task;

import org.example.model.Numbers;

import java.util.List;

/*
 4. Найти число, в котором число различных цифр минимально. Если таких
 чисел несколько, найти первое из них.
 */
public class Task4 extends Task{
    public Task4(List<Numbers> numberList) {
        super(numberList);

    }

    @Override
    public void task() {
        System.out.println("\n4. Найти число, в котором число различных цифр минимально. Если таких\n" +
                "чисел несколько, найти первое из них.");
    }
}
