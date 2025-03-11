public class QuickSort {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // it has a time complexity of O(nlogn) and space complexity of O(1) but in
    // worst time complexity is O(n^2) it always comes when pivot is the smallest or largest element in the array
    // In problem where we need to sort the array in place, quick sort is the best
    // option cause it has o(nlogn) TC and o(1) space.

    // it work in pivot and partition method
    // 1. Choose a pivot element from the array.
    // 2. Partition the array around the pivot.
    // 3. Recursively sort the sub-arrays on either side of the pivot.

    // base case when start index is greater than end index or equal to end index
    // then return

    // we will choose pivot as last element of the array

    public static void quick(int[] arr, int start, int end) {
        // base case
        if (start >= end)
            return;

        // work
        int pivot = partition(arr, start, end);
        quick(arr, start, pivot - 1); // left half
        quick(arr, pivot + 1, end); // right half
    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1; // index of smaller element
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 7, 6, 8 };
        quick(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
