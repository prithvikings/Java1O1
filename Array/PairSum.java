public class PairSum {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int sum=10;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("Pair found at index "+i+" and "+j);
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }
}
