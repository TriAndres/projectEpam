package org.example.factory;

import org.example.factory.interfaces.FactoryTasks;
import org.example.manage.ManageNumber;
import org.example.task.*;

public class FactoryTask extends Factory implements FactoryTasks {

    public FactoryTask(ManageNumber manageNumber) {
        super(manageNumber);
    }

    public void task1() {
        task = new Task1(manageNumber.getNumberList());
        task.task();
    }

    public void task2() {
        task = new Task2(manageNumber.getNumberList());
        task.task();
    }

    public void task3() {
        task = new Task3(manageNumber.getNumberList());
        task.task();
    }

    public void task4() {
        task = new Task4(manageNumber.getNumberList());
        task.task();
    }

    public void task5() {
        task = new Task5(manageNumber.getNumberList());
        task.task();
    }

    public void task6() {
        task = new Task6(manageNumber.getNumberList());
        task.task();
    }

    public void task7() {
        task = new Task7(manageNumber.getNumberList());
        task.task();
    }

    public void task8() {
        task = new Task8(manageNumber.getNumberList());
        task.task();
    }

    public void task9() {
        task = new Task9(manageNumber.getNumberList());
        task.task();
    }
}
