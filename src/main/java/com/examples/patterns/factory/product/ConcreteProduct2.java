package com.examples.patterns.factory.product;

import com.examples.patterns.factory.Product;

/**
 * Returned by ConcreteCreator2.
 */
public class ConcreteProduct2 implements Product {
    @Override
    public void runProduct() {
        System.out.println("Executing Product 2");
    }
}
