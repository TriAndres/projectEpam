package org.example.task;

import java.util.function.Predicate;

/*
1. Четные и нечетные числа.
 */
public class Task1 extends Task{

    public Task1(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("\n1. Четные и нечетные числа.");
        System.out.println("Чётные:");
        showAction(10, i ->  i % 2 == 0);
        System.out.println("\nНечётные:");
        showAction(10,i ->  i % 2 != 0);
    }
    private void showAction(int lineLength,Predicate<Integer> predicate) {
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