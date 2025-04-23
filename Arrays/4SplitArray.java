/* Check if an array can be split into two parts such that the sum of the prefix equals the 
sum of the suffix. Write its algorithm, program. Find its time and space complexities.
  */

package Strings;
import java.util.Scanner;
public class prefix {
public static boolean canBeSplit(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int prefixSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3};
        int[] arr2 = {1, 2, 3, 5};

        System.out.println(canBeSplit(arr1)); // true
        System.out.println(canBeSplit(arr2)); // false
    }
}

// TC - O(n)
// SC - O(n)
