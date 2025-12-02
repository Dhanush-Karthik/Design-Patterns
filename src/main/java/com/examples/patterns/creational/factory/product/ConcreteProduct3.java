package com.examples.patterns.creational.factory.product;

import com.examples.patterns.creational.factory.Product;

/**
 * Returned by ConcreteCreator3.
 * Can be extended in the client without modifying the existing code
 * Satisfies Open-Close Principle
 */
public class ConcreteProduct3 implements Product {
    @Override
    public void runProduct() {
        System.out.println("Executing Product 3");
    }
}
