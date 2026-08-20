class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for (int i=1; i<prices.length; i++) {
            int sell = prices[i] - buy;

            profit = Math.max(profit, sell);

            if (buy > prices[i]){
                buy = prices[i];
            }
        }
        return profit;
    }
}