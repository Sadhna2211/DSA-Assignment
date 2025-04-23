/* 41. Write a program to find the maximum subarray sum using Kadane’s algorithm.  */


public class MaximumSubarraySum {

    // Function to find the maximum subarray sum using Kadane's Algorithm
    public static int maxSubArraySum(int[] nums) {
        int currentMax = nums[0];  // Initialize current max to the first element
        int globalMax = nums[0];   // Initialize global max to the first element
        
        // Loop through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update currentMax
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            
            // Update globalMax
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum: " + maxSubArraySum(nums));
    }
}


//TC - O(N)
//SC - O(1)
