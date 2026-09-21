package Recursion;

public class PrintNNaturalNumbers {
    public static void printNumbers(int n) {
        if (n <= 0) {
            return; // Base case: if n is less than or equal to 0, do nothing
        }
        System.out.println(n); // Print the current number after the recursive call
        printNumbers(n - 1); // Recursive call with n-1

    }

    public static void main(String[] args) {
        int n = 5; // Example input
        printNumbers(n); // Call the method to print numbers from 1 to n
    }
}
