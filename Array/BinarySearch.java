public class BinarySearch {

    public static void binary(int arr[], int key) {
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==key){
                System.out.println("Element found at index "+mid);
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        System.out.println("Element not found");
    }
        public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 18;
        binary(arr, key);
    }
}