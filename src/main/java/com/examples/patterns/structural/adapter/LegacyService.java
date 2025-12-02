package com.examples.patterns.structural.adapter;

/**
 * Adaptee class.
 * This class has an incompatible interface that the client cannot use directly.
 */
public class LegacyService {

    /**
     * Some existing method that does not match the client's expectations.
     */
    public void serviceMethod() {
        System.out.println("Executing service method");
    }
}
