package org.example.task;

public abstract class Task {
    protected int[] array;

    public Task(int[] array) {
        this.array = array;
    }

    public abstract void task();

    public int show(int num, int count, int lineLength) {
        System.out.print(num + "\t");
        if (count == lineLength) {
            System.out.println();
            count = 0;
        }
        return count;
    }
}