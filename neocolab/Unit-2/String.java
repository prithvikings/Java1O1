/*Meet Jancy, a diligent student learning to master programming. She is working on a project that requires her to process text data. Today, she needs to convert a given string to lowercase to ensure consistent and uniform text.



Write a program that takes an input string and converts it to lowercase to help out Jancy. 

Input format :
The input consists of a single line of string.

Output format :
The output prints the input string converted to all lowercase letters.



Refer to the sample output for formatting specifications.

Code constraints :
The input string will consist of at most 1000 characters.

The string may contain letters(uppercase and lowercase), digits and special symbols.

Sample test cases :
Input 1 :
HeLLo WoRLd!
Output 1 :
hello world!
Input 2 :
It's a BeAutiful DAY
Output 2 :
it's a beautiful day*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();  // Corrected method call
        System.out.println(str);
        sc.close();  // Close Scanner to prevent resource leak
    }
}


/*
 question 2
 Problem Statement



Ariana, a budding programmer, is working on a string manipulation task where she needs to replace all occurrences of a specific character with another character in a given string. 



Her goal is to practice her string manipulation skills and accomplish this task.

Input format :
The first line of input consists of the string.

The second line consists of a character, representing the target character to be replaced.

The third line consists of a character, representing the replacement character.

Output format :
The output prints the modified string after replacing all occurrences of the target character with the replacement character.



Refer to the sample output for formatting specifications.

Code constraints :
The input string contains both uppercase and lowercase with at most 100 characters.

Sample test cases :
Input 1 :
Hello, World!
o
x
Output 1 :
Hellx, Wxrld!
Input 2 :
Jurassic Park
s
$
Output 2 :
Jura$$ic Park
Input 3 :
Onion
O
k
Output 3 :
knion
 */

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input string
        String str = sc.nextLine();
        
        // Read target and replacement characters
        char target = sc.next().charAt(0);
        char replacement = sc.next().charAt(0);
        
        // Replace all occurrences of the target character with the replacement character
        String modifiedStr = str.replace(target, replacement);
        
        // Print the modified string
        System.out.println(modifiedStr);
        
        sc.close();  // Close the scanner
    }
}
