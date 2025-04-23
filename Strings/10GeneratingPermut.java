/*  10. Generate all permutations of a given string. Write its algorithm, program. Find its time 
and space complexities. */


import java.util.*;

public class StringPermutations {

    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            result.add("");
            return result;
        }
        
        char first = str.charAt(0);
        String remaining = str.substring(1);
        List<String> words = generatePermutations(remaining);

        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                result.add(word.substring(0, i) + first + word.substring(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        List<String> permutations = generatePermutations(input);

        System.out.println("All permutations:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}


//TC - O(n!)
//SC - O(n*n!)
