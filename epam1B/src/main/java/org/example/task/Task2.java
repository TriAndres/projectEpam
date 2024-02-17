package org.example.task;
/*
2. Наибольшее и наименьшее число.
 */
public class Task2 extends Task{

    public Task2(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("\n2. Наибольшее и наименьшее число.");
        System.out.println("Наибольшее:\n" + max());
        System.out.println("Наименьшее:\n" + min());
    }

    private int max() {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private int min() {
        int min = 100000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}