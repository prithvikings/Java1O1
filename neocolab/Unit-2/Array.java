/*
 question 1
 Single File Programming Question
Problem Statement



Danny is developing a scheduling application that needs to determine the next meeting day based on the current day. 



The application allows users to input the current day, and it then determines and displays the next day for scheduling meetings. Write the program that uses the enum concept to implement this feature. 

Input format :
The input consists of a single string representing the day of the week.

Output format :
If the input is a valid day of the week, print the name of the next day in upper case.

If the input is not a valid day of the week, print "Invalid Input".



Refer to the sample output for the formatting specifications.

Code constraints :
The input is case-insensitive.

enum name: Day

Sample test cases :
Input 1 :
MONDAY
Output 1 :
TUESDAY
Input 2 :
FriDay
Output 2 :
SATURDAY
Input 3 :
Fridays
Output 3 :
Invalid Input
 */

 /*What is an Enum in Java?
An enum (short for enumeration) in Java is a special data type used to define a fixed set of constants. 
It is commonly used when you have a list of predefined values that do not change, 
such as days of the week, months, directions, etc.

import java.util.Scanner;
This imports the Scanner class to take user input.
Defining an Enum

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
Here, Day is an enum that contains the seven days of the week.
The values inside the enum are constants (fixed values).
Enums are implicitly public, static, and final, meaning:
You cannot create new instances of an enum.
You cannot extend an enum.
Main Program

public class Main {
    public static void main(String[] args) {
This is the main method where the program execution starts.
Taking Input and Converting to Uppercase

        Scanner sc = new Scanner(System.in);
        String input = sc.next().toUpperCase();
We take user input as a string.
toUpperCase() converts the input to uppercase to make it case-insensitive (so monday and MONDAY are treated the same).
Checking if Input is a Valid Enum Value

        try {
            Day currentDay = Day.valueOf(input);
Day.valueOf(input): This converts the string input to its matching Day enum value.
Example:
If the user enters "MONDAY", Day.valueOf("MONDAY") returns Day.MONDAY.
If the input is not a valid enum value, it throws an exception (error), which we handle using try-catch.
Finding and Printing the Next Day

            int nextIndex = (currentDay.ordinal() + 1) % 7;
            System.out.println(Day.values()[nextIndex]);
ordinal() returns the index of the enum value (e.g., SUNDAY = 0, MONDAY = 1, etc.).
(currentDay.ordinal() + 1) % 7 finds the next day's index.
Example: If currentDay is MONDAY (index 1), the next index is 2 (TUESDAY).
% 7 ensures that when we reach SATURDAY (index 6), we loop back to SUNDAY (index 0).
Day.values() returns an array of all enum values, and Day.values()[nextIndex] gives the next day.
Handling Invalid Input

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input");
        }
If Day.valueOf(input) fails (e.g., the user enters "Fridays" instead of "Friday"), it throws an IllegalArgumentException.
The catch block catches this exception and prints "Invalid Input".
Example Runs
Valid Input
Input:
MONDAY
Processing:

currentDay = Day.MONDAY
currentDay.ordinal() = 1
nextIndex = (1 + 1) % 7 = 2
Day.values()[2] = TUESDAY
Output:

nginx
Copy
Edit
TUESDAY
Another Valid Input (Case-Insensitive)
Input:

nginx
Copy
Edit
friDay
Processing:

Converted to uppercase: "FRIDAY"
currentDay = Day.FRIDAY
nextIndex = (5 + 1) % 7 = 6
Day.values()[6] = SATURDAY
Output:

nginx
Copy
Edit
SATURDAY
Invalid Input
Input:

nginx
Copy
Edit
Fridays
Processing:

"Fridays" is not a valid enum value.
Day.valueOf("FRIDAYS") throws an exception.
Output:

css
Copy
Edit
Invalid Input
Summary
Enums are used to define a fixed set of constants.
Day.valueOf(input) converts a string to an enum constant.
ordinal() gives the index of the current day.
(ordinal() + 1) % 7 gets the next day's index.
Day.values()[nextIndex] fetches the next day.
If input is invalid, we handle it using try-catch.
 */

 /*
    question 2
    Single File Programming Question
Problem Statement



Arun is given an array of integers. His task is to find the product of elements at odd positions in the array.



Write a program to help Arun that takes an integer N as input, representing the size of the array, followed by N integers representing the elements of the array. The program should then calculate and print the product of elements at odd positions.

Input format :
The first line of input consists of an integer N, representing the number of elements in the array.

The second line consists of N space-separated integers, representing the elements of the array.

Output format :
The output prints the product of elements at odd positions. Position starts from 1.



﻿Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ N ≤ 15

0 ≤ array elements ≤ 100

Sample test cases :
Input 1 :
4
4 0 2 1
Output 1 :
8
Input 2 :
5
1 5 7 9 2
Output 2 :
14
Input 3 :
5
1 7 0 8 9
Output 3 :
0
  */

  /*
    Approach
    Approach: Finding Product of Elements at Odd Positions
1️⃣ Read Input
Take an integer N as input, which represents the number of elements in the array.
Read N space-separated integers into an array.
2️⃣ Identify Odd Positions
Positions in the question are 1-based (1st, 3rd, 5th, etc.).
Array indices in Java are 0-based.
Elements at odd positions (1st, 3rd, 5th, etc.) correspond to indices 0, 2, 4, etc.
3️⃣ Compute the Product
Initialize produ = 1 to store the product of elements.
Iterate through the array and multiply elements at indices where i % 2 == 0 (since they represent odd positions).
4️⃣ Output the Result
Print the final product of elements at odd positions.
   */