package com.examples.patterns.creational.abstractfactory.product;

import com.examples.patterns.creational.abstractfactory.ProductA;

/**
 * Concrete Product A2
 * Created by ConcreteCreator2
 */
public class ConcreteProductA2 implements ProductA {
    @Override
    public void runProductA() {
        System.out.println("Executing Product A2");
    }
}
