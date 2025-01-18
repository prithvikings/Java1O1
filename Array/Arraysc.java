import java.util.Scanner;
public class Arraysc {
    public static void main(String[] args) {
        
        // Scanner class is used to take input from the user
        Scanner sc = new Scanner(System.in);

        // Taking the size of the array as input from the user
        int n;
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();

        // Declaring an array of size n
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // Printing the elements of the array
        System.out.println("The elements of the array are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        // Printing the length of the array
        System.out.println("The length of array: "+arr.length);
    }
}