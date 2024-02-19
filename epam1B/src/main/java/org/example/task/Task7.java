package org.example.task;

import org.example.interfaces.Predicate2;

/*
7. Отсортированные числа в порядке возрастания и убывания.
 */
public class Task7 extends Task{

    public Task7(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("\n7. Отсортированные числа в порядке возрастания и убывания.");
        System.out.println("По возрастанию:");
        actionSort((a,b) -> a > b);
        actionShow(10);
        System.out.println("\nПо убыванию:");
        actionSort((a,b) -> a < b);
        actionShow(10);
    }

    private void actionSort(Predicate2 predicate) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (predicate.test(array[i], array[j])) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private void actionShow(int lineLength) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            count = show(array[i], count, lineLength);
        }
    }
}