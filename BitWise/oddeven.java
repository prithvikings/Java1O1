import java.util.*;
public class oddeven{

    public static void oddOrEven(int n){
        int bitmask=1;
        if((bitmask&n)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args){
        oddOrEven(3);
        oddOrEven(4);

    }
}