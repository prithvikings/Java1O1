// import java.util.Scanner;

// public class whileloop {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number for which you want a table: ");
//         int n=sc.nextInt();
//         int count=1;
//         System.out.println("Table of "+n+" is: \n");
//         while(count<=10){
//             System.out.println(n+"*"+count+"="+n*count);
//             count++;
//         }
//         System.out.println();
//     }
    
//  }

 //Sum of first n natural numbers
import java.util.Scanner;
public class whileloop{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        int count=1;
        while(count<=n){
            sum+=count;
            count++;
        }
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);
    }
}


//how much prime number can occur in a given range
