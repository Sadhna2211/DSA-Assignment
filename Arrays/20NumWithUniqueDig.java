/* 20. Count all numbers with unique digits for a given number of digits. Write its algorithm, 
program. Find its time and space complexities */


public class UniqueDigitNumbers {

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n > 10) n = 10; // More than 10 digits can't all be unique

        int total = 10; // For n = 1
        int uniqueDigits = 9;
        int availableDigits = 9;

        for (int i = 2; i <= n; i++) {
            uniqueDigits *= availableDigits;
            total += uniqueDigits;
            availableDigits--;
        }

        return total;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println("Count of unique digit numbers for n = " + n + ": " +
            countNumbersWithUniqueDigits(n));
    }
}


//TC - O(N)
//SC - O(1)
