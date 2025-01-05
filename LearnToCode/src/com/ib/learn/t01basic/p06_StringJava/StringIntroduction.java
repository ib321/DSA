package com.ib.learn.t01basic.p06_StringJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIntroduction {
    public static void main(String[] args) {
        // String is a sequence of characters
        // Strings are immutable && Strings are objects in Java
        // Strings are stored in a pool called String Pool
        // Strings can be created using String literals or by using the new keyword
        String greeting = "Hello";
        String name = new String("Indian Bittu");
        // Strings can be concatenated using the + operator
        System.out.println(greeting + " " + name);
        // Strings can be compared using the equals() method or == operator
        // Strings can be compared using the compareTo() method
        // uppercase using the toUpperCase()method lowercase using toLowerCase()
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
        // Strings can be trimmed using the trim() method
        // Strings can be split using the split() method
        // Strings can be replaced using the replace
        String firstName = "John";
        firstName.replace('J', 'K');
        System.out.println("First Name: " + firstName);
        // String length can be found using the length() method
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + str.length());
        // Strings can be found using the indexOf() method
        String newStr = "Please locate where 'locate' occurs!";
        System.out.println(newStr.indexOf("locate")); // Outputs 7


    }
}

