package com.examples.patterns.creational.factory.creator;

import com.examples.patterns.creational.factory.AbstractCreator;
import com.examples.patterns.creational.factory.Product;
import com.examples.patterns.creational.factory.product.ConcreteProduct2;

/**
 * Concrete Creator 2:
 * Returns ConcreteProduct2.
 */
public class ConcreteCreator2 extends AbstractCreator {

    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
