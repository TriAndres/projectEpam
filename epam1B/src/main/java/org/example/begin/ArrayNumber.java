package org.example.begin;

import java.util.Random;
import java.util.function.Predicate;

public class ArrayNumber {
    private int[] array;

    public int[] getArray() {
        return array;
    }

    private void init(int size) {
        array = new int[size];
    }

    private void setNumRandom(int min,int max) {
        for (int i = 0; i < array.length; i++) {
            int num = 0;
            do {
                num = new Random().nextInt(max);
            } while (num < min || num > max);
            array[i] = num;
        }
    }

    private void show(int lineLength) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            System.out.print(array[i] + "\t");
            if (count == lineLength) {
                System.out.println();
                count = 0;
            }
        }
    }

    public void showArray(int size, int min, int max, int lineLength) {
        init(size);
        setNumRandom(min, max);
        show(lineLength);
    }
}