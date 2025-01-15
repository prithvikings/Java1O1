
/*
 Symbols that tell the compiler to perform specific mathematical or logical manipulations. Java has a rich set of operators that can be used to manipulate variables. We can divide all the Java operators into the following groups −
    1. Arithmetic Operators
    2. Relational Operators
    3. Bitwise Operators
    4. Logical Operators
    5. Assignment Operators
    6. Misc Operators

 */

 public class basic {
    public static void main(String[] args){
        // Arithmetic Operators
        int a=10;
        int b=20;
        System.out.println("a+b= "+(a+b));
        System.out.println("a-b= "+(a-b));
        System.out.println("a*b= "+(a*b));
        System.out.println("a/b= "+(a/b));
        System.out.println("a%b= "+(a%b));

        // unary operators
        System.out.println("a++= "+(a++));
        System.out.println("a--= "+(a--));
        System.out.println("++a= "+(++a));
        System.out.println("--a= "+(--a));

        // Relational Operators
        System.out.println("a==b= "+(a==b));
        System.out.println("a!=b= "+(a!=b));
        System.out.println("a>b= "+(a>b));
        System.out.println("a<b= "+(a<b));
        System.out.println("a>=b= "+(a>=b));
        System.out.println("a<=b= "+(a<=b));

        //Assignment Operators
        System.out.println("a+=b= "+(a+=b));
        System.out.println("a-=b= "+(a-=b));
        System.out.println("a*=b= "+(a*=b));
        System.out.println("a/=b= "+(a/=b));
        System.out.println("a%=b= "+(a%=b));
    
        
    }
    
 }