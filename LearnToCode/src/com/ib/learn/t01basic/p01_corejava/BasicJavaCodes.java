package com.ib.learn.t01basic.p01_corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicJavaCodes {
    public static void main(String[] args) {
        System.out.println("Hello! In This Program We Will Demo Some Basic Java Codes");
        System.out.println("We will use Java Function/Method concept here as well");
        System.out.println("Hello World");

        // Variables in Java
        String str = "This is a String";
        int number = 10;
        double decimal = 3.14;
        boolean booleanVariable = true;
        char character = 'A';
        System.out.println("String: " + str + ", Number: " + number + ", Decimal: " + decimal);
        System.out.println("Boolean: " + booleanVariable + ", Character: " + character);

        // Data Types in Java
        byte byteVariable = 100;

        // Output in Java (print() and println())
        System.out.print("This is print() ");
        System.out.println("This is println()");
        System.out.printf("This is printf() %d %f %s\n", number, decimal, str);

        // Input in Java (Scanner)
        inputDemo();

        // Operators in Java (Arithmetic, Logical, and Bitwise)
        operatorsDemo();
    }

    // Demonstrates Input in Java (Scanner)
    public static void inputDemo() {
        // Input in Java Using (Scanner)
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter Any Int: ");
        int intInput = scanner.nextInt();
        System.out.println("You entered: " + inputString + " And "+ intInput);

        // Input in Java using BufferedReader
        try {
            BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            int inputNumber = Integer.parseInt(breader.readLine());
            System.out.println("You entered: " + inputNumber);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Demonstrates Operators in Java (Arithmetic, Logical, and Bitwise)
    public static void operatorsDemo() {
        System.out.println("Operators Demo:");
        int x = 5, y = 2;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        // Logical Operators
        System.out.println("Logical Operators:");
        System.out.println("(x > 0) && (y < 10): " + ((x > 0) && (y < 10)));
        System.out.println("(x < 0) || (y < 10): " + ((x < 0) || (y < 10)));
        System.out.println("!(x == y): " + (!(x == y)));

        // Bitwise Operators
        System.out.println("Bitwise Operators:");
        System.out.println("x & y: " + (x & y));
        System.out.println("x | y: " + (x | y));
        System.out.println("x ^ y: " + (x ^ y));
        System.out.println("~x: " + (~x));
        System.out.println("x << 1: " + (x << 1));
        System.out.println("x >> 1: " + (x >> 1));
    }
}
