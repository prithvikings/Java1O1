// public class Switch {
//     public static void main(String[] args) {
//         int choice = 5;
//         switch (choice) {
//             case 1:
//                 System.out.println("You have selected choice 1");
//                 break;
//             case 2:
//                 System.out.println("You have selected choice 2");
//                 break;
//             case 3:
//                 System.out.println("You have selected choice 3");
//                 break;
//             case 4:
//                 System.out.println("You have selected choice 4");
//                 break;
//             default:
//                 System.out.println("Invalid choice");
//         }
//     }
// }

//Now making calculator using switch case
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter the operator: ");
        char op = sc.next().charAt(0);
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println("The result is: " + result);

    }
}