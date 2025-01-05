package com.ib.learn.t01basic.p07_LambdaStreams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.*;

public class IntroToMethodReference {
    public static void main(String[] args) {
        // Introduction to Method References
        introductionToMethodReferences();

        // Examples of Method References
        methodReferenceExamples();
    }

    /**
     * Introduction to Method References
     */
    public static void introductionToMethodReferences() {
        /*
         * Method References provide a way to refer to methods without invoking them.
         * They are a shorthand notation of a lambda expression to call a method.
         * Syntax: ClassName::methodName or instance::methodName
         *
         * There are four kinds of method references:
         * 1. Reference to a static method: ClassName::staticMethodName
         * 2. Reference to an instance method of a particular object: instance::instanceMethodName
         * 3. Reference to an instance method of an arbitrary object of a particular type: ClassName::instanceMethodName
         * 4. Reference to a constructor: ClassName::new
         */

        // Example: Reference to a static method
        Function<String, Integer> staticMethodRef = Integer::parseInt;
        int number = staticMethodRef.apply("123");
        System.out.println("Parsed number: " + number);

        // Example: Reference to an instance method of a particular object
        String str = "hello";
        Supplier<String> instanceMethodRef1 = str::toUpperCase;
        System.out.println("Uppercase string: " + instanceMethodRef1.get());

        // Example: Reference to an instance method of an arbitrary object of a particular type
        Function<String, Integer> lengthMethodRef = String::length;
        int length = lengthMethodRef.apply("Lambda");
        System.out.println("String length: " + length);

        // Example: Reference to a constructor
        Supplier<List<String>> listConstructorRef = ArrayList::new;
        List<String> list = listConstructorRef.get();
        list.add("Method References");
        System.out.println("List: " + list);
    }

    /**
     * Examples of Method References
     */
    public static void methodReferenceExamples() {
        // Reference to a static method
        Consumer<String> staticMethodRef = IntroToMethodReference::printMessage;
        staticMethodRef.accept("Hello from static method reference!");

        // Reference to an instance method of a particular object
        IntroToMethodReference demo = new IntroToMethodReference();
        Supplier<String> instanceMethodRef = demo::instanceMethod;
        System.out.println("Message from instance method reference: " + instanceMethodRef.get());
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public String instanceMethod() {
        return "Instance method called";
    }
}

