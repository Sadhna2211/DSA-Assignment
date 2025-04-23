/* 36. Generate all subsets of a given array. Write its algorithm, program. Find its time and 
space complexities. */


import java.util.*;

public class Subsets {

    // Function to generate all subsets of the array
    public static List<List<Integer>> generateSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Add the empty subset
        
        for (int num : nums) {
            int n = result.size();
            // For each subset already in the result, add the current num
            for (int i = 0; i < n; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i));
                newSubset.add(num);
                result.add(newSubset);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = generateSubsets(nums);
        
        // Print all subsets
        System.out.println("All subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}


//TC - O(2^n)
//SC - O(2^n)
