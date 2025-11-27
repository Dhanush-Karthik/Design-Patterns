package com.examples.patterns.abstractfactory;

import com.examples.patterns.abstractfactory.creator.ConcreteCreator1;
import com.examples.patterns.abstractfactory.creator.ConcreteCreator2;

/**
 * Client:
 * --------
 * Works only with abstract factory (AbstractCreator)
 * and abstract product interfaces (ProductA, ProductB).
 *
 * This ensures the client is completely decoupled from
 * concrete classes.
 */
public class AbstractFactoryClient {

    private AbstractFactoryClient() {}

    public static void runAbstractFactoryMethod() {

        // Factory 1 → Creates ProductA1 + ProductB1
        AbstractCreator creator1 = new ConcreteCreator1();
        ProductA pa1 = creator1.factoryMethodForProductA();
        pa1.runProductA();

        ProductB pb1 = creator1.factoryMethodForProductB();
        pb1.runProductB();

        // Factory 2 → Creates ProductA2 + ProductB2
        AbstractCreator creator2 = new ConcreteCreator2();
        ProductA pa2 = creator2.factoryMethodForProductA();
        pa2.runProductA();

        ProductB pb2 = creator2.factoryMethodForProductB();
        pb2.runProductB();
    }
}
