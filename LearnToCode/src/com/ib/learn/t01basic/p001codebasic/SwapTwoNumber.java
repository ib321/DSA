package com.ib.learn.t01basic.p001codebasic;

public class SwapTwoNumber {
    public static void main(String[] args) {
        System.out.println("First learn to find the last digit of a number: ");
        System.out.println("Find the last digit of a number: 345 ");
        findLastDigit(345);
        System.out.println("find the last digit of a number: 12345 ");
        findLastDigit(12345);

        System.out.println("Now learn to swap two numbers using temporary var: ");
        int a = 5, b = 10;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }

    // Find Last Digit
    public static void findLastDigit(int number) {
        int lastDigit = number % 10;
        System.out.println("The last digit of " + number + " is: " + lastDigit);
    }
}
