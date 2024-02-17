package org.example.task;
/*
5. Все трехзначные числа, в десятичной записи которых нет одинаковых
цифр.
 */
public class Task5 extends Task{

    public Task5(int[] array) {
        super(array);
    }

    @Override
    public void task() {
        System.out.println("\n5. Все трехзначные числа, в десятичной записи которых нет одинаковых\n" +
                "цифр.");
        showAction(10);
    }

    private void showAction(int lineLength) {
        int count = 0;
        for (int i : array) {
            String[] line = Integer.toString(i).split("");
            if (!line[0].equals(line[1]) && !line[1].equals(line[2]) && !line[2].equals(line[0])) {
                count++;
                System.out.print(i + "\t");
                if (count == lineLength) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}