/*
 question 1
 Problem Statement



Elon is developing a text-processing module for a messaging application. Users often input messages with consecutive and nonconsecutive characters, unintentionally or due to keyboard glitches. 



Implement a function named removeDuplicates using the StringBuilder class that efficiently cleans up these messages by removing duplicate characters while maintaining the integrity of the original message.



Write a program that takes user input, applies the removeDuplicates method, and outputs the cleaned message. Ensure that the program identifies lowercase and uppercase as different characters.

Input format :
The input consists of a string, representing the message.

Output format :
The output displays the message without repeated characters.



Refer to the sample output for the formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

The string contains both uppercase and lowercase with at most 50 characters.

Sample test cases :
Input 1 :
aabBbaAa
Output 1 :
abBA
Input 2 :
abcd
Output 2 :
abcd
 */

//  import java.util.Scanner;

// class RemoveDuplicatesUtility {
//     public static String removeDuplicates(String str) {
//         StringBuilder sb = new StringBuilder();
//         boolean[] seen = new boolean[256]; // ASCII character set
        
//         for (char ch : str.toCharArray()) {
//             if (!seen[ch]) { // If character is not seen before
//                 sb.append(ch);
//                 seen[ch] = true;
//             }
//         }
//         return sb.toString();
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         String userInput = scanner.nextLine();
//         String result = RemoveDuplicatesUtility.removeDuplicates(userInput);
        
//         System.out.println(result);
        
//         scanner.close();
//     }
// }


/*  question 2
Problem Statement



Sophia is working on a program to combine two strings into a new one by concatenating their characters while ensuring that no character is repeated in the final result. 


Write a program to merge two strings into one by retaining only unique characters in the order they first appear String builder class.

Input format :
The first line contains a string representing the firstString﻿ which consist of alphanumeric characters, spaces, and symbols.

The second line contains a string representing the secondString, with the same format as firstString.

Output format :
The output prints a single string containing all unique characters from firstString and secondString in the order of their first appearance.



Refer to the sample output for format specifications.

Code constraints :
In the given scenario, the test cases fall under the following constraints:

1 ≤ Length of each string ≤ 250 characters

The input strings are case-sensitive.

Sample test cases :
Input 1 :
heLlo@123
world@456
Output 1 :
heLlo@123wrd456
Input 2 :
aabbccddeeffgghhiijj
jjiihhggffeeddccbbaa
Output 2 :
abcdefghij
Input 3 :
Harry Potter
Child Play
Output 3 :
Hary PoteChild
*/


import java.util.Scanner;
// You are using Java
class StringManipulation {
    //type your code here
    public static String concatenateUnique(String firstStr,String secondStr){
        StringBuilder result=new StringBuilder();
        boolean[] seen=new boolean[256];
        String combined=firstStr+secondStr;
        
        for(char ch: combined.toCharArray()){
            if(!seen[ch]){
                result.append(ch);
                seen[ch]=true;
            }
        }
        return result.toString();
    }
    
 }
 
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String concatenatedString = StringManipulation.concatenateUnique(firstString, secondString);
        System.out.println(concatenatedString);

        scanner.close();
    }
} 


