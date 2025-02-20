/*
Basic:-

Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
 these 3 numbers.
 (Hint : Average of N numbers is sum of those numbers divided by N)


 
 
 Question 2: In a program, input the side of a square. You have to output the area of the
 square.
 (Hint : area of a square is (side x side))
 
 Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
 an eraser. You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */



//qs-3
// import java.util.*;
// public class Practice{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         float pencil,pen,eraser;
//         System.out.println("Enter the Price of Pencil: ");
//         pencil=sc.nextFloat();
//         System.out.println("Enter the Price of Pen: ");
//         pen=sc.nextFloat();
//         System.out.println("Enter the Price of Eraser: ");
//         eraser=sc.nextFloat();
//         float total=pencil+pen+eraser;
//         System.out.println("The Total Price : "+total);
//     }
// }


 //qs-1

// import java.util.Scanner;

// public class Practice{
//     public static void areaofsq(int side){
//         int res=side*side;
//         System.out.println("The are of square is: "+res+"cm");
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         // int a,b,c;
//         // System.out.println("Enter the Number of a: ");
//         // a=sc.nextInt();
//         // System.out.println("Enter the Number of b: ");
//         // b=sc.nextInt();
//         // System.out.println("Enter the Number of c: ");
//         // c=sc.nextInt();
//         // int avg=(a+b+c)/3;
//         // System.out.println("The average Price is : "+ avg);

//         int side;
//         System.out.println("Enter the Side of Square: ");
//         side=sc.nextInt();
//         areaofsq(side);
//     }
//  }