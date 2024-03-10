package org.example.task;

import org.example.model.Numbers;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

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
        System.out.println("Ввод id-number:");
        show(a -> System.out.print(a.getId() + "-" + a.getNum() + "\t"));

        setNumLength();

        System.out.println("\n3. Вывести на консоль те числа, длина которых меньше (больше) средней,\n" +
                "а также длину.");

        System.out.println("Числа, длина которых меньше средней id-number-length: ");
        showNum((a,b) -> a < b,
                (c) -> System.out.print(c.getId() + "-" + c.getNum() + "-" + c.getNumLength() + "\t"));

        System.out.println("\nЧисла, длина которых больше средней id-number-length: ");
        showNum((a,b) -> a > b,
                (c) -> System.out.print(c.getId() + "-" + c.getNum() + "-" + c.getNumLength() + "\t"));
    }

    public void showNum(BiPredicate<Integer, Integer> deprecated, Consumer<Numbers> consumer) {
        int lengthLine = 10;
        int count = 0;
        int sum = 0;
        for (Numbers numbers1 : numberList) {
            sum += numbers1.getNum();
        }
        int avg = sum / numberList.size();
        System.out.println("среднее: " + avg);
        for (Numbers numbers : numberList) {
            if (deprecated.test(numbers.getNum(), avg)) {
                count++;
                consumer.accept(numbers);
                if (lengthLine == count) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
