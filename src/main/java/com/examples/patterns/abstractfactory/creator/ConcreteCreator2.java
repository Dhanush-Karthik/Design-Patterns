package com.examples.patterns.abstractfactory.creator;

import com.examples.patterns.abstractfactory.AbstractCreator;
import com.examples.patterns.abstractfactory.ProductA;
import com.examples.patterns.abstractfactory.ProductB;
import com.examples.patterns.abstractfactory.product.ConcreteProductA2;
import com.examples.patterns.abstractfactory.product.ConcreteProductB2;

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
