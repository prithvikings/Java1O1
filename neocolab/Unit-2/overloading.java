/*
 question-1 
 Problem Statement



Preethi is working on a project to automate sales tax calculations for items in a store. She wants to create a program that takes the price of an item and the sales tax rate as input and calculates the final price of the item after applying the sales tax. 



Write a program that handles both integer and double inputs using an overloaded method named calculateFinalPrice and print the final price of the item. 



Formula Used: Final price = price + ((price * sales tax rate) / 100)

Input format :
The first two lines of input consist of two integers a and b, representing the price of the item and the sales tax rate.

The third and fourth lines consist of two double values m and n, representing the price of the item and the sales tax rate.

Output format :
The first line of output prints an integer, representing the final price of the item after applying the sales tax for integer inputs (a and b).

The second line prints a double value, representing the final price of the item after applying the sales tax for double-value inputs (m and n), rounded to two decimal places.



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

100 ≤ a ≤ 1000

1 ≤ b ≤ 20

100.0 ≤ m ≤ 1000.0

1.0 ≤ n ≤ 20.0

Sample test cases :
Input 1 :
100
10
100.0
5.0
Output 1 :
110
105.00
Input 2 :
200
15
205.0
8.5
Output 2 :
230
222.43
 */
// import java.util.Scanner;

// class SalesTaxCalculator {
//    public static int calculateFinalPrice(int price, int taxrate){
//        return price + ((price * taxrate) / 100);
//    }
   
//    public static double calculateFinalPrice(double price, double taxrate){
//        return price + ((price * taxrate) / 100);
//    }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int intPrice = scanner.nextInt();
//         int intTaxRate = scanner.nextInt();
//         double doublePrice = scanner.nextDouble();
//         double doubleTaxRate = scanner.nextDouble();
//         int finalPriceInt = SalesTaxCalculator.calculateFinalPrice(intPrice, intTaxRate);
//         double finalPriceDouble = SalesTaxCalculator.calculateFinalPrice(doublePrice, doubleTaxRate);
//         System.out.println(finalPriceInt);
//         System.out.format("%.2f", finalPriceDouble);
//         scanner.close();
//     }
// }


/*
 question-2
 Problem Statement



Linda is developing a program that computes the volume of either a cube or a pyramid based on user input. The user specifies the shape (1 for a cube, 2 for a pyramid) and provides the necessary dimensions like side length for a cube and base and height for a pyramid. 



Help her write the program then calculate and display the corresponding volume using the overloaded method called calculateVolume.



Formulas Used:

Volume of a cube = Side length * Side length * Side length 
Volume of a pyramid = (Base * Height) / 3.0
Input format :
The first line consists of an integer representing the shape (1 for cube, 2 for pyramid).

If the choice is 1: The second line consists of a double value m, representing the side length of the cube.

If the choice is 2:

The second line consists of a double value x, representing the base of the pyramid.
The third line consists of a double value y, representing the height of the pyramid.
Output format :
If the choice is 1: The output displays "Volume of the cube: " followed by a double value representing the volume of the cube, rounded to two decimal places.

If the choice is 2: The output displays "Volume of the pyramid: " followed by a double value representing the volume of the pyramid, rounded to two decimal places.

If the choice is not 1 or 2, the output displays "Invalid".



Refer to the sample output for the formatting specifications.

Code constraints :
In this scenario, the test cases fall under the following constraints:

1.0 ≤ m ≤ 100.0

1.0 ≤ x, y ≤ 100.0﻿

Sample test cases :
Input 1 :
1
12.5
Output 1 :
Volume of the cube: 1953.13
Input 2 :
2
48.7
12.5
Output 2 :
Volume of the pyramid: 202.92
Input 3 :
4
12.5
Output 3 :
Invalid
Input 4 :
1
100.0
Output 4 :
Volume of the cube: 1000000.00
Input 5 :
2
100.0
100.0
Output 5 :
Volume of the pyramid: 3333.33
 */

// import java.util.Scanner;

// class GeometryCalculator {
//     public double calculateVolume(double side) {
//         return Math.pow(side, 3);
//     }

//     public double calculateVolume(double base, double height) {
//         return (base * height) / 3.0;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         GeometryCalculator calculator = new GeometryCalculator();
//         Scanner scanner = new Scanner(System.in);

//         int shape = scanner.nextInt();

//         if (shape == 1) {
//             double sideLength = scanner.nextDouble();
//             double cubeVolume = calculator.calculateVolume(sideLength);
//             System.out.printf("Volume of the cube: %.2f%n", cubeVolume);
//         } 
        
//         else if (shape == 2) {
//             double baseArea = scanner.nextDouble();
//             double height = scanner.nextDouble();
//             double pyramidVolume = calculator.calculateVolume(baseArea, height);
//             System.out.printf("Volume of the pyramid: %.2f%n", pyramidVolume);
//         } 
        
//         else {
//             System.out.println("Invalid");
//         }

//         scanner.close();
//     }
// }


/*
 question -3
 Problem Statement



Marina wants to determine whether the sum and difference of two numbers are prime or not. She needs a program that takes two integers as input, calculates their sum and difference, and checks if both are prime numbers.



So she wants to write a program that showcases constructor overloading within the PrimeDecider class, offering three distinct constructors:

Constructor with two parameters: Initializes num1 and num2 with the given parameters.
Constructor with no parameters: Initializes num1 and num2 to 0.
Constructor with a single parameter: Initializes both num1 and num2 with the same value provided as the parameter.
Input format :
The first line of the input consists of a positive integer which is 'num1'.

The second line of the input consists of a positive integer which is 'num2'.

Output format :
The first line of output prints the sum and the absolute difference of num1 and num2.

The second line of output prints the sum of the input integers, followed by either "is prime" or "is not prime".

The third line of output prints the absolute difference of the input integers, followed by either "is prime" or "is not prime".



Refer to the sample output for the formatting specifications.

Code constraints :
1 ≤ num1 and num2 ≤ 1000

Sample test cases :
Input 1 :
3
5
Output 1 :
Sum: 8, Difference: 2
8 is not prime
2 is prime
Input 2 :
13
17
Output 2 :
Sum: 30, Difference: 4
30 is not prime
4 is not prime
Input 3 :
1000
999
Output 3 :
Sum: 1999, Difference: 1
1999 is prime
1 is not prime
 */

 import java.util.Scanner;

class PrimeDecider {
    private int num1, num2;

    // Constructor with two parameters
    public PrimeDecider(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Constructor with no parameters
    public PrimeDecider() {
        this.num1 = 0;
        this.num2 = 0;
    }

    // Constructor with a single parameter
    public PrimeDecider(int num) {
        this.num1 = num;
        this.num2 = num;
    }

    // Method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to decide and print results
    public void decide() {
        int sum = num1 + num2;
        int diff = Math.abs(num1 - num2);

        System.out.println("Sum: " + sum + ", Difference: " + diff);
        System.out.println(sum + (isPrime(sum) ? " is prime" : " is not prime"));
        System.out.println(diff + (isPrime(diff) ? " is prime" : " is not prime"));
    }
}

public class overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        PrimeDecider primeDecider = new PrimeDecider(a, b);
        primeDecider.decide();
        scanner.close();
    }
}
