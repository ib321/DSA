package com.ib.learn.t01basic.p07_LambdaStreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This class demonstrates Streams in Java.
 * - Introduction to Streams in Java
 * - Various Applications of Streams
 * - The Stream hierarchy and methods and much more
 */
public class StreamDemo {

    public static void main(String[] args) {
        // Introduction to Streams
        introductionToStreams();

        // Applications of Streams
        streamApplications();

        // Stream Hierarchy and Methods
        streamHierarchyAndMethods();
    }

    public static void introductionToStreams() {
        /*
         * Streams were introduced in Java 8 as a way to process sequences of elements in a functional style.
         * Streams support various operations that can be pipelined to produce the desired result.
         * Streams do not store data;
         * they process data that can come from various sources such as collections, arrays, or I/O channels.
         */

        // Creating a Stream from a List
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> numberStream = numbers.stream();
        numberStream.forEach(System.out::println);

        // Streams can also be created from arrays
        String[] names = {"Alice", "Bob", "Charlie"};
        Stream<String> nameStream = Arrays.stream(names);
        nameStream.forEach(System.out::println);
    }

    public static void streamApplications() {
        /*
         * Streams can be used for various operations such as filtering, mapping, reducing, and more.
         * Common operations include filter, map, reduce, collect, and forEach.
         */

        // Example: Filtering and Mapping
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Filtered and Mapped Names: " + filteredNames);

        // Example: Reducing
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of Numbers: " + sum);

        // Example: Collecting to a List
        List<String> collectedNames = names.stream().collect(Collectors.toList());
        System.out.println("Collected Names: " + collectedNames);

        // Example: Generating a range of numbers and finding the maximum
        OptionalInt max = IntStream.range(1, 10).max();
        max.ifPresent(value -> System.out.println("Max Value: " + value));
    }

    /**
     * The Stream Hierarchy and Methods
     */
    public static void streamHierarchyAndMethods() {
        /*
         * The Stream hierarchy includes interfaces such as Stream, IntStream, LongStream, DoubleStream.
         * Common methods include map, filter, flatMap, reduce, collect, forEach, etc.
         *
         * Example: Demonstrating various Stream methods
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filtering even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Mapping to square of each number
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // Flattening nested lists
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened List: " + flattenedList);

        // Reducing to the sum of all numbers
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of Numbers: " + sum);

        // Collecting to a Set
        Set<Integer> numberSet = numbers.stream().collect(Collectors.toSet());
        System.out.println("Collected Set: " + numberSet);

        // Using IntStream for primitive stream
        int[] intArray = {1, 2, 3, 4, 5};
        int sumOfArray = IntStream.of(intArray).sum();
        System.out.println("Sum of Array: " + sumOfArray);
    }
}

