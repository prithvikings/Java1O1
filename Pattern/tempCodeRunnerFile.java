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