package com.examples.patterns.creational.builder.builder;

/**
 * Another concrete product built using ProductBuilder2.
 * Only attributes relevant to this product are included.
 */
public class Product2 {
    String attribute1;
    String attribute3;
    String attribute5;

    @Override
    public String toString() {
        return "Product2{" +
                "attribute1='" + attribute1 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute5='" + attribute5 + '\'' +
                '}';
    }
}
