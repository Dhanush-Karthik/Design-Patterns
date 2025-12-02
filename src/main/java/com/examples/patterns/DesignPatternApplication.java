package com.examples.patterns;

import com.examples.patterns.creational.abstractfactory.AbstractFactoryClient;
import com.examples.patterns.creational.builder.BuilderClient;
import com.examples.patterns.creational.factory.FactoryClient;
import com.examples.patterns.creational.singleton.SingletonClient;
import com.examples.patterns.structural.adapter.AdapterClient;

public class DesignPatternApplication {
    public static void main(String[] args) {
        //Creational patterns start

        // Demonstrates Factory pattern
//        FactoryClient.runFactoryMethod();
//
//        // Demonstrates Singleton pattern
//        SingletonClient.runSingleTonMethod();
//
//        // Demonstrates Abstract Factory pattern
//        AbstractFactoryClient.runAbstractFactoryMethod();
//
//        // Demonstrates Builder pattern
//        BuilderClient.runBuilderMethod();

        //Creational patterns end

        // Structural pattern start

        // Demonstrates adapter pattern
        AdapterClient.runAdapterMethod();

        // Structural pattern start
    }
}
