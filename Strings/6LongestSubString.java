/* Q6 ) Find the length of the longest substring without repeating characters. Write its program. Find its time and space complexities.  */


import java.util.*;
public class string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s =sc.nextLine();

        int n = s.length();
        int maxLength =0;
        int start =0;

        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < n; end++) {
            while (set.contains(s.charAt(end))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            maxLength = Math.max(maxLength, end-start+ 1);
        }

        System.out.println("Length of longest substring without repeating characters: " + maxLength);
    }
}


//TC - O(n)
//SC - O(min(n,256))
