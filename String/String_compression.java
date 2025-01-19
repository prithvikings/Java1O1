/*
String Compression: Implement a method to perform basic string compression using the counts of repeated characters.
For example, the string "aabcccccaaa" would become "a2b1c5a3".
If the compressed string would not become smaller than the original string, the method should return the original string.

Approach:
1. Initialize an empty string to store the compressed string.
2. Iterate through the input string character by character.
3. For each character, check if it is the same as the previous character.
4. If it is the same, increment a counter to track the number of repetitions.
5. If it is different, append the previous character and its count to the compressed string.
6. Reset the counter and update the previous character.
7. After the loop ends, append the last character and its count to the compressed string.
8. Compare the length of the compressed string with the original string.
9. Return the shorter of the two strings (compressed or original).
*/

public class String_compression {

    // Method 1: Compress the string using the counts of repeated characters
    public static String compress1(String str) { 
        if(str.isEmpty()) return str; // If the input string is empty, return it as is
        String compressed = ""; // Initialize an empty string to store the compressed result
        char prev = str.charAt(0); // Initialize the previous character as the first character of the input string
        int count = 1; // Initialize a counter to track the number of repetitions of the character

        // Loop through the string starting from the second character
        for(int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i); // Get the current character
            if(curr == prev) { // If the current character is the same as the previous character
                count++; // Increment the counter for consecutive characters
            } else {
                // Append the previous character and its count to the compressed string
                compressed += prev + Integer.toString(count);
                prev = curr; // Update the previous character
                count = 1; // Reset the counter to 1 for the new character
            }
        }

        // After the loop ends, append the last character and its count to the compressed string
        compressed += prev + Integer.toString(count);

        // If the compressed string is shorter than the original string, return it, else return the original string
        return compressed.length() < str.length() ? compressed : str;
    }

    // Method 2: Another approach to compress the string
    public static String compress2(String str) {
        String newStr = ""; // Initialize an empty string to store the compressed string

        // Loop through the string
        for(int i = 0; i < str.length(); i++) {
            int count = 1; // Initialize a counter for repetitions, starting with 1

            // Check for consecutive characters (if the current character is the same as the next one)
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++; // Increment the count for consecutive characters
                i++; // Move to the next character
            }

            // Append the character to the result string
            newStr += str.charAt(i);
            // If the character appeared more than once, append the count
            if(count > 1) {
                newStr += count;
            }
        }
        return newStr; // Return the compressed string
    }

    public static void main(String[] args) {
        // Test input string
        String str = "aabcccccaaa"; // Example string to be compressed
        // Print the result of compression using the second method
        System.out.println("Compressed string: " + compress2(str)); // Expected Output: "a2b1c5a3"
    }
}
