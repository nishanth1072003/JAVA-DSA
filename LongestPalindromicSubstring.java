import java.util.*;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return "";
        }

        String answer = "";

        // Check all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String subString = s.substring(i, j + 1);
                if (isPalindrome(subString) && subString.length() > answer.length()) {
                    answer = subString;
                }
            }
        }

        return answer;
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Return false as soon as a mismatch is found
            }
            left++;
            right--;
        }

        return true; // Return true only if all characters match
    }

    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest palindromic substring: " + longestPalindrome(s)); // Output: "bab" or "aba"
    }
}
