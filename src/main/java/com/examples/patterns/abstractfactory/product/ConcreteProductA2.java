package com.examples.patterns.abstractfactory.product;

import com.examples.patterns.abstractfactory.ProductA;

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
