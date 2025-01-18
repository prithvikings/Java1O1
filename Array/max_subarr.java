import java.util.*;

public class max_subarr {
    public static void subarr(int arr[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int totalsub = 0;
        for (int i = 0; i < arr.length; i++) { // {2,4,6,8,10}
            int start = i;
            for (int j = i; j < arr.length; j++) { // start from next element
                int end = j;
                current_sum = 0;

                for (int k = start; k <= end; k++) { // print subarray
                    System.out.print(arr[k] + " ");
                    current_sum += arr[k];
                }
                System.out.println("Current Sum: " + current_sum);
                System.out.println();
                if (current_sum > max_sum) {
                    max_sum = current_sum;
                }
                totalsub++;
            }
            System.out.println();
        }

        System.out.println("Total SubArray: " + totalsub);
        System.out.println("Max Sum of SubArray: " + max_sum);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subarr(arr);
    }
}