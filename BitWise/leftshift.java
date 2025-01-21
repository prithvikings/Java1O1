//Binary left shift operator
//The left shift operator shifts the bits of the number to the left and fills 0 on voids left as a result.
//Syntax: num << n
//Here, num is the number to be shifted and n is the number of positions by which the bits are to be shifted.
//Example: 5<<1
//5 = 101
//After shifting the bits to the left by one position, it becomes 1010 = 10
//Example: 5<<2
//5 = 101
//After shifting the bits to the left by two positions, it becomes 10100 = 20
//Example: 5<<3
//5 = 101
//After shifting the bits to the left by three positions, it becomes 101000 = 40

public class leftshift{
    public static void main(String[] args) {
        System.out.println((5<<2));
    }
}