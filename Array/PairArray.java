public class PairArray{
    public static void pair(int arr[]){
        int totalPairs=0;
        for(int i=0;i<arr.length;i++){ //{2,4,6,8,10}
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pair: "+totalPairs);
    }
    public static void main(String[] args){
        int[] arr={2,4,6,8,10};
        pair(arr);
    }
}