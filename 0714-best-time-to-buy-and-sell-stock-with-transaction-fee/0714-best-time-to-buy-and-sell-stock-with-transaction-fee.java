class Solution {
    int dp[][];

    private int solve(int[] prices , int fee, int index, int bought)
    {
        if(index>=prices.length)
        {
            return 0;
        }

        if(dp[index][bought]>-1)
        {
            return dp[index][bought];
        }
        int profit=0;
        if(bought==1)
        {
            int sell = prices[index]+solve(prices,fee, index+1,0) - fee;
            int dont_sell =  solve(prices,fee,index+1,1);

            profit=Math.max(sell,Math.max(profit,dont_sell));
        }
        else
        {
            int buy = solve(prices,fee,index+1,1) - prices[index];
            int dont_buy = solve(prices,fee,index+1,0);

            profit=Math.max(buy,Math.max(profit,dont_buy));
        }

        return dp[index][bought]=profit;
    }
    public int maxProfit(int[] prices, int fee) {
        dp=new int[prices.length][2];
        for(int d[]:dp)
        {
            Arrays.fill(d,-1);
        }
        return solve(prices,fee,0,0);
    }
}