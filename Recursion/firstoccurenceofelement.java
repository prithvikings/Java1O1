
public class firstoccurenceofelement {
    public static int firstoccur(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return firstoccur(arr, key, i + 1);
    }

    public static int lastoccur(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastoccur(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 4, 3, 4, 2, 3, 4, 3, 4 };

        System.out.println(firstoccur(arr, 3, 0));
        System.out.println(lastoccur(arr, 3, 0));
    }
}
