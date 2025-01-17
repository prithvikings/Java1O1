public class primeInRange{
    public static Boolean isPrime(int a){
        if(a==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a=2;
        int b=10;
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}