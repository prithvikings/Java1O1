//qs-1 given array if nums value appear twice in the array return true else return false;
//qs-2 their is an sorted array you have to find the target

public class Practice {

    public static void checkpos(){
        int arr[]={1,2,3,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
    
    public static void target(){
        int nums[]={0,1,2,3,4,5};
        int n=nums.length;
        int target=4;
        int start=0;
        int end=n-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(nums[mid]==target){
                System.out.println("The index value is : "+mid);
                return;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
    }
    public static void main(String[] args) {
        // checkpos();
        target();
    }
}
