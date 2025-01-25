public class nto1{
public static void dec(int n){
    if(n==1){
        System.out.println(1);
        return;
    }
    System.out.println(n);
    dec(n-1);
}

public static void inc(int n){
    if(n==0){
        return;
    }
    inc(n-1);
    System.out.println(n);
}
    public static void main(String[] args) {
        int n=10;
        // dec(n);
        inc(n);
    }
}