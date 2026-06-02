class Solution {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0; 
        int bestBuy =prices[0];
        for(int i = 1 ;i<prices.length;i++){
            if(prices[i]>bestBuy){
                maxProfit = Integer.max(maxProfit, prices[i]-bestBuy);
            }
            bestBuy = Integer.min(bestBuy, prices[i]);
        }
        
        return maxProfit;
    }
}