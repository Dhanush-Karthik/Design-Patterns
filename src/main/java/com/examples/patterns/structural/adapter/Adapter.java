package com.examples.patterns.structural.adapter;

/**
 * Target interface expected by the client.
 * The adapter will implement this interface to make LegacyService compatible.
 */
public interface Adapter {

    /**
     * Method the client expects to call.
     * The Adapter converts this call into something LegacyService understands.
     */
    void adapterMethod();
}
