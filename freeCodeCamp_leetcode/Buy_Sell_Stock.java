class Buy_Sell_Stock{
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int price : prices){
            if(price > buyPrice){
                int profit = price - buyPrice;
                max_profit = Math.max(profit, max_profit);
            }else{
                buyPrice = price;
            }
        }
        return max_profit;
    }
    public static void main(String args[]){
        int[] prices = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println("Maximum Profit: "+ profit);
    }
}