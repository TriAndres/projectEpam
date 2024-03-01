package org.example.factory;

import org.example.factory.factorys.FactoryManageNumber;
import org.example.factory.factorys.FactoryTask;

public class FactoryMain {
    private final FactoryManageNumber factoryManageNumber;
    private final FactoryTask factoryTask;

    public FactoryMain() {
        factoryManageNumber = new FactoryManageNumber();
        factoryTask = new FactoryTask();
    }

    public final FactoryManageNumber factoryManageNumber() {
        return factoryManageNumber;
    }

    public final FactoryTask factoryTask() {
        return factoryTask;
    }
}
