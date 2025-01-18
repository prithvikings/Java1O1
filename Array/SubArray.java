public class SubArray{
    public static void subarr(int arr[]){
        int totalsub=0;
        for(int i=0;i<arr.length;i++){ //{2,4,6,8,10}
            int start=i;
            for(int j=i;j<arr.length;j++){ //start from next element
                int end=j;
                for(int k=start;k<=end;k++){ //print subarray
                    System.err.print(arr[k]+" ");
                }
                totalsub++;
                System.err.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray: "+totalsub);
    }

    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        subarr(arr);
    }
}

//Home Work find the max sum of subarray and min sum of subarray