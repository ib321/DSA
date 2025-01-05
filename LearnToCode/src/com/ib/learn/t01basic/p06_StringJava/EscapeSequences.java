package com.ib.learn.t01basic.p06_StringJava;

public class EscapeSequences {
    public static void main(String[] args) {
        // Escape sequences
        /*
        Escape character	Result	    Description
         \'	                '	        Single quote
         \"	                "	        Double quote
         \\	                \	        Backslash
         \n	                            New Line
         \r	                            Carriage Return
         \t	                            Tab
         \b	                            Backspace
         */
        String text = "Hello, World!\nWelcome to Java programming.\tLet's learn together.";
        System.out.println(text);
        // Raw strings (Java does not support raw strings directly, but we can use triple quotes in other languages)
        // In Java, we can use regular strings with escape sequences
        String rawText = "This is a \"raw\" string with \\ escape sequences.";
        System.out.println(rawText);
    }
}
