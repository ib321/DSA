package com.ib.learn.t01basic.p05_ArrayJava;

public class FindAvgnCountDistinct {
    public static void main(String[] args) {
        countDistinctElements(args);
        findAverage(args);
    }
    public static void countDistinctElements(String[] args) {
        int[] numbers = {10, 20, 20, 30, 40, 50, 50};
        java.util.HashSet<Integer> distinctElements = new java.util.HashSet<>();

        for (int num : numbers) {
            distinctElements.add(num);
        }

        System.out.println("Number of distinct elements: " + distinctElements.size());
    }

    public static void findAverage(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        double sum = 0;

        for (int num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;
        System.out.println("Average: " + average);
    }
}
