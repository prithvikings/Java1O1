public class buy_sell{

    public static void stock(int arr[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(buyPrice>arr[i]){
                buyPrice=arr[i];
            }else{
                profit=arr[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
                System.out.println("Buy Price: "+buyPrice+" Sell Price: "+arr[i]+" Profit: "+profit);
            }
        }
        System.out.println("The Maximum Profit You have maded: "+maxProfit);
    }

    
    public static void main(String[] args) {
        int[] prices = {7,1,2,3,6,4};
        stock(prices);
    }
}