public class palindrom{
    public static void check_palindrom(String s){
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }

        int n=str.length();
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("Not a palindrom");
                return;
            }
        }
        System.out.println("Palindrom");
    }

    public static void main(String[] args) {
        String s="Noon";
        check_palindrom(s);
    }
}