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
        System.out.println("Ввод id-number:");
        show(a -> System.out.print(a.getId() + "-" + a.getNum() + "\t"));

        System.out.println("\n2. Упорядочить и вывести числа в порядке возрастания (убывания) значений\n" +
                "их длины.");
        setNumLength();

        numberList.sort((a,b) -> a.getNum() - b.getNum());
        System.out.println("Числа в порядке возрастания id-number-length: ");
        show(a -> System.out.print(a.getId() + "-" + a.getNum() + "-" + a.getNumLength() + "\t"));

        numberList.sort((a,b) -> b.getNum() - a.getNum());
        System.out.println("\nЧисла в порядке убывания id-number-length: ");
        show(a -> System.out.print(a.getId() + "-" + a.getNum() + "-" + a.getNumLength() + "\t"));
    }
}
