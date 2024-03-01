package org.example.factory.factorys;

import org.example.factory.interfaces.FactoryManageNumbers;
import org.example.factory.interfaces.FactoryTasks;
import org.example.manage.ManageNumber;
import org.example.task.Task;
import org.example.task.Task1;

public abstract class Factory implements FactoryManageNumbers, FactoryTasks {
    protected ManageNumber manageNumber;
    protected Task task;

    public Factory() {
        manageNumber = new ManageNumber();
    }
}