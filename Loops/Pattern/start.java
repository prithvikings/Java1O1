/*
//printing pattern 
 *    
 * *
 * * *
 * * * *
 
 */

// public class star {
//     public static void main(String[] args) {
//         for(int i=1;i<4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }



//printing pattern 
//  * * * *
//  * * *
//  * *
//  *

// public class start{
//     public static void main(String[] args) {
//         for(int i=4;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 

// public class start{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// 1 2 3 4 
// 1 2 3
// 1 2
// 1

// public class start{
//     public static void main(String[] args) {
//         for(int i=4;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// A 
// B C
// D E F
// G H I J


public class start{
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}