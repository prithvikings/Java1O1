public class palindrom{
    public static void check_palindrom(String s){
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }

        int n=str.length();
        for(int start=0,end=n-1;start<end;start++,end--){
            if(str.charAt(start)!=str.charAt(end)){
                System.out.println("Not a palindrom");
                return;
            }
        }
        System.out.println("Palindrom");
    }

    public static void main(String[] args) {
        String s="Noo:n";
        check_palindrom(s);
    }
}