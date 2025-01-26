/* q1-Write a Java program to get a number from the user and print whether it is
  positive or negative.

q2-Question2: Finish the following code so that it prints You have a fever if your temperature
 is above 100 and otherwise prints You don't have a fever.
 */
import java.util.Scanner;

public class basic {
    public static void ispos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("It is negative number");
        }else if(n==0){
            System.out.println("It is Zero");
        }else{
            System.out.println("It is Positive number");
        }
    }
    
    public static void isfever(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter You Body Temp: ");
        float temp=sc.nextFloat();
        if(temp>100){
            System.out.println("You have fever");
        }else{
            System.out.println("You dont have fever");
        }
    }
    
    public static void week(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of day: ");
        int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("It is monday");
                break;
            case 2:
                System.out.println("It is tuesday");
                break;
            case 3:
                System.out.println("It wednesday");
                break;
            case 4:
                System.out.println("It is thrusday");
                break;
            case 5:
                System.out.println("It is friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
            System.out.println("Invalid day");
                break;
        }
    }
    
    public static void main(String[] args) {
        // ispos();
        // isfever();
        // week();
    }
}
