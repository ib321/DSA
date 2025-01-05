package com.ib.learn.t01basic.p06_StringJava;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;

        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
