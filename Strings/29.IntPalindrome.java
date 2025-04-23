/* 29. Write a program to check if an integer is a palindrome without converting it to a string. 
Write its algorithm, program. Find its time and space complexities.  */


public class PalindromeNumber {

    // Function to check if an integer is a palindrome
    public static boolean isPalindrome(int x) {
        // Step 1: Handle special cases
        if (x < 0) return false;  // Negative numbers are not palindromes
        if (x != 0 && x % 10 == 0) return false;  // Numbers ending with 0 but not 0 itself are not palindromes

        // Step 2: Reverse the second half of the number
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Step 3: Check if the first half is equal to the reversed second half
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome(121));  // true
        System.out.println(isPalindrome(-121)); // false
        System.out.println(isPalindrome(10));   // false
        System.out.println(isPalindrome(0));    // true
    }
}


//TC - O(log10x)
//SC - O(1)
