package com.examples.patterns;

import com.examples.patterns.abstractfactory.AbstractFactoryClient;
import com.examples.patterns.builder.BuilderClient;
import com.examples.patterns.factory.FactoryClient;
import com.examples.patterns.singleton.SingletonClient;

public class DesignPatternApplication {
    public static void main(String[] args) {
        // Demonstrates Factory pattern
//        FactoryClient.runFactoryMethod();

        // Demonstrates Singleton pattern
//        SingletonClient.runSingleTonMethod();

        // Demonstrates Abstract Factory pattern
//        AbstractFactoryClient.runAbstractFactoryMethod();

        // Demonstrates Builder pattern
        BuilderClient.runBuilderMethod();
    }
}
