/* 46. Write a program to find the longest palindromic substring in a given string. Write its 
algorithm, program. Find its time and space complexities.  */


public class LongestPalindromicSubstring {

    // Helper function to expand around center and find the longest palindrome
    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the longest palindrome found
        return s.substring(left + 1, right);
    }

    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";
        
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes: expand around a single center
            String oddPalindrome = expandAroundCenter(s, i, i);
            // Even length palindromes: expand around a center between two characters
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            
            // Update the longest palindrome if a longer one is found
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }
        
        return longest;
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));
    }
}


//TC - O(N^2)
//SC - O(1)
