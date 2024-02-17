package org.example.task;
/*
6. Простые числа.
 */
public class Task6 extends Task{

    public Task6(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("\n6. Простые числа.");
        action(10);
    }
    private void action(int lineLength) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                boolean isFlag = true;
                for (int j = 2; j <= Math.floor(Math.sqrt(array[i])); j++) {
                    if (array[i] % j == 0) {
                        isFlag = false;
                        break;
                    }
                }
                if (isFlag) {
                    count++;
                    System.out.print(array[i] + "\t");
                    if (count == lineLength) {
                        System.out.println();
                        count = 0;
                    }
                }
            }
        }
    }
}