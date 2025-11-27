package com.examples.patterns.abstractfactory.product;

import com.examples.patterns.abstractfactory.ProductB;

/**
 * Concrete Product B1
 * Created by ConcreteCreator1
 */
public class ConcreteProductB1 implements ProductB {
    @Override
    public void runProductB() {
        System.out.println("Executing Product B1");
    }
}
