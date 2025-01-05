package com.ib.learn.t01basic.p001codebasic;

public class APGPCode {
    public static void main(String[] args) {
        // Arithmetic Progression nth Term in Java
        arithmeticProgressionNthTerm(5, 2, 4); // Example: a=5, d=2, n=4
        // Geometric Progression nth Term in Java
        geometricProgressionNthTerm(3, 2, 4); // Example: a=3, r=2, n=4
    }

    // Arithmetic Progression nth Term
    public static void arithmeticProgressionNthTerm(int a, int d, int n) {
        int nthTerm = a + (n - 1) * d;
        System.out.println("Arithmetic Progression nth Term (a=" + a + ", d=" + d + ", n=" + n + "): " + nthTerm);
    }

    // Geometric Progression nth Term
    public static void geometricProgressionNthTerm(int a, int r, int n) {
        double nthTerm = a * Math.pow(r, n - 1);
        System.out.println("Geometric Progression nth Term (a=" + a + ", r=" + r + ", n=" + n + "): " + nthTerm);
    }
}


