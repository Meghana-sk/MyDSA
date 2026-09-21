package Recursion;

public class FibonacciSeries {
    public static int fibonacci(int n) {
        // Base case: return n if it's 0 or 1
        if (n == 0 || n == 1) {
            return n;
        }
        // Recursive case: return the sum of the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6; // Example input
        System.out.println(fibonacci(n)); // Output: 8
    }
}
