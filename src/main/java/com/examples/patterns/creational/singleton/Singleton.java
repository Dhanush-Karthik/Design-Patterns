package com.examples.patterns.creational.singleton;

/**
 * Basic Lazy Singleton (NOT Thread Safe)
 * - Instance is created only when first requested.
 * - Works only in single-threaded applications.
 */
public class Singleton {
    // Holds the single instance of this class.
    // Starts as null to enable lazy initialization.
    private static Singleton instance;

    private String attribute;

    /**
     * Private constructor prevents object creation from outside.
     */
    private Singleton() {

    }

    /**
     * Returns the single instance (lazy initialization).
     * NOTE: This is NOT THREAD-SAFE.
     */
    public static Singleton getInstance() {
        // First time call → instance is null → create object
        if(instance == null) {
            instance = new Singleton();
            return instance;
        }

        // All future calls return the cached instance
        return instance;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return this.attribute;
    }
}
