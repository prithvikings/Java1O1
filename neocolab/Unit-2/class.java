/*
question :1 
Laura is learning about Pythagorean triples in her math class. She wants to create a program to determine whether a set of three integers forms a Pythagorean triple. 



Implement a program using the Pythagorean class to input the sides of a triangle and determine if it is a Pythagorean triple or not. 



Note: A Pythagorean triple is a set of three integers a, b, and c, satisfying a2+ b2 = c2 or b2+ c2 = a2  or a2+ c2 = b2.

Input format :
The input consists of three space-separated integers a, b, and c representing the sides of a triangle.

Output format :
The output prints "Pythagorean triple" or "Not a Pythagorean triple" based on the condition.



Refer to the sample output for the formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

1 ≤ a, b, c ≤ 150

Sample test cases :
Input 1 :
3 4 5
Output 1 :
Pythagorean triple
Input 2 :
1 100 95
Output 2 :
Not a Pythagorean triple
Input 3 :
41 9 40
Output 3 :
Pythagorean triple */

// import java.util.Scanner;

// // Pythagorean class to check if the sides form a Pythagorean triple
// class Pythagorean {
//     // Instance variables to store the sides of the triangle
//     int a, b, c;

//     // Method to check if the sides form a Pythagorean triple
//     boolean isPythagoreanTriple() {
//         // Check all three conditions for a Pythagorean triple
//         return (a * a + b * b == c * c) ||
//                (b * b + c * c == a * a) ||
//                (a * a + c * c == b * b);
//     }
// }

// // Main class to handle input and output
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Create an object of the Pythagorean class
//         Pythagorean p = new Pythagorean();
        
//         // Read the sides of the triangle
//         p.a = sc.nextInt();
//         p.b = sc.nextInt();
//         p.c = sc.nextInt();
        
//         // Check if the sides form a Pythagorean triple
//         if (p.isPythagoreanTriple()) {
//             System.out.print("Pythagorean triple");
//         } else {
//             System.out.print("Not a Pythagorean triple");
//         }
        
//         // Close the scanner
//         sc.close();
//     }
// }


/*
question-2
Single File Programming Question
Problem Statement



Arun is working on a project to convert seconds to a time format. He wants to create a program that accepts a time duration in seconds and converts it into hours, minutes, and seconds. 



Help him write a logic under class SecondsToTime with a constructor that gets input in seconds and converts it into hh:mm:ss format.

Input format :
The input consists of a single integer, representing the time duration in seconds.

Output format :
The output prints the converted time in the format 'hh:mm:ss' where hh represents hours, mm represents minutes, and ss represents seconds.



Refer to the sample output for formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

1 ≤ Time in Seconds ≤ 106

Sample test cases :
Input 1 :
3665
Output 1 :
01:01:05
Input 2 :
7200
Output 2 :
02:00:00
Input 3 :
60
Output 3 :
00:01:00 */

import java.util.Scanner;

class SecondsToTime {
    String formattedTime="";
   SecondsToTime(int totalSeconds) {
       int hour = totalSeconds / 3600;
       int min = (totalSeconds % 3600) / 60;
       int sec = totalSeconds % 60;
       this.formattedTime = String.format("%02d:%02d:%02d", hour, min, sec);
   }

   void displayTime() {
       System.out.println(formattedTime);
   }
}

public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();
        scanner.close();

        SecondsToTime timeConverter = new SecondsToTime(totalSeconds);
        timeConverter.displayTime();
    }
}
