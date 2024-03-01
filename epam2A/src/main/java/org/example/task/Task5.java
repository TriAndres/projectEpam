package org.example.task;

import org.example.model.Numbers;

import java.util.List;

/**
 5. Найти количество чисел, содержащих только четные цифры, а среди них —
 количество чисел с равным числом четных и нечетных цифр.
 */
public class Task5 extends Task{
    public Task5(List<Numbers> numberList) {
        super(numberList);

    }

    @Override
    public void task() {
        System.out.println("\n5. Найти количество чисел, содержащих только четные цифры, а среди них —\n" +
                "количество чисел с равным числом четных и нечетных цифр.");
    }
}
