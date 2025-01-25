//check if array is sorted or not
public class checkifarraysorted{
    
    public static boolean issorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,20,3,4,5};
        if(issorted(arr,0)){
            System.out.println("Yes it is Sorted Array");
        }else{
            System.out.println("No it is not Sorted Array");
        }
    }
}