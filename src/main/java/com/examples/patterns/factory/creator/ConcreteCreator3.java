package com.examples.patterns.factory.creator;

import com.examples.patterns.factory.AbstractCreator;
import com.examples.patterns.factory.Product;
import com.examples.patterns.factory.product.ConcreteProduct3;

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
