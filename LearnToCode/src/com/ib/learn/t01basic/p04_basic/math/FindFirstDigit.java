package com.ib.learn.t01basic.p04_basic.math;

public class FindFirstDigit {
    // Function to find the first digit of a number
    public static int findFirstDigit(int number) {
        number = Math.abs(number); // Ensure the number is positive
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }

    public static void main(String[] args) {
        int firstDigit = findFirstDigit(12345); // Example: first digit of 12345
        System.out.println("The first digit of 12345 is: " + firstDigit);
    }
}

