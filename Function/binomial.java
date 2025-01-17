//for binomial coeeficient nCr
//nCr = n!/(r!*(n-r)!)
public class binomial{
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int ncr=factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println("Binomial coefficient of "+n+" and "+r+" is "+ncr);
    }
}