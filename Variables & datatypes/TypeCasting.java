/*
TypeCasting is of two types:
1. Implicit Type Casting (Widening) - It is done automatically by the compiler.
Implicit type casting is also known as widening. In this type of casting, the compiler automatically converts the smaller data type into the larger compatible data type.

2. Explicit Type Casting (Narrowing) - It is done manually by the programmer.
Explicit type casting is also known as narrowing. In this type of casting, the programmer manually converts the larger data type into the smaller compatible data type.
*/

public class TypeCasting {
    public static void main(String[] args){
        //Implicit Type Casting
        int num1=10;
        double num2=num1;
        System.out.println(num1);
        System.out.println(num2);
        
        //Explicit Type Casting
        double num3=10.5;
        int num4=(int)num3;
        System.out.println(num3);
        System.out.println(num4);
    }
}