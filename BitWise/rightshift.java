// Shift the bits of the number to the right by 1
// Syntax: num >> n
// Here, num is the number to be shifted and n is the number of positions by which the bits are to be shifted.
// Example: 5>>1
// 5 = 101
// After shifting the bits to the right by one position, it becomes 10 = 2
// Example: 5>>2
// 5 = 101
// After shifting the bits to the right by two positions, it becomes 1 = 1
// Example: 5>>3
// 5 = 101
// After shifting the bits to the right by three positions, it becomes 0 = 0
public class rightshift{
    public static void main(String[] args) {
        int a = 5;
        int b = a>>1;
        System.out.println(b);
    }
}