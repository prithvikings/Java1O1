public class palindrom{
    public static void check_palindrom(String s){
        s=s.toLowerCase();
        int n=s.length();
        int start=0;
        int end=n-1;
        if(s.charAt(start)!=s.charAt(end)){
            System.out.println("Not it is not a palindrom");
        }else{
            System.out.println("Yes it is a Palindrom");
        }
    }

    public static void main(String[] args) {
        String s="Noom";
        check_palindrom(s);
    }
}