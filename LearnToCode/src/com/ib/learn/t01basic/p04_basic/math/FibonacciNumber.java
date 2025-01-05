package com.ib.learn.t01basic.p04_basic.math;

/**
 * Fibonacci Number is a series of numbers
 * in which each number is the sum of the two preceding ones, usually starting with 0 and 1.
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        int upto = 5;
        printFibonacci(upto);
    }

    public static void printFibonacci(int upto) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < upto; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
