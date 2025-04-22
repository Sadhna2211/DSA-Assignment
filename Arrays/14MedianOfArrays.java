import java.util.Scanner;

public class TwoSumSorted {

    public static void findTwoNumbers(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == target) {
                System.out.println("Numbers found: " + arr[start] + " and " + arr[end]);
                return;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println("No two numbers found with the given sum.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        findTwoNumbers(arr, target);
    }
}


//TC - O(n)
//SC - O(1)
