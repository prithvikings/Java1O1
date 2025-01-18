public class Pattern {
    public static void hollow(int toRows, int toCols) {
        // outer loop
        for (int i = 1; i <= toRows; i++) {
            // inner loop
            for (int j = 1; j <= toCols; j++) {
                if (i == 1 || i == toRows || j == 1 || j == toCols) {
                    // boundary cells
                    System.out.print('*');
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

    public static void invertedpyramid(int toRows) {
        for (int i = 1; i <= toRows; i++) {
            for (int j = 1; j <= toRows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void invertedhalfpyramidwithnumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void zeroone(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int l=1;l<=2*(n-i);l++){
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void solid_rohmbus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=n;k++){
                System.out.print(" * ");
            }
            for(int l=1;l<=i-1;l++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void hollow_rohmbus(int n){

        //outer loop
        for(int i=1;i<=n;i++){
            //first half space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //star using the same logic as hollow square
            for(int k=1;k<=n;k++){
                if(k==1||k==n||i==1||i==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollow(4, 5);
        // invertedpyramid(4);
        // invertedhalfpyramidwithnumber(4);
        // floydTriangle(5);
        // zeroone(4);
        // butterfly(5);
        // solid_rohmbus(5);
        // hollow_rohmbus(5);
        diamond(4);

    }
}