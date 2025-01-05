package com.ib.learn.t01basic.p001codebasic;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter How Many Natural Numbers Sum you want: ");
        System.out.println("Enter a positive integer: ");
        int n = scanner.nextInt();
        // Sum of Natural numbers
        sumOfNaturalNumbers(10); // Example: n=10
    }

    // Sum of Natural numbers
    public static void sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of the first " + n + " natural numbers: " + sum);
    }
}

