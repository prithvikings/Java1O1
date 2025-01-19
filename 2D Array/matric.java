import java.util.*;
public class matric{

    public static void search(int arr[][],int x){
        int n=arr.length; //no. of rows
        int m=arr[0].length; //no. of columns
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==x){
                    System.out.println("Element found at "+i+" "+j);
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }


    public static void largest(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Largest element is "+max);
    }


    public static void smallest(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Smallest element is "+min);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        int n=arr.length; //no. of rows
        int m=arr[0].length; //no. of columns
        
        //taking input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //printing the matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //searching for an element
        System.out.println("Enter the element to be searched");
        int x=sc.nextInt();
        search(arr,x);

        //finding largest element in the matrix
        largest(arr);

        //finding the smallest element in the matrix
        smallest(arr);
    }
}
