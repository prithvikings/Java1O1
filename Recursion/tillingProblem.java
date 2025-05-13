public class tillingProblem {
    public static int tillingways(int n){
        if(n==0 || n==1){ // base case for 2*1 tile
            // 2*1 tile can be placed in 1 way: only vertically
            return 1;
        }
        if(n==2){ // base case for 2*1 tile
            // 2*1 tile can be placed in 2 ways: either vertically or horizontally
            return 2;
        }
        int vertical = tillingways(n-1); // vertical placement of 2*1 tile
        int horizontal = tillingways(n-2); // horizontal placement of 2*1 tile
        return vertical + horizontal; // total ways = vertical + horizontal
    }
    public static void main(String[] args) {
        System.out.println("Total Number of ways: "+tillingways(3));
    }
    
}
