package com.examples.patterns.abstractfactory.product;

import com.examples.patterns.abstractfactory.ProductB;

/**
 * Concrete Product B2
 * Created by ConcreteCreator2
 */
public class ConcreteProductB2 implements ProductB {
    @Override
    public void runProductB() {
        System.out.println("Executing Product B2");
    }
}
