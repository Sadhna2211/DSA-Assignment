/* 43. Solve the problem of finding the top K frequent elements in an array. Write its 
algorithm, program. Find its time and space complexities. */


import java.util.*;

public class TopKFrequentElements {

    // Function to find the top K frequent elements in an array
    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a min-heap (priority queue) to store the top K frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        // Step 3: Push all entries into the heap and maintain the size of heap to K
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the element with the smallest frequency
            }
        }

        // Step 4: Extract the top K frequent elements from the heap
        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            result.add(minHeap.poll().getKey());
        }
        
        // Reverse the result list to get the top K elements in correct order
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> topK = topKFrequent(nums, k);
        
        // Print the top K frequent elements
        System.out.println("Top " + k + " frequent elements: " + topK);
    }
}


//TC - O(nlogk)
//SC - O(n)
