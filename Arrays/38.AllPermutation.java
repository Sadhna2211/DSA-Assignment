/* 38. Generate all permutations of a given array. Write its algorithm, program. Find its time 
and space complexities. */


import java.util.*;

public class Permutations {

    // Function to generate all permutations of the array
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<>());
        return result;
    }

    // Backtracking function to generate permutations
    private static void backtrack(int[] nums, List<List<Integer>> result, List<Integer> current) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));  // If we've used all numbers, add to result
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicates or already used numbers
            if (current.contains(nums[i])) {
                continue;
            }
            current.add(nums[i]);
            backtrack(nums, result, current);  // Recurse
            current.remove(current.size() - 1);  // Backtrack
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permutations = permute(nums);

        // Print all permutations
        System.out.println("All permutations:");
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
}


//TC - O(n!)
//SC - O(n)
