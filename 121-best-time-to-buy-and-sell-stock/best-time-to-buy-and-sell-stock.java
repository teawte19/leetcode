class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit =0;
        int minprice = prices[0];
        for(int i=0; i<prices.length; i++){
            minprice = Math.min(prices[i], minprice);
            maxprofit = Math.max(maxprofit, prices[i]-minprice);
        }
        return maxprofit;
    }
}