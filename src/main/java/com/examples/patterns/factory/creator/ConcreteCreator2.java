package com.examples.patterns.factory.creator;

import com.examples.patterns.factory.AbstractCreator;
import com.examples.patterns.factory.Product;
import com.examples.patterns.factory.product.ConcreteProduct2;

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
