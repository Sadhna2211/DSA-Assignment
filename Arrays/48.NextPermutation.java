/* 48. Solve the problem of finding the next permutation of a given array. Write its algorithm, 
program. Find its time and space complexities.  */


import java.util.*;

public class NextPermutation {

    // Function to find the next permutation
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // Step 1: Find the pivot
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // If no pivot is found, reverse the array
        if (i >= 0) {
            // Step 2: Find the successor
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap the pivot and successor
            swap(nums, i, j);
        }
        
        // Step 4: Reverse the suffix (from i + 1 to the end of the array)
        reverse(nums, i + 1, n - 1);
    }

    // Helper function to swap elements at indices i and j
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper function to reverse the array from index start to end
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        
        // Print the next permutation
        System.out.println("Next Permutation: " + Arrays.toString(nums));
    }
}


//TC - O(N)
//SC - O(1)
