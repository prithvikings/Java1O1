// public class binarytodecimal{
//     public static int bin(int a){
//         int pow=0;
//         int ld;
//         int dec=0;
//         while(a>0){
//             ld=a%10;
//             dec=dec+ld*(int)Math.pow(2,pow);
//             pow++;
//             a=a/10;
//         }
//         return dec;
//     }
//     public static void main(String[] args) {
//         int res=bin(101);
//         System.out.println("The decimal of "+101+" is "+res);
//     }
// }




public class binarytodecimal{
    public static int dec(int a){
        int pow=0;
        int rem;
        int bin=0;
        while(a>0){
            rem=a%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            pow++;
            a=a/2;
        }
        return bin;
    }
    public static void main(String[] args) {
        int res=dec(5);
        System.out.println("The binary of "+5+" is "+res);
    }
}