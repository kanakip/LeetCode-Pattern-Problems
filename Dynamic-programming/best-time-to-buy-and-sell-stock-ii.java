// 122. Best Time to Buy and Sell Stock II
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=problem-list-v2&envId=dynamic-programming

class Solution {
    public int maxProfit(int[] prices) {

        int max_price=0;

        for(int i=0;i<prices.length-1; i++){
            if(prices[i]<prices[i+1]){
                max_price += prices[i+1] - prices[i];
            }
        }
        return max_price;
    }
}
