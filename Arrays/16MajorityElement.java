/*16. Find the majority element in an array that appears more than n/2 times. Write its 
 program. Find its time and space complexities. */



class Solution {
    public int majorityElement(int[] nums) {
          
        int n = nums.length;
        int atleast = n/2;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);

        }

        for(int key: map.keySet()){
            if(map.get(key)> atleast){
                return key;
            }
        }
     return -1;
    }
}


//TC - O(n)
//SC - O(n)
