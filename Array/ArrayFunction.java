//Array Function work as a reference to the array. It can change the value of the array.

// public class ArrayFunction{
//     public static void updatearr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             arr[i]=arr[i]+10;
//         }
//     }
//     public static void  main(String[]args){
//         int mark[]={19,10,8,17,9,15,24,12};
//         System.out.println("Printing the marks : ");
//         for(int i=0;i<mark.length;i++){
//             System.out.print(mark[i]+" ");
//         }
//         updatearr(mark);
//         System.out.println();
//         System.out.println("Printing the marks after updating it: ");
//         for(int i=0;i<mark.length;i++){
//             System.out.print(mark[i]+" ");
//         }
//     }
// }

public class ArrayFunction{
    public static void updateArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+10;
        }
    }
    public static void main(String arg[]){
        int arr[]={1,2,3,4,5};
        System.out.println("Before update the array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        updateArray(arr);
        System.out.println("After update the array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}