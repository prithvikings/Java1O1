// Binary OR operator
// The bitwise OR operator (|) compares each bit of the first operand to the corresponding bit of the second operand. If either bit is 1, the resulting bit is set to 1. Otherwise, the resulting bit is set to 0.
// Rule of binary OR operation
// 0 | 0 = 0
// 0 | 1 = 1
// 1 | 0 = 1
// 1 | 1 = 1
// Example: 5 | 3
// 5 = 101
// 3 = 011
// 5 | 3 = 111 = 7

public class BinaryOr{
    public static void main(String[] args) {
        System.out.println(5|3);
    }
}