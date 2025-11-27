package com.examples.patterns.singleton;

/**
 * Demonstrates Singleton behavior.
 */
public class SingletonClient {

    private SingletonClient() {}

    public static void runSingleTonMethod() {
        // Non-thread-safe Singleton
        Singleton singletonObject1 = Singleton.getInstance();
        singletonObject1.setAttribute("Attribute from singletonObject1");
        System.out.println(singletonObject1.getAttribute());

        Singleton singletonObject2 = Singleton.getInstance();
        // Prints the same attribute → both references point to same instance
        System.out.println(singletonObject2.getAttribute());

        // Thread-safe Singleton
        SingletonThreadSafe singletonThreadSafe1 = SingletonThreadSafe.getInstance();
        singletonThreadSafe1.setAttribute("Attribute from singletonThreadSafe1");
        System.out.println(singletonThreadSafe1.getAttribute());

        SingletonThreadSafe singletonThreadSafe2 = SingletonThreadSafe.getInstance();
        System.out.println(singletonThreadSafe2.getAttribute());
    }
}
