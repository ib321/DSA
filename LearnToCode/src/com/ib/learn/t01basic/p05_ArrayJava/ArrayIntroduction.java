package com.ib.learn.t01basic.p05_ArrayJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntroduction {
    public static void main(String[] args) throws IOException {
        // Arrays Introduction
        // Declaring and initializing arrays
        System.out.println("Arrays are used to store multiple values in a single variable," +
                " instead of declaring separate variables for each value");
        int[] arr1 = {1, 2, 3, 4, 5}; // a[] notation
        int arr2[] = {6, 7, 8, 9, 10}; // []a notation
        // How to print an array: first method
        System.out.println("Array 1: " + Arrays.toString(arr1));

        // Accessing elements of an array
        System.out.println("Arr2 1st element: " + arr2[0]);
        // change the value of an array element
        arr2[0] = 100;
        System.out.println("Arr2 elements after change: " + Arrays.toString(arr2));

        // Array Length
        System.out.println("Length of arr1: " + arr1.length);

        // Taking array input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the size of the array: ");
        int size = scanner.nextInt();
        int[] userArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            userArray[i] = scanner.nextInt();
        }

        // Displaying the user input array
        System.out.println("User input array:");
        for (int i : userArray) {
            System.out.print(i + " ");
        }

        // Some of the Arrays functions
        // Sorting an array
        Arrays.sort(userArray);
        System.out.println("\nSorted array: " + Arrays.toString(userArray));

        // Searching an element in the array
        System.out.print("\nEnter an element to search: ");
        int key = scanner.nextInt();
        int index = Arrays.binarySearch(userArray, key);
        String result = index >= 0 ? "Element Found " : "Element Not found ";
        System.out.println(result + "at index: " + index);

        // Filling an array with a specific value
        Arrays.fill(userArray, 0);
        System.out.println("Array after filling with 0: " + Arrays.toString(userArray));

        // Copying an array
        int[] copiedArray = Arrays.copyOf(arr1, arr1.length);
        System.out.println("\nCopied array from arr1: " + Arrays.toString(copiedArray));

        //another way to take input
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = { 12, 34, 10, 6, 40 };
        if(false){
            System.out.println("Input Array of length 5: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(breader.readLine());
            }
        }
    }
}