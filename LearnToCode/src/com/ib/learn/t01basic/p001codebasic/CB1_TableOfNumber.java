package com.ib.learn.t01basic.p001codebasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CB1_TableOfNumber {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number to print its table: ");
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(breader.readLine());
        System.out.println("Table of " + number + " is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
