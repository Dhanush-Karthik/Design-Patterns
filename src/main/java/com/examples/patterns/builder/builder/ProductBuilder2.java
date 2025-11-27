package com.examples.patterns.builder.builder;

import com.examples.patterns.builder.BuilderInterface;

/**
 * Concrete Builder for Product2.
 * Sets only attributes that belong to Product2.
 * Builder can be an inner class of the Product2
 */
public class ProductBuilder2 implements BuilderInterface<Product2> {

    private Product2 instance;

    public ProductBuilder2() {
        this.instance = new Product2();
    }

    @Override
    public void reset() {
        this.instance = new Product2();
    }

    public ProductBuilder2 setAttribute1(String attribute1) {
        instance.attribute1 = attribute1;
        return this;
    }

    public ProductBuilder2 setAttribute3(String attribute3) {
        instance.attribute3 = attribute3;
        return this;
    }

    public ProductBuilder2 setAttribute5(String attribute5) {
        instance.attribute5 = attribute5;
        return this;
    }

    @Override
    public Product2 build() {
        return instance;
    }
}
