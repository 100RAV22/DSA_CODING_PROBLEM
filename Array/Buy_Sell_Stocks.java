package Array;

public class Buy_Sell_Stocks {
    public static int maxProfit(int[] prices){
        int max = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                max = Math.max(max, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return max;

    }
    public static void main(String args[]){
        int[] prices = {7, 1, 5, 3, 6, 4};
        int max = maxProfit(prices);
        System.out.println("max profit in sell and buy stocks : "+ max);
    }
}
