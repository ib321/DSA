package com.ib.learn.t01basic.p06_StringJava;

public class ReverseString {
    public static void main(String[] args) {
        // Using StringBuilder reverse() method
        String str = "Hello, World!";
        String revStr = new StringBuilder(str).reverse().toString();
        System.out.println("Original String: " + str + " Reversed String: " + revStr);

        // Using a loop
        String str2 = "Hello, World!";
        StringBuilder revStr2 = new StringBuilder();
        for (int i = str2.length() - 1; i >= 0; i--) {
            revStr2.append(str2.charAt(i));
        }
        System.out.println("Original String: " + str2 + " Reversed String: " + revStr2);
    }
}
