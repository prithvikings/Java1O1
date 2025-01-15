import java.util.Scanner;

public class Studentmarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of the student: ");
        int marks=sc.nextInt();
        // if(marks>=33){
        //     System.out.println("The student has passed the exam");
        // }
        // else{
        //     System.out.println("The student has failed the exam");
        // }
        String result=(marks>=33)?"The student has passed the exam":"The student has failed the exam";
    }
    
}