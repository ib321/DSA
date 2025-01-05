package com.ib.learn.t01basic.p04_basic.math;

import java.util.ArrayList;
import java.util.List;

public class LP6_Factorisation {

	public static void main(String[] args) {
		int n = 36;
		int[] divs = PrintAllDivisor.printDivisors(n);
		for (int i = 0; i < divs[n]; i++) {
			System.out.println(divs[i]);
		}
		ArrayList<Integer> divarr = PrintAllDivisor.printDivisors2(40);
		for (Integer integer : divarr) {
			System.out.println(integer);
		}
	}
}

class PrintAllDivisor {
	/**
	 * print all divisor of a number Input:N = 36 Output:[1, 2, 3, 4, 6, 9, 12, 18,
	 * 36]
	 * 
	 * @param n
	 * @return
	 */
	public static int[] printDivisors(int n) {

		int[] divs = new int[1+n];
		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divs[count++] = i;
			}
		}
		// storing size of this divs to n+1 location
		divs[n] = count;

		return divs;

	}
	
	// optimized way 
	public static ArrayList<Integer> printDivisors2(int n) {
		ArrayList<Integer> divisors = new ArrayList<>();

		// Loop only half of number
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
				// As loop is only till half so logic to add division compliment of other half with each div
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        // Sorting the list to maintain order
        divisors.sort(Integer::compareTo);
        return divisors;
    }
}


class PrimeFactorization {
	// Function to perform prime factorization
	public static List<Integer> primeFactors(int number) {
		List<Integer> factors = new ArrayList<>();
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				factors.add(i);
				number /= i;
			}
		}
		return factors;
	}

	public static void main(String[] args) {
		int number = 60; // Example: prime factorization of 60
		List<Integer> factors = primeFactors(number);
		System.out.println("Prime factors of 60: " + factors);
	}
}
