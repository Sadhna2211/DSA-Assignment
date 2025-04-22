/* 25. Solve the problem of finding the next greater element for each element in an array. 
Write its algorithm, program. Find its time and space complexities.  */


import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }

            // Set result[i]
            result[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element to stack
            stack.push(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 10, 8};
        int[] nge = nextGreaterElements(nums);
        System.out.println("Next Greater Elements: " + Arrays.toString(nge));
    }
}



//TC - O(N)
//SC - O(N)
