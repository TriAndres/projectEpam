package org.example.menu;

import org.example.factory.FactoryManageNumber;
import org.example.factory.FactoryTask;
import org.example.manage.ManageNumber;

public abstract class Menu {
    protected FactoryManageNumber factoryManageNumber;
    protected FactoryTask factoryTask;

    public Menu(ManageNumber manageNumber) {
        factoryManageNumber = new FactoryManageNumber(manageNumber);
        factoryTask = new FactoryTask(manageNumber);
    }


}
