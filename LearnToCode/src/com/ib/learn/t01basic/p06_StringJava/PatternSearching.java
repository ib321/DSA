package com.ib.learn.t01basic.p06_StringJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSearching {
    public static void main(String[] args) {
        String text = "This is a simple text for pattern searching in Java.";
        String patternString = "pattern";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Pattern found at index: " + matcher.start());
        } else {
            System.out.println("Pattern not found.");
        }
    }
}
