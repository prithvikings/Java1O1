public class diagonalSum {

    public static void diagonalSum(int matrix[][]){
        int sum=0;
        int n=matrix.length;
        int m=matrix[0].length;


        //primary diagonal i==j
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
            }
            // sum+=matrix[i][i]; //Another way to write the above code
        }

        //secondary diagonal i+j=n-1

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i+j==n-1){
                    sum+=matrix[i][j];
                }
            }
        }

        if(n%2!=0){
            sum-=matrix[n/2][n/2];
        }
        System.out.println("Sum of diagonals is "+sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } 
            };
        diagonalSum(matrix);
    }
}