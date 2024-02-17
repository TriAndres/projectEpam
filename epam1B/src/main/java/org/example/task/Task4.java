package org.example.task;

import java.util.function.Predicate;

/*
4. Числа, которые делятся на 5 и на 7.
 */
public class Task4 extends Task{

    public Task4(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("\n4. Числа, которые делятся на 5 и на 7.");
        showAction(10, i -> i % 5 == 0 && i % 7 == 0);
    }

    public void showAction(int lineLength, Predicate<Integer> predicate) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (predicate.test(array[i])) {
                count++;
                System.out.print(array[i] + "\t");
                if (count == lineLength) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}