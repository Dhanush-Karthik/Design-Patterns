package com.examples.patterns.structural.adapter;

/**
 * Client code that depends only on the Adapter interface
 * instead of depending directly on LegacyService.
 */
public class AdapterClient {

    public static void runAdapterMethod() {
        // Client uses the Adapter interface → loose coupling
        Adapter adapter = new ConcreteAdapter();
        adapter.adapterMethod();
    }
}
