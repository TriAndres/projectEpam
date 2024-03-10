package org.example.factory;

import org.example.factory.interfaces.FactoryManageNumbers;
import org.example.factory.interfaces.FactoryTasks;
import org.example.manage.ManageNumber;
import org.example.task.Task;
import org.example.task.Task1;

public abstract class Factory implements FactoryManageNumbers, FactoryTasks {
    protected Task task;
    protected ManageNumber manageNumber;

    public Factory(ManageNumber manageNumber) {
        this.manageNumber = manageNumber;
    }
}