public class substr {
    
    // Manual method to extract a substring from a string
    public static String sub(String s, int start, int end) {
        String ans = ""; // Initialize an empty string to store the result

        // Loop from the start index to the end index (exclusive)
        for (int i = start; i < end; i++) {
            ans += s.charAt(i); // Append each character to the result string
        }

        // Return the manually constructed substring
        return ans;
    }

    public static void main(String[] args) {
        // Inbuilt substring method examples
        String s = "Hello";

        // Inbuilt substring method: s.substring(start, end)
        // Extracts a substring starting from index 'start' and ending at index 'end - 1'
        System.out.println(s.substring(1, 3)); // Output: "el" (substring from index 1 to 2)

        // Inbuilt substring method: s.substring(start)
        // Extracts a substring starting from index 'start' till the end of the string
        System.out.println(s.substring(2)); // Output: "llo" (substring from index 2 to the end)

        // Manual substring method
        System.out.println(sub(s, 1, 3)); // Output: "el" (substring from index 1 to 2)
    }
}
