package com.examples.patterns.structural.adapter;

/**
 * Concrete Adapter class.
 * Implements the target interface and internally uses LegacyService (the adaptee).
 */
public class ConcreteAdapter implements Adapter {

    // Adaptee – existing or incompatible service
    private final LegacyService legacyService;

    public ConcreteAdapter() {
        // Initialize the adaptee
        this.legacyService = new LegacyService();
    }

    /**
     * Converts the client's call into the format understood by LegacyService.
     */
    @Override
    public void adapterMethod() {
        System.out.println("Adapting serviceMethod() → adapterMethod()");

        // Delegate call to the adaptee
        legacyService.serviceMethod();
    }
}
