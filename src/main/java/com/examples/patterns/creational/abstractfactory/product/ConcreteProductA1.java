package com.examples.patterns.creational.abstractfactory.product;

import com.examples.patterns.creational.abstractfactory.ProductA;

/**
 * Concrete Product A1
 * Created by ConcreteCreator1
 */
public class ConcreteProductA1 implements ProductA {
    @Override
    public void runProductA() {
        System.out.println("Executing Product A1");
    }
}
