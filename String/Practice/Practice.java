//qs1-count how many times does lowercase vowels occured in a string entered by the user
import java.util.*;
public class Practice {

    public static void checklower(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int count=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("Number of lowercase vowels in the string is "+count);
    }

    public static void checkoutput(){
        String str="PrithivRaj";
        String str1="Facebook";
        String str2="PrithivRaj";
        String s3="anagrams";
        System.out.println(str.equals(str1)+" "+str.equals(str2));
        System.out.println(s3.replace("a", " "));
    }
    public static void main(String[] args) {
        checkoutput();
        checklower();
    }
}
