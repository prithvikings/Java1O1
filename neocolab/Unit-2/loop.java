/*
 question 1
 Single File Programming Question
Problem Statement



Ted, the computer science enthusiast, has accepted the challenge of writing a program that checks if the number of digits in an integer matches the sum of its digits.



Guide Ted in designing and writing the code to solve this problem using a 'do-while' loop. 

Input format :
The input consists of an integer N, representing the number to be checked.

Output format :
If the sum is equal to the number of digits, print "The number of digits in N matches the sum of its digits."

Else, print "The number of digits in N does not match the sum of its digits."



Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ N ≤ 106

Sample test cases :
Input 1 :
20
Output 1 :
The number of digits in 20 matches the sum of its digits.
Input 2 :
34
Output 2 :
The number of digits in 34 does not match the sum of its digits.
 */


//  import java.util.Scanner;

// public class DigitSumCheck {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt();
//         scanner.close();
        
//         int sumOfDigits = 0, numDigits = 0, temp = N;
        
//         // Counting digits and summing them using a do-while loop
//         do {
//             sumOfDigits += temp % 10;
//             temp /= 10;
//             numDigits++;
//         } while (temp > 0);
        
//         // Checking the condition and printing output
//         if (sumOfDigits == numDigits) {
//             System.out.println("The number of digits in " + N + " matches the sum of its digits.");
//         } else {
//             System.out.println("The number of digits in " + N + " does not match the sum of its digits.");
//         }
//     }
// }

/*
Understanding the Problem Statement
You take an integer 𝑁
N as input.
Count how many digits the number has.
Compute the sum of all its digits.
Compare the count of digits with the sum of digits.
Print a message based on whether they are equal or not. */






/*
question 2
Problem Statement



In a coding competition, you are tasked with a unique problem. You need to write a program that calculates the sum of the squares of the odd digits in a given integer. 

Input format :
The input consists of a single integer N, representing the number whose odd digits will be squared and summed.

Output format :
The output prints an integer, representing the sum of the squares of the odd digits in the given integer.



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ N ≤ 106

Sample test cases :
Input 1 :
12345
Output 1 :
35
Input 2 :
2085
Output 2 :
25
Input 3 :
2468
Output 3 :
0
 */

 //Aproach
 //1. Take an integer N as input.
//2. Initialize a variable sum to store the sum of squares of odd digits.
//3. Iterate over each digit of the number N.
//4. Check if the digit is odd.
//5. If the digit is odd, square it and add it to the sum.
//6. Print the sum as the output.

//Another Approach
 //1. Take an integer N as input.
//2. Initialize a variable sum to store the sum of squares of odd digits.
//3. extract last digit of N
//4. Check if the digit is odd.
//5. If the digit is odd, square it and add it to the sum.
//6. Print the sum as the output.