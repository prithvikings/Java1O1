/*
question 1.
Sarah, a reviewer for MovieMania Reviews, is updating the database with recent ratings and reviews for the film 'Tenet' directed by Christopher Nolan.


Create a program that records and displays the rating and review details for the movie.

Input format :
The first line of input consists of an integer N, representing the movie rating (1 to 5 stars).

The second line consists of a string containing the review text.

Output format :
The first line of output prints "Recent Review Rating: [N] stars"

The second line prints "Review Details: " followed by the review text.



Refer to the sample output for formatting specifications.

Code constraints :
1 ≤ N ≤ 5

Sample test cases :
Input 1 :
4
The movie has a complex narrative but is visually stunning.
Output 1 :
Recent Review Rating: 4 stars
Review Details: The movie has a complex narrative but is visually stunning.
Input 2 :
5
An incredible film with mind-blowing sequences and outstanding performances.
Output 2 :
Recent Review Rating: 5 stars
Review Details: An incredible fil */

// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         sc.nextLine();
//         String str=sc.nextLine();
//         System.out.println("Recent Review Rating: "+n+" stars");
//         System.out.println("Review Details: "+str);
        
//     }
// }


/*
question 2. An online store is simplifying the payment process for its customers. After a user checks out their items and the total expenditure is calculated, the system should generate a payment request. The request should prompt the user to make the payment via Google Pay, specifying the exact amount. Once the payment request is made, the system should display a thank-you message.



Write a program that takes the total expenditure as input and prints a payment request message along with a thank-you note.

Input format :
The input consists of a double value, representing the total expenditure.

Output format :
The output prints the payment request message along with a thank-you note.



Sample test cases :
Input 1 :
350.25
Output 1 :
Please Gpay Rs.350.25
Thanks, Visit us again!
Input 2 :
1200.59
Output 2 :
Please Gpay Rs.1200.59
Thanks, Visit us again!
 */

// import java.util.*;
// public class Main{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         float price=sc.nextFloat();
//         System.out.println("Please Gpay Rs."+price);
//         System.out.println("Thanks, Visit us again!");
//     }
// }

/*
 Arun has been assigned the task of writing a program that accepts user input for an Integer and a Character. The program should then use wrapper classes to convert these inputs into their corresponding primitive types (int, and char) and display the results.



Your task is to help Arun complete his assignment.

Input format :
The first line of input consists of an integer value.

The second line consists of a character.

Output format :
The first line of output displays the converted primitive integer value.

The second line displays the converted primitive character value.


Sample test cases :
Input 1 :
23
A
Output 1 :
Integer Value: 23
Character Value: A
Input 2 :
23
g
Output 2 :
Integer Value: 23
Character Value: g
Input 3 :
6789
P
Output 3 :
Integer Value: 6789
Character Value: P
 */

// You are using Java
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String c=sc.next();
        System.out.println("Integer Value: "+n);
        System.out.println("Character Value: "+c);
    }
}