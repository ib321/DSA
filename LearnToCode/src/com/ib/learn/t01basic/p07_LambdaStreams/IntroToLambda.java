package com.ib.learn.t01basic.p07_LambdaStreams;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * This class demonstrates Lambda Expressions and Method References in Java.
 * - Introduction to Lambda Expressions and ways to use them
 * - Syntax of Lambda Expressions and much more
 */
public class IntroToLambda {

    public static void main(String[] args) {
        // Introduction to Lambda Expressions
        introToLambdasExpression();

        // Lambda Expression Syntax and Examples
        lambdaExpressionExamples();

    }

    public static void introToLambdasExpression() {
        /*
         * Lambda Expressions were introduced in Java 8.
         * They enable you to treat functionality as a method argument or pass a block of code around.
         * Syntax:  (parameters) -> expression
         *          (parameters) -> { statements }
         * They are commonly used to implement simple instances of functional interfaces.
         *
         * Example of a Lambda Expression:
         * Runnable runnable = () -> System.out.println("Hello, Lambda!");
         */

        // Runnable Without Using Lambda
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, without lambda!");
            }
        };
        runnable1.run();

        // Runnable using Lambda
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();

        // Comparator Without Using Lambda
        Comparator<String> comparator1 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        int result1 = comparator1.compare("apple", "banana");
        System.out.println("Comparator result: " + result1);

        // Comparator using Lambda
        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
        int result = comparator.compare("apple", "banana");
        System.out.println("Comparator result: " + result);
    }

    /**
     * Lambda Expression Syntax and Examples
     */
    public static void lambdaExpressionExamples() {
        /*
         * Syntax of Lambda Expressions:
         * 1. No parameters: () -> expression
         * 2. One parameter: (param) -> expression
         * 3. Multiple parameters: (param1, param2) -> expression
         * 4. Multiple statements: (param) -> { statement1; statement2; }
         *
         * Lambda expressions can be used to create instances of functional interfaces.
         */

        // Example: No parameters
        Runnable noParam = () -> System.out.println("No parameters");
        noParam.run();

        // Example: One parameter
        Consumer<String> oneParam = (message) -> System.out.println("Message: " + message);
        oneParam.accept("Hello, World!");

        // Example: Multiple parameters
        BiConsumer<Integer, Integer> twoParams = (a, b) -> System.out.println("Sum: " + (a + b));
        twoParams.accept(5, 10);

        // Example: Multiple statements
        BiConsumer<Integer, Integer> multiStatement = (a, b) -> {
            int sum = a + b;
            int product = a * b;
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
        };
        multiStatement.accept(3, 4);
    }
}

