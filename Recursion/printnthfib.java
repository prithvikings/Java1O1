public class printnthfib {

    public static int fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            int fnm1=fib(n-1);
            int fnm2=fib(n-2);
            int fn=fnm1+fnm2;
            return fn;
        }
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}