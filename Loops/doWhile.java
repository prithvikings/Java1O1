// public class doWhile{
//     public static void main(String[] args) {
//         int count=1;
//         do{
//             System.out.println("HELLO JI");
//             count++;
//         }while(count<=5);
//     }
// }

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("output is : "+n);
        } while (true);
    }
}