package com.examples.patterns.factory;

import com.examples.patterns.factory.creator.ConcreteCreator1;
import com.examples.patterns.factory.creator.ConcreteCreator2;
import com.examples.patterns.factory.creator.ConcreteCreator3;

/**
 * Client class.
 * <p>
 * The client works with AbstractCreator and Product interfaces.
 * It doesn't know which concrete product or concrete creator it’s using.
 * <p>
 * This demonstrates loose coupling — the purpose of Factory Method.
 */
public class FactoryClient {

    private FactoryClient() {}

    public static void runFactoryMethod() {
        // Creator 1 → ConcreteProduct1
        AbstractCreator creator1 = new ConcreteCreator1();
        creator1.factoryMethod().runProduct();

        // Creator 2 → ConcreteProduct2
        AbstractCreator creator2 = new ConcreteCreator2();
        creator2.factoryMethod().runProduct();

        // Creator 3 → ConcreteProduct3
        AbstractCreator creator3 = new ConcreteCreator3();
        creator3.factoryMethod().runProduct();
    }
}
