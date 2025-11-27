package com.examples.patterns.abstractfactory.creator;

import com.examples.patterns.abstractfactory.AbstractCreator;
import com.examples.patterns.abstractfactory.ProductA;
import com.examples.patterns.abstractfactory.ProductB;
import com.examples.patterns.abstractfactory.product.ConcreteProductA1;
import com.examples.patterns.abstractfactory.product.ConcreteProductB1;

/**
 * Concrete Factory 1:
 * Produces the "Family 1" of products.
 *
 * ProductA → ConcreteProductA1
 * ProductB → ConcreteProductB1
 *
 * Ensures compatibility among produced products.
 */
public class ConcreteCreator1 extends AbstractCreator {
    @Override
    protected ProductA factoryMethodForProductA() {
        return new ConcreteProductA1();
    }

    @Override
    protected ProductB factoryMethodForProductB() {
        return new ConcreteProductB1();
    }
}
