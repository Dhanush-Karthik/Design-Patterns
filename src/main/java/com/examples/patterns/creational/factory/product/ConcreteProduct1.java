package com.examples.patterns.creational.factory.product;

import com.examples.patterns.creational.factory.Product;

/**
 * Concrete implementation of Product.
 * Returned by ConcreteCreator1.
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void runProduct() {
        System.out.println("Executing Product 1");
    }
}
