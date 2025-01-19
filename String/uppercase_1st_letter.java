// Program to capitalize the first letter of each word in a given string using a traditional for loop.
public class uppercase_1st_letter {
    public static void main(String[] args) {
        // Input string
        String str = "hi i am STring";

        // Split the string into words using space as a delimiter
        String[] words = str.split(" ");

        // Initialize an empty string to store the result
        String result = "";

        // Use a traditional for loop to iterate through the array of words
        for (int i = 0; i < words.length; i++) {
            // For each word, capitalize the first letter and append the rest of the word
            // word.substring(0, 1): Extract the first character of the word
            // toUpperCase(): Converts the first character to uppercase
            // word.substring(1): Extracts the rest of the word (starting from index 1 onwards)
            // Concatenate the capitalized first letter, the rest of the word, and a space
            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }

        // Print the final result after trimming the trailing space at the end
        // result.trim() removes any extra spaces at the start or end of the result string
        System.out.println(result.trim());
    }
}
