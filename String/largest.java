// Program to find the largest string in lexicographical order
public class largest {
    public static void main(String[] args) {
        // Array of strings to compare
        String fruits[] = {"apple", "banana", "mango"};

        // Initialize the 'largest' string as the first element in the array
        String largest = fruits[0];

        // Loop through the rest of the array to find the largest string
        for (int i = 1; i < fruits.length; i++) {
            // Using the compareTo() method to compare two strings
            // compareTo() returns:
            //   - A negative value if the first string is lexicographically smaller
            //   - Zero if both strings are equal
            //   - A positive value if the first string is lexicographically larger
            if (largest.compareTo(fruits[i]) < 0) {
                // Update 'largest' if the current string is lexicographically larger
                largest = fruits[i];
            }
        }

        // Print the largest string in lexicographical order
        System.out.println("Largest string is " + largest);
    }
}
