import java.util.*;

public class Reversenoofstrings {
    public static String ReverseWords(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();
        StringBuilder result = new StringBuilder();

        // Split the string by one or more spaces
        String[] words = s.split("\\s+"); // Converts into array

        // Initialize left and right pointers for reversing the array
        int left = 0;
        int right = words.length - 1;

        // Reverse the array of words
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        // Append the words back into the result
        for (int i = 0; i < words.length; i++) {
            result.append(words[i]);
            if (i < words.length - 1) {
                result.append(" "); // Add space between words
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(ReverseWords(s)); // Output: "blue is sky the"
    }
}
