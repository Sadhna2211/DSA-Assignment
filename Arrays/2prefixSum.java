/* Q2). Write a program to find the sum of elements in a given range [L, R] using a prefix sum 
array. Write its algorithm, program. Find its time and space complexities. Explain with 
suitable example. 
*/

package Strings;
import java.util.Scanner;
public class prefix {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array size
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] prefixSum = new int[n];

            // Input array elements
            System.out.print("Enter " +n+ " elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Prefix sum array
            prefixSum[0] = arr[0];
            for (int i =1; i <n; i++) {
                prefixSum[i] = prefixSum[i -1]+arr[i];
            }

            // Input range L and R
            System.out.print("Enter L: ");
            int L = sc.nextInt();
            System.out.print("Enter R: ");
            int R = sc.nextInt();

            // Calculate sum [L, R]
            int sum;
            if (L == 0) {
                sum = prefixSum[R];
            } else {
                sum = prefixSum[R] - prefixSum[L -1];
            }
            System.out.println("Sum of those elements is: "+sum);
        }
    }


//TC - O(n)
//SC - O(n)
