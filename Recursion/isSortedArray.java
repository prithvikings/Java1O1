public class isSortedArray {
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true; // base case: if we reach the end of the array, it is sorted
        }

        if(arr[i]>arr[i+1]){
            return false; // if the current element is greater than the next element, it is not sorted
        }

        return isSorted(arr, i+1); // recursive case: check the next element
    }
    public static void main(String args[]){
        int arr[]={1,15,3,4,5};
        if(isSorted(arr,0)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
