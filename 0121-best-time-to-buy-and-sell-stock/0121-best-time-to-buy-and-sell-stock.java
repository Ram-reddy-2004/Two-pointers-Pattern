class Solution {
    public int maxProfit(int[] prices) {
        int minV = prices[0];
        int maxProfit =0;
        for(int i=1;i<prices.length;i++){
            minV = Math.min(minV,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i] - minV);
        }
        return maxProfit;
    }
}