package com.examples.patterns.creational.builder.builder;

import com.examples.patterns.creational.builder.BuilderInterface;

/**
 * Concrete Builder for Product1.
 * Provides fluent methods to set only relevant fields.
 * Builder can be an inner class of the Product2
 */
public class ProductBuilder1 implements BuilderInterface<Product1> {

    private Product1 instance;

    public ProductBuilder1() {
        this.instance = new Product1();
    }

    /**
     * Resets the builder by creating a fresh product instance.
     */
    @Override
    public void reset() {
        instance = new Product1();
    }

    public ProductBuilder1 setAttribute2(String attribute2) {
        instance.attribute2 =  attribute2;
        return this;
    }

    public ProductBuilder1 setAttribute4(String attribute4) {
        instance.attribute4 =  attribute4;
        return this;
    }

    public ProductBuilder1 setAttribute6(String attribute6) {
        instance.attribute6 =  attribute6;
        return this;
    }

    /**
     * Returns the fully built Product1 instance.
     */
    @Override
    public Product1 build() {
        return instance;
    }

}
