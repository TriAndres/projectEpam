package org.example.task;

import java.util.ArrayList;
import java.util.List;

/*
9. «Счастливые» числа.

Счастливым будет считаться такое число из шести цифр, в котором сумма
левых трех цифр равна сумме правых трех, например: 457961:4+5+5=9+6+1=16.
 */
public class Task9 extends Task {

    public Task9(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("\n9. «Счастливые» числа.");
        actionShow(10);
    }

    private void actionShow(int lineLength) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String[] line = Integer.toString(array[i]).split("");
            if (line.length == 6) {
                if (Integer.parseInt(line[0]) + Integer.parseInt(line[1]) + Integer.parseInt(line[2]) ==
                        Integer.parseInt(line[3]) + Integer.parseInt(line[4]) + Integer.parseInt(line[5])) {
                    count++;
                    count = show(array[i], count, lineLength);
                }
            }
        }
    }
}