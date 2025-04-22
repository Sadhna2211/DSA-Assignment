/* Q5 ) Find the maximum sum of any subarray of size K in a given array. Write its algorithm, 
program. Find its time and space complexities.  */

import java.util.Scanner;
public class sliding{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // Input
        System.out.print("Enter size of the array: ");
        int n =sc.nextInt();
        int[] arr= new int[n];

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter value of K: ");
        int k =sc.nextInt();

        // Check if K is valid
        if(k>n) {
            System.out.println("K cannot be greater than array size.");
            return;
        }

        // Initial window sum
        int windowSum =0;
        for(int i =0;i<k;i++) {
            windowSum +=arr[i];
        }

        int maxSum =windowSum;

        // Sliding window
        for(int i = k;i<n;i++) {
            windowSum +=arr[i]-arr[i-k];
            if(windowSum >maxSum) {
                maxSum =windowSum;
            }
        }

        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}

//TC - O(n)
//SC - O(1)
