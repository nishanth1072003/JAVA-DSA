public class maxdepthparenthesis {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int currentDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        maxdepthparenthesis solution = new maxdepthparenthesis();

        // Test cases
        String test1 = "(1+(2*3)+((8)/4))+1"; // Expected output: 3
        String test2 = "(1)+((2))+(((3)))"; // Expected output: 3
        String test3 = "1+(2*3)/(2-1)"; // Expected output: 1
        String test4 = "((())(()))"; // Expected output: 3

        // Print the results
        System.out.println("Test 1: " + solution.maxDepth(test1)); // Output: 3
        System.out.println("Test 2: " + solution.maxDepth(test2)); // Output: 3
        System.out.println("Test 3: " + solution.maxDepth(test3)); // Output: 1
        System.out.println("Test 4: " + solution.maxDepth(test4)); // Output: 3
    }
}
