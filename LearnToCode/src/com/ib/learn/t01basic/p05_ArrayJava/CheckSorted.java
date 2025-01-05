package com.ib.learn.t01basic.p05_ArrayJava;

public class CheckSorted {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        boolean isSorted = true;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
