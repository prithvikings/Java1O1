//qs2-write a program to find the factorial of any number entered by the user.

//qs3- write a program to print multiplication table of a number n entered by the user.

//qs1- Write a program that reads a set of integers and then prints the sum of the even and odd integers.
public class Practice {

    public static void facto(){
        int num = 5; // number to find factorial of
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }

    public static void table(){
        int num = 5; 
        for(int i=1;i<=10;i++){
            System.out.println(num+"*"+i+" = "+num*i);
        }
    }

    
    public static void main(String[] args) {
        // facto();
        // table();
    }
}
