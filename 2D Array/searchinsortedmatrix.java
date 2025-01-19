public class searchinsortedmatrix{

    public static void search(int arr[][],int x){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==x){
                System.out.println("Element found at (" +row+","+col+ ")");
                return;
            }else if(arr[row][col]>x){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        search(matrix, 29);
    }
}