// 1's complement of a binary number is the number that can be obtained by changing all ones to zeros and all zeros to ones of a given binary number.
// For example, 1's complement of binary number 101 is 010.
// 1's complement is also known as the bitwise complement.
// The bitwise complement of a binary number is the number that can be obtained by changing all ones to zeros and all zeros to ones of a given binary number.
// For example, the bitwise complement of binary number 101 is 010.
// The bitwise complement of a binary number is equivalent to the 1's complement of the binary number.


public class binarypnescomp{
    public static void main(String[] args) {
        int a = 5;
        int b = ~a;
        System.out.println(b);
    }
}