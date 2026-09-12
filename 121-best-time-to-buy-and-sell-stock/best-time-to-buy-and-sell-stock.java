class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        int minPrice = prices[0]; // 7
        int maxProfit = 0;

        for(int i = 0; i < n; i++)
        {
            if(prices[i] < minPrice) //  7 < 7; 1 < 7;  5 < 1; 3 < 1; 6 < 1; 4 < 1
            {
                minPrice = prices[i]; // 1
            }
            //this will run every time
            int Profit = prices[i] - minPrice; // 7 - 7 = 0; 1 - 1 = 0  5 - 1 = 4; 3 - 1 = 2; 6 - 1 = 5; 4 - 1 = 3
            maxProfit = Math.max(maxProfit,Profit); // 0 ,9, 4, 2,5,3
            
        }
        return maxProfit; 
    }
}