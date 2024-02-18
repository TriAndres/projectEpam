package org.example.task;

import java.util.ArrayList;
import java.util.List;

/*
9. «Счастливые» числа.

Счастливым будет считаться такое число из шести цифр, в котором сумма
левых трех цифр равна сумме правых трех, например: 457961:4+5+5=9+6+1=16.
 */
public class Task9 extends Task{

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
        for (int i : array) {
            String[] line = Integer.toString(i).split("");
            if (line.length == 6) {
                if (Integer.parseInt(line[0]) + Integer.parseInt(line[1]) + Integer.parseInt(line[2]) ==
                        Integer.parseInt(line[3]) + Integer.parseInt(line[4]) + Integer.parseInt(line[5])) {
                    System.out.print(i + "\t");
                    if (count == lineLength) {
                        System.out.println();
                        count = 0;
                    }

                }
            }
        }
    }

    private static void findHappyNumbers(Integer[] sourceNumbers) {
        String number;
        List<Integer> result = new ArrayList<Integer>();
        for (Integer sourceNumber : sourceNumbers) {
            number = sourceNumber.toString();
            if (number.length() == 4
                    && number.charAt(0) + number.charAt(1) == number.charAt(2)
                    + number.charAt(3)) {
                result.add(sourceNumber);
            }
        }
        System.out.println("“Счастливые” числа (Сумма 1-ой пары чисел "
                + "= Сумме 2-ой пары): " + result);
    }
}