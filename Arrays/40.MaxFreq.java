/* 40. Solve the problem of finding the element with maximum frequency in an array. Write 
its algorithm, program. Find its time and space complexities.  */


import java.util.*;

public class MaxFrequencyElement {

    // Function to find the element with maximum frequency
    public static int findMaxFrequencyElement(int[] arr) {
        // HashMap to store the frequency of each element
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        // Populate the frequency map
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with the maximum frequency
        int maxFreq = 0;
        int maxFreqElement = -1;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxFreqElement = entry.getKey();
            }
        }

        return maxFreqElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 5};
        System.out.println("Element with maximum frequency: " + findMaxFrequencyElement(arr));
    }
}


//TC - O(N)
//SC - O(N)
