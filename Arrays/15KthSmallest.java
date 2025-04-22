/* 15. Find the k-th smallest element in a sorted matrix. Write its algorithm, program. Find its 
time and space complexities.  */


public class KthSmallestInMatrix {

    // Count elements less than or equal to mid
    public static int countLessEqual(int[][] mat, int mid, int n) {
        int count = 0;
        int row = n - 1, col = 0;

        while (row >= 0 && col < n) {
            if (mat[row][col] <= mid) {
                count += (row + 1);
                col++;
            } else {
                row--;
            }
        }
        return count;
    }

    public static int findKthSmallest(int[][] mat, int k) {
        int n = mat.length;
        int low = mat[0][0];
        int high = mat[n - 1][n - 1];

        while (low < high) {
            int mid = (low + high) / 2;
            int count = countLessEqual(mat, mid, n);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;

        System.out.println("K-th Smallest Element: " + findKthSmallest(mat, k));
    }
}


//TC - O(n * log(max - min))
//SC - O(1)
