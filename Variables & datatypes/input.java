/*
How to take input from user in java
In java, we can take input from the user using the Scanner class. 
The Scanner class is a part of the java.util package.
The Scanner class is used to get user input, and it is created by passing System.in as an argument to the Scanner class constructor
*/

/*
The next() method reads a string that is terminated by a whitespace.
The nextLine() method reads a string that is terminated by a newline character.
The nextInt() method reads an integer value.
The nextFloat() method reads a float value.
The nextDouble() method reads a double value.
The nextBoolean() method reads a boolean value.
The nextByte() method reads a byte value.
The nextShort() method reads a short value.
The nextLong() method reads a long value.
*/

import java.util.*;
public class input{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("The number is: "+num);
    }
}