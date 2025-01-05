package com.ib.learn.t01basic.p04_basic.math;

public class LP4_LCMnGCD {

	public static void main(String[] args) {
		Long[] result1 = SolutionLP04.lcmAndGcd2(5L, 10L);
		System.out.println("LCM: " + result1[0] + ", GCD: " + result1[1]);

		new SolutionLP04();
		Long[] result2 = SolutionLP04.lcmAndGcd2(14L, 8L);
		System.out.println("LCM: " + result2[0] + ", GCD: " + result2[1]);
	}
}

class SolutionLP04 {

	// optimized way
	static Long[] lcmAndGcd2(Long first, Long second) {
		long First = first;
		long Second = second;
		// finding GCD:
		// dividing bigger number with reminder when that number is 0 last no is gcd.
		while (second != 0) {
			long temp = second; // Store second in a temporary variable
			second = first % second; // Update second to the remainder of first divided by second
			first = temp; // Update first to the value of second
		}
		long gcd = first;
		// finding LCM: formula is lcm(a,b) * gcd(a,b) = a*b
		long lcm = First * Second / gcd;

		return new Long[] { lcm, gcd };
	}

	// brute force way
	static Long[] lcmAndGcd(Long first, Long second) {
		long min = Math.min(first,second);
		// find max one line code: long max = (first > second) ? first : second;
		long max = Math.max(first,second);
		long gcd = 1;
		// finding GCD:
		for (int i = 2; i <= min; i++) {
			if (first % i == 0 && second % i == 0) {
				gcd = i;
				break;
			}
		}
		// finding LCM: formula is "lcm(a,b) * gcd(a,b) = a*b" so long lcm = first * second / gcd;
		// here lcm we are finding by trying to divide max number with both the no
		// if got divided then that is lcm if not increase till it gets divided
		while (max % first != 0 && max % second != 0)
			max++;

		return new Long[] { max, gcd };
	}
}