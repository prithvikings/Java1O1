/* 
question-1
Problem Statement



Ashwin is assigned the task of implementing a program that utilizes the this keyword to initialize an object of the class Main based on user input. The class Main contains a single integer variable x, and the goal is to take an integer input from the user, use it to instantiate an object of the Main class, and then print the value of x to the console using the 'this' keyword.



Help Ashwin with the task.

Input format :
The input contains a integer x , representing the value to initialize the object.

Output format :
The output displays the input value in the format "Value of x = X", where X is the input integer.



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1 ≤ x ≤ 100

Sample test cases :
Input 1 :
5
Output 1 :
Value of x = 5
Input 2 :
10
Output 2 :
Value of x = 10
*/


// import java.util.Scanner;

// class MyClass {
//     int x;

//     // Constructor using 'this' keyword
//     MyClass(int x) {
//         this.x = x;
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int userInput = scanner.nextInt();

//         MyClass myObj = new MyClass(userInput);
//         System.out.print("Value of x = " + myObj.x);

//         scanner.close();
//     }
// }


/*
 question-2
 Sharon is eager to calculate discounts and savings while shopping. 



She wants to write a program that take inputs for the base price and the discount percentage and display the calculated discounted price and amount saved. Create a class with an instance initializer block to input and initialize base price and discount percentage values, and implement methods to perform the calculations.



Develop a program to assist Sharon in calculating the discounted price and the amount saved. 

Input format :
The first line of input consists of a double value b, which represents the base price.

The second line consists of a double value d, representing the discount percentage.

Output format :
The first line of output prints the discounted price, rounded off to two decimal places.

The second line prints the amount saved by applying the discount, rounded off to two decimal places.



Refer to the sample output for formatting specifications.

Code constraints :
The given test cases fall under the following constraints:

1000.00 ≤ b ≤ 1000000.00

1.0 ≤ d ≤ 20.0

Sample test cases :
Input 1 :
1000.00
3.0
Output 1 :
Discounted Price: Rs. 970.00
Amount Saved: Rs. 30.00
Input 2 :
25000.54
20.0
Output 2 :
Discounted Price: Rs. 20000.43
Amount Saved: Rs. 5000.11
Input 3 :
100000.00
30.2
Output 3 :
Discounted Price: Rs. 69800.00
Amount Saved: Rs. 30200.00
 */

import java.util.Scanner;
// You are using Java
class DiscountCalculator {
    //type your code here
    double basePrice;
    double discountedPercentage;
    {
    Scanner sc=new Scanner(System.in);
    basePrice=sc.nextDouble();
    discountedPercentage=sc.nextDouble();
    }
    
    double calculateDiscountedPrice(){
        return basePrice-(basePrice*discountedPercentage)/100;
    }
    double calculateAmountSaved(){
        return basePrice*discountedPercentage/100;
    }
}
public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();
        double discountedPrice = discountCalculator.calculateDiscountedPrice();
        double amountSaved = discountCalculator.calculateAmountSaved();

        System.out.printf("Discounted Price: Rs. %.2f%n", discountedPrice);
        System.out.printf("Amount Saved: Rs. %.2f%n", amountSaved);
    }
}