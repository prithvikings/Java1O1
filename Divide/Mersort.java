
public class Mersort {
    //Time complexity of Merge Sort is O(nlogn) in all the cases (worst, average and best) as merge sort always divides the array into two halves and takes linear time to merge two halves.
    //Space complexity of Merge Sort is O(n) in all the cases because we are creating a temporary array in every call of mergeSort function.This temporary array is used to store the result of merge operation.
    // 1. If the array has 0 or 1 elements, it is already sorted.
    // 2. Find the middle index of the array.
    // 3. Recursively call Merge Sort on the left half.
    // 4. Recursively call Merge Sort on the right half.
    // 5. Merge the two sorted halves.
    //base case when start index is greater than end index or equal to end index then return 
    
    public static void printarr(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void mersort(int[] array, int start, int end) {
        //base case
        if(start>=end) return; 
        
        //Work
        int mid=start+(end-start)/2; //(s+e)/2
        mersort(array, start, mid); //left half
        mersort(array, mid+1, end); //right half
        merge(array, start, mid, end); //merge the two halves
    }
    
    public static void merge(int arr[], int start, int mid, int end){
        //left(0,3)=4 right(4,6)=3 -> 7 (6-0+1)(end-start+1)
        int temp[]=new int[end-start+1];
        int i=start; //start of left half
        int j=mid+1; //start of right half
        int k=0; //iterator for temp array

        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        //copy remaining elements of left half
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //copy remaining elements of right half
        while(j<=end){
            temp[k++]=arr[j++];
        }

        //copy temp array to original array
        for (int l = start; l <= end; l++) {
            arr[l]=temp[l-start];
        }
    }
    public static void main(String args[]){
        int[] array = {5, 2, 8, 3, 1, 6, 9, 7};
        mersort(array, 0 , array.length-1);
        printarr(array);
    }
}
