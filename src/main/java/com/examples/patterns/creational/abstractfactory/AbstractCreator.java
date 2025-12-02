package com.examples.patterns.creational.abstractfactory;

/**
 * Abstract Factory:
 * -----------------
 * Declares methods to create families of related products.
 *
 * Here:
 *  - factoryMethodForProductA() creates ProductA
 *  - factoryMethodForProductB() creates ProductB
 *
 * Concrete factories (ConcreteCreator1, ConcreteCreator2)
 * will implement these to produce consistent product families.
 */
public abstract class AbstractCreator {

    // Factory method for creating Product A
    protected abstract ProductA factoryMethodForProductA();

    // Factory method for creating Product B
    protected abstract ProductB factoryMethodForProductB();

    // Optional business methods that use products
    public void defaultMethod1() {
        // Could use ProductA or ProductB here
    }

    public void defaultMethod2() {
        // Could use ProductA or ProductB here
    }
}
