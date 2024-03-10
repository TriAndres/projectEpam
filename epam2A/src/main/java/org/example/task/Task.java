package org.example.task;

import org.example.model.Numbers;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public abstract class Task {
    protected List<Numbers> numberList;
    public Task(List<Numbers> numberList) {
        this.numberList = numberList;
    }
    public abstract void task();
    public void setNumLength() {
        for (Numbers numbers : numberList) {
            int numLength = Integer.toString(numbers.getNum()).length();
            numbers.setNumLength(numLength);
        }
    }

    public void show(Consumer<Numbers> consumer) {
        int lengthLine = 10;
        int count = 0;
        for (Numbers numbers : numberList) {
            count++;
            consumer.accept(numbers);
            if (lengthLine == count) {
                System.out.println();
                count = 0;
            }
        }
    }
}
