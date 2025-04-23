/* 44. How to find two numbers in an array that add up to a target using hashing. Write its 
algorithm, program. Find its time and space complexities.  */


import java.util.*;

public class TwoSum {

    // Function to find two numbers that add up to the target
    public static boolean findTwoSum(int[] nums, int target) {
        Set<Integer> numSet = new HashSet<>();
        
        for (int num : nums) {
            int complement = target - num;
            // Check if complement exists in the set
            if (numSet.contains(complement)) {
                System.out.println("Pair found: (" + num + ", " + complement + ")");
                return true;
            }
            // Add the current number to the set
            numSet.add(num);
        }
        
        System.out.println("No pair found that adds up to the target.");
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Check for the pair that adds up to the target
        findTwoSum(nums, target);
    }
}


//TC - O(N)
//SC - O(N)
