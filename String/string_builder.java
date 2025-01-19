// StringBuilder: A mutable sequence of characters used for efficiently constructing strings.
public class string_builder {
    public static void main(String[] args) {

        // Create a new StringBuilder object initialized with the string "Hello"
        StringBuilder sb = new StringBuilder("Hello");

        // Loop through characters from 'a' to 'z' and append them to the StringBuilder
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch); // Append each character to the end of the StringBuilder
        }

        // Print the final content of the StringBuilder
        System.out.println(sb); // Output: Helloabcdefghijklmnopqrstuvwxyz

        // Print the length of the StringBuilder (number of characters)
        System.out.println(sb.length()); // Output: 31 (5 from "Hello" + 26 from 'a' to 'z')
    }
}
