package org.example.task;
/*
8. Числа в порядке убывания частоты встречаемости чисел.
 */
public class Task8 extends Task{

    public Task8(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("8. Числа в порядке убывания частоты встречаемости чисел.");
        actionSort();
        actionShow(10);
    }

    private void actionSort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private void actionShow(int lineLength) {
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            a[i] = count;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isFlag = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isFlag = false;
                }
            }
            if (isFlag) {
                count++;
                System.out.print(array[i] + "-" + a[i] + "\t");
                if (count == lineLength) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}