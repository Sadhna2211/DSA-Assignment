/* 19. How to find the maximum product subarray. Write its algorithm, program. Find its time 
and space complexities. */


class Solution {
    public int maxProduct(int[] nums) {
        int maxPro = Integer.MIN_VALUE;

        for (int i =0;i<nums.length;i++) {
            int product = 1;
            for (int j =i;j <nums.length;j++) {
                product *=nums[j];
                maxPro =Math.max(maxPro, product);
            }
        }

        return maxPro; 
    }
}



//TC - O(n^2)
//SC - O(1)
