/*
Interning Strings in Java (String Pool) - When you create a string using a string literal, Java checks the string pool to see if an identical string already exists.


Why Interning Matters:
It optimizes memory usage by avoiding duplicate strings.
Frequently used strings (e.g., in applications with many literals or constants) benefit from this feature.
 
When a string is created using a string literal (e.g., String s = "Hello";), Java checks the String Pool to see if an identical string already exists.

If it exists, the reference to the existing string in the pool is returned.
If it doesn't exist, a new string is added to the pool.
String Pool (Intern Pool):

It's a special area in memory inside the Heap where Java stores unique string literals.
The purpose of this pool is to save memory by avoiding duplicate string objects.
*/

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        // Character array
        char arr[] = { 'H', 'e', 'l', 'l', 'o' };

        // Strings in Java: Immutable and created in two ways
        String s = "Hello"; // String literal (stored in String Pool)
        String s1 = new String("Hello"); // String object (stored in Heap memory)

        // For taking input from the user
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input

        // Input using next(): Reads a single word (stops at space or newline)
        System.out.println("Enter your name");
        String s2 = sc.next(); // Example: If input is "John Doe", it will store "John"

        // Clear the input buffer: next() leaves a newline in the buffer,
        // which can interfere with subsequent calls to nextLine().
        sc.nextLine();

        // Input using nextLine(): Reads the entire line, including spaces
        System.out.println("Enter your full name");
        String s3 = sc.nextLine(); // Example: If input is "John Doe", it will store "John Doe"

        // Print the strings to verify the inputs
        System.out.println("String literal: " + s);
        System.out.println("String object: " + s1);
        System.out.println("Name (single word): " + s2);
        System.out.println("Full name: " + s3);

        // String methods: length() returns the number of characters in the string
        System.out.println("Length of string 's': " + s.length());

        // using charAt() to access individual characters
        System.out.println("Character at index 1 in 's': " + s.charAt(1)); // Output: e

        // Close the Scanner to free up resources and avoid warnings
        sc.close();
    }
}
