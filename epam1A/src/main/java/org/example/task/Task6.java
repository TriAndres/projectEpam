package org.example.task;

import org.example.console.ReadConsole;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
6. Вывести фамилию разработчика, дату и время получения задания, а также
    дату и время сдачи задания
 */
public class Task6 extends Task{
    private LocalDateTime time1 = LocalDateTime.now();
    private DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss ");
    private LocalDateTime time2;
    private DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd 10:00 ");

    @Override
    public void task() {
        System.out.println("6. Вывести фамилию разработчика, дату и время получения задания, а также\n" +
                "    дату и время сдачи задания");
        while (true) {
            System.out.println("\nВведите фамилию или 0 для выхода");
            String name = ReadConsole.getString();
            if (name.equals("0")) break;
            System.out.println(name + ", вы получили задание в " + time1.format(formatter1));
            System.out.println("Через сколько дней сделаете:");
            Integer day = ReadConsole.getInteger();
            time2 = time1.plusDays(day);
            System.out.println(name + ", сдача задания: " + time2.format(formatter2));
        }
        System.out.println("Вышли из цикла.");
    }
}