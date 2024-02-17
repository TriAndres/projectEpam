package org.example.task;

import java.util.function.Predicate;

/*
3. Числа, которые делятся на 3 или на 9.
 */
public class Task3 extends Task{

    public Task3(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("\n3. Числа, которые делятся на 3 или на 9.");
        showAction(10, i -> i % 3 == 0);
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