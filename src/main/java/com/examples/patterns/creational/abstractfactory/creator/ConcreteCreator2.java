package com.examples.patterns.creational.abstractfactory.creator;

import com.examples.patterns.creational.abstractfactory.AbstractCreator;
import com.examples.patterns.creational.abstractfactory.ProductA;
import com.examples.patterns.creational.abstractfactory.ProductB;
import com.examples.patterns.creational.abstractfactory.product.ConcreteProductA2;
import com.examples.patterns.creational.abstractfactory.product.ConcreteProductB2;

/**
 * Concrete Factory 2:
 * Produces the "Family 2" of products.
 *
 * ProductA → ConcreteProductA2
 * ProductB → ConcreteProductB2
 */
public class ConcreteCreator2 extends AbstractCreator {
    @Override
    protected ProductA factoryMethodForProductA() {
        return new ConcreteProductA2();
    }

    @Override
    protected ProductB factoryMethodForProductB() {
        return new ConcreteProductB2();
    }
}
