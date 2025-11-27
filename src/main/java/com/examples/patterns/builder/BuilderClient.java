package com.examples.patterns.builder;

import com.examples.patterns.builder.builder.ProductBuilder1;
import com.examples.patterns.builder.builder.ProductBuilder2;
import com.examples.patterns.builder.builder.Product1;
import com.examples.patterns.builder.builder.Product2;

public class BuilderClient {

    private BuilderClient() {}

    public static void runBuilderMethod() {
        // Build Product1 using its builder
        ProductBuilder1 builder1 = new ProductBuilder1();

        Product1 product1 = builder1
                .setAttribute2("attribute2")
                .setAttribute4("attribute4")
                .setAttribute6("attribute6")
                .build();

        System.out.println(product1.toString());

        // Build Product2 using its builder
        ProductBuilder2 builder2 = new ProductBuilder2();

        Product2 product2 = builder2
                .setAttribute1("attribute1")
                .setAttribute3("attribute3")
                .setAttribute5("attribute5")
                .build();

        System.out.println(product2.toString());
    }
}
