public class palindrom{

    public static void check_palindrom(String s){
        int n=s.length();
        for(int start=0,end=n-1;start<=end;start++,end--){
            if(s.charAt(start)!=s.charAt(end)){
                System.out.println("Not it is not a palindrom");
                return;
            }
        }
        System.out.println("Yes it is a Palindrom");
    }
    public static void main(String[] args){
     String s="racpar";
     check_palindrom(s);   
    }
}