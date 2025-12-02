package com.examples.patterns.creational.factory.creator;

import com.examples.patterns.creational.factory.AbstractCreator;
import com.examples.patterns.creational.factory.Product;
import com.examples.patterns.creational.factory.product.ConcreteProduct3;

/**
 * Concrete Creator 3:
 * Returns ConcreteProduct3.
 * Can be extended in the client without modifying the existing code
 * Satisfies Open-Close Principle
 */
public class ConcreteCreator3 extends AbstractCreator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct3();
    }
}
