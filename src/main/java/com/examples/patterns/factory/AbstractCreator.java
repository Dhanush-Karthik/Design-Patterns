package com.examples.patterns.factory;

/**
 * Abstract Creator:
 * ------------------
 * - Declares the factory method (factoryMethod()).
 * - Contains core business logic that works with Product interface.
 * - Subclasses override factoryMethod() to decide which product is created.
 */
public abstract class AbstractCreator {

    /**
     * Factory Method:
     * Must be implemented by subclasses to create concrete products.
     */
    protected abstract Product factoryMethod();

    /**
     * Example common business logic:
     * Creator methods use products via the Product interface,
     * without knowing which concrete class was created.
     */
    public void defaultMethod1() {
        // Creates a product using factory method
        factoryMethod();
    }

    public void defaultMethod2() {
        factoryMethod();
    }
}
