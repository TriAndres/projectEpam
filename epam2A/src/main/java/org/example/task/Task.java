package org.example.task;

import org.example.model.Numbers;

import java.util.List;

public abstract class Task {
    protected List<Numbers> numberList;
    public Task(List<Numbers> numberList) {
        this.numberList = numberList;
    }
    public abstract void task();
}
