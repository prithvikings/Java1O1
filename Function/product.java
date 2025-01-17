// public class product{
//     public static void product(int a, int b){
//         System.out.println("Product of "+a+" and "+b+" is "+(a*b));
//     }
//     public static void main(String[] args) {
//         int a=10;
//         int b=2;
//         product(a,b);
//     }
// }

//number swapping using function
// public class product{
//     public static void swap(int a, int b){
//         int temp=a;
//         a=b;
//         b=temp;
//         System.out.println("a: "+a+" b: "+b);
//         return;
//     }
//     public static void main(String[] args) {
//         int a=10;
//         int b=2;
//         swap(a,b);
//     }
// }

//finding factorial using function
public class product{
    public static void factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+a+" is "+fact);
    }
    public static void main(String[] args) {
        int a=5;
        factorial(a);
    }
}