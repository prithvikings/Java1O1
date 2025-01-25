//Recursion is a method of solving a computational problem where the solution depends on solutions to smaller instances of the same problem.

//base case
//kaam
//inner call

public class basic {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}