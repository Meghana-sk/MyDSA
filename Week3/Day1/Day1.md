## Problem 1: Merge two sorted arrays
[Leetcode](https://leetcode.com/problems/merge-sorted-array/description/)

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.


## Problem 2
Given an array of length n consisting of only 0's and 1's in random order. Modify the array in-place to segregate 0s on the left side and 1s on the right side of the array.
Input:
n = 5
arr[] = {0, 0, 1, 1, 0}
Output: {0, 0, 0, 1, 1}
Explanation: 
After segregate all 0's on the left and 1's on the right modify array will be {0, 0, 0, 1, 1}.

- Bruteforce approach
    ```Java
    void segregate0sAnd1s(int[] arr, int n){
        int zeroscount = 0;
        for(int x: arr){
            if(x == 0) zeroscount++;
        }
        for(int i = 0; i < n; i++){
            if(i < zeroscount) arr[i] = 0;
            else arr[i] = 1;
        }
    }
    ```
    Time complexity: O(N) + O(N)
    Space complexity: O(1)
