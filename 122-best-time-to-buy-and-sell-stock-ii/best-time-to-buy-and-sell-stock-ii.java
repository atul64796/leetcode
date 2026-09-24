class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 1; i < n; i++)
        {
          
        minPrice = prices[i-1];
            
        int Profit = prices[i] - minPrice;

        if(Profit > 0)
        {
            maxProfit += Profit;
        }

        }

        return maxProfit;
    }
}