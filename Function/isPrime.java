public class isPrime{
    public static Boolean isPrime(int a){
        if(a==2){
            return true;
        }

        // for(int i=2;i<=a-1;i++){
        //     if(a%i==0){
        //         return false;
        //     }
        // }


        //More optimise way writing this loop
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        if(isPrime(7)){
            System.out.println("it is Prime number");
        }
        else{
            System.out.println("it is Not Prime number");
        }
    }

}