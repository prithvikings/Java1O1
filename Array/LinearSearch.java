import java.util.*;
public class LinearSearch{
    public static void linear(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
    public static void largest_number(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The largest number in the array is: "+max);
    }
    public static void smallest_number(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The smallest number in the array is: "+min);
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,88,10,12,14,16};
        linear(arr, 10);
        largest_number(arr);
        smallest_number(arr);
    }
}