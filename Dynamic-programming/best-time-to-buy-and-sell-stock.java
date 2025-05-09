
// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=problem-list-v2&envId=dynamic-programming

class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int buy_price = prices[0];

        for(int i=0;i<prices.length;i++){
            int current_profit = prices[i] - buy_price;
            if(current_profit>max_profit){
                max_profit = current_profit;
            }
            
            if(prices[i]<buy_price){
                buy_price = prices[i];
            }
        }
        return max_profit;
    }
}
