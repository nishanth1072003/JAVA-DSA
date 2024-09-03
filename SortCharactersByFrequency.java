import java.util.*;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        // Step 1: Create a frequency map to count occurrences of each character
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a list of characters sorted by their frequency in descending
        // order
        List<Character> characters = new ArrayList<>(freqMap.keySet());
        characters.sort((a, b) -> freqMap.get(b) - freqMap.get(a)); // Sort by frequency, highest first

        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            int count = freqMap.get(c);
            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        SortCharactersByFrequency sorter = new SortCharactersByFrequency();

        String test1 = "tree"; // Expected output: "eert" or "eetr"
        String test2 = "cccaaa"; // Expected output: "cccaaa" or "aaaccc"
        String test3 = "Aabb"; // Expected output: "bbAa" or "bbaA"

        System.out.println(sorter.frequencySort(test1));
        System.out.println(sorter.frequencySort(test2));
        System.out.println(sorter.frequencySort(test3));
    }
}
