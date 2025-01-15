// Program to demonstrate the use of if-else statement

// public class ifelse{
// public static void main(String[] args){
//     int a=10;
//     int b=20;
//     if(a>b){
//         System.out.println("a is greater than b");
//     }
//     else{
//         System.out.println("b is greater than a");
//     }
    
// }
// }

//print the largest number among two numbers
// public class ifelse{
//     public static void main(String[] args){
//         int a=10;
//         int b=30;
//         if(a>b){
//             System.out.println("a is greater than b");
//         }
//         else{
//             System.out.println("b is greater than a");
//         }
//     }
// }

//print the largest number among three numbers
// public class ifelse{
//     public static void main(String[] args){
//         int a=10;
//         int b=30;
//         int c=20;
//         if(a>b && a>c){
//             System.out.println("a is greater than b and c");
//         }else if(b>a && b>c){
//             System.out.println("b is greater than a and c");
//         }else{
//             System.out.println("c is greater than a and b");
//         }
//     }
// }

//print if the number is odd or even
public class ifelse{
    public static void main(String[] args){
        int a=10;
        
        // if(a%2==0){
        //     System.out.println("The number is even");
        // }
        // else{
        //     System.out.println("The number is odd");
        // }
        
        String result=(a%2==0)?"even":"odd";
        System.out.println("The number is: "+result);
    }
}