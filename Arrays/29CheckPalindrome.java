/* 29. Write a program to check if an integer is a palindrome without converting it to a string. 
Write its algorithm, program. Find its time and space complexities.  */


public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        // Reverse the second half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // If the number has even digits, x == reversedHalf
        // If odd digits, x == reversedHalf / 10 (to remove the middle digit)
        return (x == reversedHalf || x == reversedHalf / 10);
    }

    public static void main(String[] args) {
        int num = 1221;
        System.out.println(num + " is palindrome? " + isPalindrome(num));
    }
}


//TC - O(log₁₀n)
//SC - O(1)
