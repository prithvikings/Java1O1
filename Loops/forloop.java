// public class forloop {
//     public static void main(String[] args){
//         for(int i=0;i<5;i++){
//             System.out.println("Hello World");
//         }
//     }
    
// }


//reverse the number
// public class forloop{
//     public static void main(String[]args){
//         for(int i=10;i>=0;i--){
//             System.out.println(i);
//         }
//     }
// }


//print the square pattern
// public class forloop{
//     public static void main(String[] args){
//         for(int i=1;i<4;i++){
//             for(int j=1;j<4;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//print the reverse number

import java.util.Scanner;

public class forloop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to reverse and check if it palindrome or not: ");
        int n=sc.nextInt();
        int ld;
        int rev=0;
        int temp=0;
        while(n!=0){
            ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        System.out.println("The reverse the numebr is : "+rev);

        if(rev==temp){
            System.out.println("The number is palindrome ");
        }else{
            System.out.println("The number is not a Palindrome");
        }
    }
}