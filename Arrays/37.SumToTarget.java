/* 37. Find all unique combinations of numbers that sum to a target. Write its algorithm, 
program. Find its time and space complexities. */


import java.util.*;

public class CombinationSum {

    // Function to find all unique combinations that sum to target
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Optional: Sort for optimization
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    // Backtracking helper function
    private static void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            // If target becomes 0, we've found a valid combination
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) break;  // If the number is greater than the target, no point in continuing
            
            current.add(candidates[i]);  // Choose the number
            backtrack(candidates, target - candidates[i], i, current, result); // Recur with reduced target and same index
            current.remove(current.size() - 1);  // Backtrack, remove the last number
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = combinationSum(candidates, target);

        // Print all combinations
        System.out.println("Combinations summing to " + target + ":");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}


//TC - O(2^T)
//SC - O(T)
