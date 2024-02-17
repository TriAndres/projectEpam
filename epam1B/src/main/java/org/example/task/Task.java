package org.example.task;

public abstract class Task {
    protected int[] array;
    public Task(int[] array) {
        this.array = array;
    }

    public Task() {
    }

    public abstract void task();
}