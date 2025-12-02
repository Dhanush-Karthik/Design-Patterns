package com.examples.patterns.creational.factory.product;

import com.examples.patterns.creational.factory.Product;

/**
 * Returned by ConcreteCreator2.
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void runProduct() {
        System.out.println("Executing Product 2");
    }
}
