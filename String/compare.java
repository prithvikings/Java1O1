//In java for comparing two strings we use equals() method. It compares the content of the strings and returns a boolean value. If the content of the strings is equal, it returns true otherwise false.

//In java we can not compare two strings using the == operator. It compares the reference of the strings and returns a boolean value. If the reference of the strings is equal, it returns true otherwise false. so we use equals() method to compare two strings. 

// 1. == Checks Reference Equality
// When you use == on two objects, including strings, it compares their memory addresses (references) rather than their actual content.
// This means == returns true only if both references point to the exact same object in memory.
// Example:

// String s1 = "Hello";
// String s2 = "Hello";
// System.out.println(s1 == s2); // true, because of String Pool optimization

// String s3 = new String("Hello");
// System.out.println(s1 == s3); // false, because s3 is created in the heap
// In the first case, s1 and s2 refer to the same object in the String Pool, so == returns true.
// In the second case, s3 is created using new, which creates a new object in the heap, so == returns false.


public class compare {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // Using == to compare strings
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false

        // Using equals() to compare strings
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
    }
}