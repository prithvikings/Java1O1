
public class Practice {
    public static void avg(int n, int m, int k) {
        int sum = n + m + k;
        int average = sum / 3;
        System.out.println("Average value is : " + average);
    }

    public static boolean iseven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void ispalindrome(int n) {
        int ld;
        int rev = 0;
        int temp = n;
        while (n != 0) {
            ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        System.out.println("Reverse Number value is : " + rev);
        if (temp == rev) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is Not palindrome");
        }
    }

    public static void sum(int n) {
        int sum = 0;
        int ld;
        while (n != 0) {
            ld = n % 10;
            sum += ld;
            n = n / 10;
        }
        System.out.println("Sum of digits is : " + sum);
    }

    public static void main(String[] args) {
        // avg(10,3,5);
        // System.out.println(iseven(5));
        // ispalindrome(321);
        // sum(321);
        System.out.println(Math.min(6, 8));
        System.out.println(Math.max(9, 15));
        System.out.println((int) Math.sqrt(9));
        System.out.println((int)Math.pow(2, 3));
    }
}
