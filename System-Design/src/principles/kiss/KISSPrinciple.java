package principles.kiss;

public class KISSPrinciple {
    
}

// Code without KISS Principle
class ComplexFactorial {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial undefined for negative numbers");
        }
        return calculateFactorial(n);
    }

    private static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));  // Output: 120
        System.out.println("Factorial of 0: " + factorial(0));  // Output: 1
    }
}


// Code using KISS Principle
class SimpleFactorial {
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial undefined for negative numbers");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));  // Output: 120
        System.out.println("Factorial of 0: " + factorial(0));  // Output: 1
    }
}

