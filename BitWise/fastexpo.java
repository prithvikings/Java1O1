public class fastexpo {
    public static void main(String [] args){
        int a=2;
        int b=10;
        int result=1;
        while(b>0){
            if((b&1)==1){
                result=result*a;
            }
            a=a*a;
            b=b>>1;
        }
        System.out.println(result);
    }
    
}
