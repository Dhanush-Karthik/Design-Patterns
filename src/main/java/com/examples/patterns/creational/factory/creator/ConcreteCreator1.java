package com.examples.patterns.creational.factory.creator;

import com.examples.patterns.creational.factory.AbstractCreator;
import com.examples.patterns.creational.factory.Product;
import com.examples.patterns.creational.factory.product.ConcreteProduct1;

/**
 * Concrete Creator 1:
 * Decides to return ConcreteProduct1.
 */
public class ConcreteCreator1 extends AbstractCreator {

    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct1();
    }

}
