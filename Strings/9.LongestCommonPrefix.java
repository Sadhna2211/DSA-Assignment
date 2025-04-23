/* 9. Find the longest common prefix among a list of strings. Write its program. 
Find its time and space complexities.  
*/


import java.util.*;

public class LongestCommonPrefix {
    
    public static String findCommonPrefix(List<String> strs) {
        if (strs.isEmpty()) return "";
        
        String prefix = strs.get(0); // Start with the first string as the prefix
        
        for (int i = 1; i < strs.size(); i++) {
            while (strs.get(i).indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix
                if (prefix.isEmpty()) return ""; // No common prefix
            }
        }
        return prefix; // Return the longest common prefix
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline character

        List<String> strs = new ArrayList<>();
        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            strs.add(sc.nextLine());
        }

        String result = findCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result);
    }
}


//TC - O(n*m)
//SC - O(1)
