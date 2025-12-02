package com.examples.patterns.creational.builder.builder;

/**
 * Concrete product with only selected attributes.
 * This class has package-private fields to allow the builder
 * (in the same package) to access and set them directly.
 */
public class Product1 {
    String attribute2;
    String attribute4;
    String attribute6;

    @Override
    public String toString() {
        return "Product1{" +
                "attribute2='" + attribute2 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", attribute6='" + attribute6 + '\'' +
                '}';
    }
}
