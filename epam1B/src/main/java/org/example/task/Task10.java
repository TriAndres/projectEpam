package org.example.task;

import java.util.Arrays;

/*
10. Числа-палиндромы, значения которых в прямом и обратном порядке совпа-
дают.
 */
public class Task10 extends Task{

    public Task10(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("\n10. Числа-палиндромы, значения которых в прямом и обратном порядке совпа-\n" +
                "дают.");
        actionShow(10);
    }

    private void actionShow(int lineLength) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String[] line = Integer.toString(array[i]).split("");
            if (line.length > 1) {
                String string = "";
                for (int j = line.length; j > 0; j--) {
                    string += line[j - 1];
                }
                if (Integer.toString(array[i]).equals(string)) {
                    count++;
                    count = show(array[i], count, lineLength);
                }
            }
        }
    }
}