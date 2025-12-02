package com.examples.patterns.creational.singleton;

/**
 * Thread-Safe Lazy Singleton using Bill Pugh Holder Pattern.
 *
 * - No synchronized keyword needed.
 * - No performance overhead.
 * - Thread-safe due to class loading guarantees.
 * - Best Singleton implementation in Java.
 */
public class SingletonThreadSafe {
    private String attribute;

    /**
     * Private constructor prevents external instantiation.
     */
    private SingletonThreadSafe() {

    }

    /**
     * Inner static class responsible for holding the Singleton instance.
     *
     * This class is loaded into memory ONLY when getInstance() is called.
     */
    private static final class INSTANCE_HOLDER {
        private static final SingletonThreadSafe instance = new SingletonThreadSafe();
    }

    /**
     * Returns the Singleton instance.
     * INSTANCE_HOLDER is loaded only on first call → Lazy + Thread-safe.
     */
    public static SingletonThreadSafe getInstance() {
        return INSTANCE_HOLDER.instance;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return this.attribute;
    }
}
