public class numberpower {
    public static void main(String [] args){
        int n=4;
        if((n&(n-1))==0){
            System.out.println("Number is a power of 2");
        }
        else{
            System.out.println("Number is not a power of 2");
        }
    }
}
