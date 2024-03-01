package org.example.task;

import org.example.model.Numbers;

import java.util.List;

/*
 2. Упорядочить и вывести числа в порядке возрастания (убывания) значений
 их длины.
 */
public class Task2 extends Task{
    public Task2(List<Numbers> numberList) {
        super(numberList);

    }

    @Override
    public void task() {
        System.out.println("\n2. Упорядочить и вывести числа в порядке возрастания (убывания) значений\n" +
                "их длины.");
    }
}
