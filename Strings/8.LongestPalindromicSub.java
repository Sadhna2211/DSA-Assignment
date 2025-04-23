/* 8. Find the longest palindromic substring in a given string. Write its algorithm, program. 
Find its time and space complexities. */


import java.util.Scanner;

public class LongestPalin {

    // Function to expand around center and find palindrome
    public static String expand(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }

    // Function to get the longest palindrome
    public static String longest(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String odd = expand(str, i, i);      // Odd length palindrome
            String even = expand(str, i, i + 1); // Even length palindrome

            if (odd.length() > result.length()) result = odd;
            if (even.length() > result.length()) result = even;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = longest(input);
        System.out.println("Longest palindrome: " + result);
    }
}



//TC - O(n^2)
//SC - O(1)
