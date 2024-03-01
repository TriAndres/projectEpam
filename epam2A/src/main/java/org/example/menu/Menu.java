package org.example.menu;

import org.example.factory.FactoryMain;

public abstract class Menu {
    protected FactoryMain factoryMain;

    public Menu() {
        factoryMain = new FactoryMain();
    }


}
