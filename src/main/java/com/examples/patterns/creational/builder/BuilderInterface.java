package com.examples.patterns.creational.builder;

/**
 * Generic builder interface that allows building
 * different types of products.
 *
 * @param <T> Type of product returned by build()
 */
public interface BuilderInterface<T> {
    /**
     * Reset the builder to its initial state.
     */
    void reset();

    /**
     * Returns the fully built product.
     */
    T build();
}
