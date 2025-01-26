public class ReverseArray{

    public static void reverse(int arr[]){
       
        //using while loop
        // int start=0;
        // int end=arr.length-1;
        // while(start<end){
        //     int temp=arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;
        // }

        //using for loop
        for(int start=0,end=arr.length-1;start<end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }

        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}