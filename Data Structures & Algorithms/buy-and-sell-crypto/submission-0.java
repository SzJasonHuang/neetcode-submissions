class Solution {
    public int maxProfit(int[] prices) {
        int min = 100000;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            int profit = (prices[i] - min) > 0? prices[i] - min : 0;
            if(profit > 0){
                maxProfit = Math.max(maxProfit, profit);
            }
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
        
    }
}
