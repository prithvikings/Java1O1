/*
 question-1
 Liam wants to determine if the number of pages in a book he plans to read is odd. He wants to write a program where the user inputs a single integer representing the number of pages. The program should check if the number is odd and display the result in the specified format.



Can you guide Liam in this?

Input format :
The input contains a single integer n, representing the number of pages in the book.

Output format :
The output prints "Is the integer odd? " followed by a boolean value, representing whether n is even or odd.



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ n ≤ 105

Sample test cases :
Input 1 :
47
Output 1 :
Is the integer odd? true
Input 2 :
486
Output 2 :
Is the integer odd? false
 */


 /*
  question-2
  Arjun wants to calculate the square and cube of a number for his math project. 

Write a program where the user inputs a single integer. The program should compute the square and cube of the number and display them.

Input format :
The input consists of a single integer n.

Output format :
The output prints the square and cube of the input number as:

"Square of <<n>> 5 is <<square>>"

"Cube of <<n>> is <<cube>"

Sample test cases :
Input 1 :
5
Output 1 :
Square of 5 is 25
Cube of 5 is 125
Input 2 :
39
Output 2 :
Square of 39 is 1521
Cube of 39 is 59319
  */

/*
 question-3
 Alex and Pat recently completed a coding competition and want to evaluate their performance. They decide to calculate their average score to understand how well they performed as a team. 



Write a program that takes Alex’s and Pat’s individual scores as input and computes the average of their scores.

Input format :
The input consists of two double values, representing Alex’s and Pat’s individual scores.

Output format :
The output prints the average score of Alex and Pat, rounded off to two decimal places.



Refer to the sample output for format specification.

Code constraints :
The given test cases fall under the following constraints:

1.0 ≤ score ≤ 100.0

Sample test cases :
Input 1 :
85.5
92.67
Output 1 :
89.09
Input 2 :
60.50
75.5
Output 2 :
68.00
 */

//  import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Read Alex's and Pat's scores
//         double alexScore = sc.nextDouble();
//         double patScore = sc.nextDouble();
        
//         // Calculate the average
//         double average = (alexScore + patScore) / 2;
        
//         // Round the average to two decimal places and print
//         System.out.printf("%.2f", average);
//     }
// }

/*
    question-4
    Zara and Mike are comparing their savings to decide their next move. If Zara's savings are greater than Mike's, they plan to calculate the difference; otherwise, they'll add both savings together. She wants to write a program to compute the result of this comparison and multiply it by 2, considering operator precedence.



Help them in the programming task.

Input format :
The input consists of two integers a and b, representing Zara's and Mike's savings.

Output format :
The output prints the calculated result.



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ a, b ≤ 1000

Sample test cases :
Input 1 :
100 250
Output 1 :
Result of (100 > 250 ? 100 - 250 : 100 +250) * 2: 700
Input 2 :
20 15
Output 2 :
Result of (20 > 15 ? 20 - 15 : 20 +15) * 2: 10
 */
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Read the two integers
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
        
//         // Perform the ternary operation and multiply by 2
//         int result = (num1 > num2 ? num1 - num2 : num1 + num2) * 2;
        
//         // Print the result in the required format
//         System.out.println("Result of (" + num1 + " > " + num2 + " ? " + num1 + " - " + num2 + " : " + num1 + " +" + num2 + ") * 2: " + result);
//     }
// }



/*
question-5
Problem statement

﻿

Three travel enthusiasts, Emily, James, and Olivia, set off on a worldwide expedition. During their journey, they encounter different units of measurement. Emily wants to convert lengths (Choice 1: Inches to Centimeters), James seeks to convert weights (Choice 2: Pounds to Kilograms), and Olivia is interested in volume conversions (Choice 3: Gallons to Liters). To facilitate their travels, write a Java program that allows them to select their preferred conversion type and see the result in the desired units, accurately representing their diverse needs for their international exploration.



Formula for conversion

centimeters = inches * 2.54
kilograms = pounds * 0.453592
liters = gallons * 3.78541
Input format :
The first line of input contains an integer representing the choice.

the second line of input contains the decimal value, representing the unit to be converted in double type.

Output format :
The output will display the converted unit based on the provided input.



Refer to the sample outputs for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ unit ≤ 100

Choices = 1,2, and 3

Sample test cases :
Input 1 :
1
5
Output 1 :
5.00 inches is equal to 12.70 centimeters.
Input 2 :
2
8.6
Output 2 :
8.60 pounds is equal to 3.90 kilograms.
Input 3 :
3
12
Output 3 :
12.00 gallons is equal to 45.42 liters.
 */

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Read the choice
//         int choice = sc.nextInt();
        
//         // Read the value to be converted
//         double value = sc.nextDouble();
        
//         // Perform the conversion based on the choice
//         double result = 0;
//         String fromUnit = "";
//         String toUnit = "";
        
//         if (choice == 1) {
//             // Inches to Centimeters
//             result = value * 2.54;
//             fromUnit = "inches";
//             toUnit = "centimeters";
//         } else if (choice == 2) {
//             // Pounds to Kilograms
//             result = value * 0.453592;
//             fromUnit = "pounds";
//             toUnit = "kilograms";
//         } else if (choice == 3) {
//             // Gallons to Liters
//             result = value * 3.78541;
//             fromUnit = "gallons";
//             toUnit = "liters";
//         } else {
//             // Invalid choice
//             System.out.println("Invalid choice!");
//             return;
//         }
        
//         // Print the result formatted to two decimal places
//         System.out.printf("%.2f %s is equal to %.2f %s.\n", value, fromUnit, result, toUnit);
//     }
// }


/*
question-6
Rex is required to create a Java program that enables users to perform arithmetic operations on complex numbers. Complex numbers are represented as "a + bi," where "a" is the real part and "b" is the imaginary part. The program should support the following operations:



Formulas:

Addition: Add two complex numbers.

resultReal = real1 + real2;
resultImag = imag1 + imag2;
Subtraction: Subtract one complex number from another.

resultReal = real1 - real2;
resultImag = imag1 - imag2;
Multiplication: Multiply two complex numbers.

resultReal = real1 * real2 - imag1 * imag2;
resultImag = real1 * imag2 + imag1 * real2;
Input format :
The first line of input consists of a double value representing the Real part of the first complex number.

The second line of input consists of a double value representing the Imaginary part of the first complex number.

The third line of input consists of a double value representing the Real part of the second complex number.

The fourth line of input consists of a double value representing the Imaginary part of the second complex number.

The next line represents the operation choice:

1 for Addition
2 for Subtraction
3 for Multiplication
Output format :
The output prints,

If the operation choice is 1, the program should display the result of the addition in the format: "Result: (a + bi)".

If the operation choice is 2, the program should display the result of the subtraction in the format: "Result: (a + bi)".

If the operation choice is 3, the program should display the result of multiplication in the format: "Result: (a + bi)".

If the user enters an invalid choice, the program should display "Invalid choice."



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

0.0 ≤ numbers ≤ 100.0

Sample test cases :
Input 1 :
3.5 
2.0
1.2 
0.8
1
Output 1 :
Result: 4.7 + 2.8i
Input 2 :
2.0 
1.0
1.0 
2.0
4
Output 2 :
Invalid choice
Input 3 :
3.0
3.0
2.0
2.0
2
Output 3 :
Result: 1.0 + 1.0i
Input 4 :
7.0
3.0
2.0
2.0
3
Output 4 :
Result: 8.0 + 20.0i
 */


// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Read the real and imaginary parts of the first complex number
//         double real1 = sc.nextDouble();
//         double imag1 = sc.nextDouble();
        
//         // Read the real and imaginary parts of the second complex number
//         double real2 = sc.nextDouble();
//         double imag2 = sc.nextDouble();
        
//         // Read the operation choice
//         int choice = sc.nextInt();
        
//         // Variables to store the result
//         double resultReal = 0;
//         double resultImag = 0;
        
//         // Perform the operation based on the choice
//         switch (choice) {
//             case 1:
//                 // Addition
//                 resultReal = real1 + real2;
//                 resultImag = imag1 + imag2;
//                 break;
//             case 2:
//                 // Subtraction
//                 resultReal = real1 - real2;
//                 resultImag = imag1 - imag2;
//                 break;
//             case 3:
//                 // Multiplication
//                 resultReal = real1 * real2 - imag1 * imag2;
//                 resultImag = real1 * imag2 + imag1 * real2;
//                 break;
//             default:
//                 // Invalid choice
//                 System.out.println("Invalid choice");
//                 return;
//         }
        
//         // Print the result in the required format
//         System.out.printf("Result: %.1f + %.1fi\n", resultReal, resultImag);
//     }
// }