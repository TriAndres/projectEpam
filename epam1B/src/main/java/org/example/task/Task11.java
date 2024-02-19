package org.example.task;
/*
11. Элементы, которые равны полусумме соседних элементов.
 */
public class Task11 extends Task{

    public Task11(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("\n11. Элементы, которые равны полусумме соседних элементов.");
        actionShow(10);
    }

    private void actionShow(int lineLength) {
        int count = 0;
        for (int i = 1; i < array.length -1; i++) {
            count++;
            if (array[i] == (array[i - 1] + array[i + 1]) / 2) {
                count++;
                count = show(array[i], count, lineLength);
            }
        }
    }
}