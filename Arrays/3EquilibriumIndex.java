/*Solve the problem of finding the equilibrium index in an array. Write its program. Find its time and space complexities.
*/


package Strings;
import java.util.Scanner;
public class prefix {
        public static void main(String[] args) {
          
            Scanner sc =new Scanner(System.in);

            //size of the array
            System.out.print("Enter size of the array: ");
            int n=sc.nextInt();

            // Initialize the array
            int[] arr=new int[n];

            // array elements
            System.out.println("Enter the elements of the array:");
            for (int i=0;i<n;i++){
                arr[i] =sc.nextInt();
            }

            // Build prefix sum array
            int[] pre=new int[n];
            pre[0] =arr[0];
            for (int i =1;i<n;i++) {
                pre[i] =pre[i- 1]+arr[i];
            }

            //Find equilibrium index
            for (int i =0;i<n;i++) {
                int left =0;
                if (i>0) {
                    left =pre[i-1];
                }
                int right= pre[n-1]-pre[i];

                if (left ==right) {
                    System.out.println("Equilibrium index: " +i);
                    return;
                }
            }

            System.out.println("No equilibrium index found.");
        }
    }



          //TC - O(n)
          //SC - O(n)
