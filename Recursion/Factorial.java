package Recursion;
public class Factorial { // Capitalized class name (Java convention)
    public static int fact(int n) {
        // Handle negative numbers to prevent infinite recursion
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
         System.out.println(fact(6)); // Output: 120
    }
}