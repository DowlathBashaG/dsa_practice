package dowlath.io.dsa.leetcode;

public class MaxProfitBuynSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("The Maximum Profit .... : "+ maxProfit(prices));

    }
    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for( int i= 0; i<prices.length-1;i++){
            if(prices[i+1] > prices[i]){
                maxProfit +=(prices[i+1] - prices[i]);
            }
        }
        return maxProfit;
    }

}
