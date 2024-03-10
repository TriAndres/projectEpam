package org.example.task;

import org.example.model.Numbers;

import java.util.List;

/**
 *1. Найти самое короткое и самое длинное число. Вывести найденные числа
 * и их длину.
 */
public class Task1 extends Task{
    public Task1(List<Numbers> numberList) {
        super(numberList);
    }

    @Override
    public void task() {
        System.out.println("Ввод id-number:");
        show(a -> System.out.print(a.getId() + "-" + a.getNum() + "\t"));
        System.out.println("\n1. Найти самое короткое и самое длинное число. Вывести найденные числа\n" +
                "и их длину.");
        setNumLength();
        numberList.sort((a,b) -> a.getNum() - b.getNum());

        System.out.println("Самое короткое число: id=" + numberList.get(0).getId() +
                " " + numberList.get(0).getNum() + "-" + numberList.get(0).getNumLength());

        System.out.println("Самое длинное число: id=" + numberList.get(numberList.size()-1).getId() +
                " " + numberList.get(numberList.size()-1).getNum() + "-" + numberList.get(numberList.size()-1).getNumLength());
    }


}
