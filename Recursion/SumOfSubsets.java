package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SumOfSubsets {

    public static class Solution {
        ArrayList<Integer> ans;

        public ArrayList<Integer> subsetSums(int[] arr) {
            ans = new ArrayList<>(); // Re-initialize to clear state for multiple test cases
            helper(arr, 0, arr.length - 1, 0);
            
            // GFG expects the subset sums to be sorted in increasing order
            Collections.sort(ans); 
            
            return ans;
        }       

        void helper(int[] arr, int left, int right, int sum) {
            if (left > right) {
                ans.add(sum);
                return;
            }
            // Choice 1: Include the current element
            helper(arr, left + 1, right, sum + arr[left]);
            
            // Choice 2: Exclude the current element
            helper(arr, left + 1, right, sum);
        }
    }

    // Optional: A main method for local testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {2, 3};
        System.out.println(sol.subsetSums(arr)); // Output: [0, 2, 3, 5]
    }
}