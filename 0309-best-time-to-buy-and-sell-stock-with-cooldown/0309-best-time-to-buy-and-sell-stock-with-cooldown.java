class Solution {
    int[][] dp;
    private int solve(int[] prices,int day,int sold)
    {
        if(day>=prices.length)
        {
            return 0;
        }
        int profit=0;
        if(dp[day][sold]>-1)
        {
            return dp[day][sold];
        }
        if(sold==1)
        {
            int buy=solve(prices,day+1,0)-prices[day];
            int dont_buy=solve(prices,day+1,1);

            profit=Math.max(buy,Math.max(profit,dont_buy));

        }
        else
        {
            int sell=prices[day]+solve(prices,day+2,1);
            int dont_sell=solve(prices,day+1,0);

            profit=Math.max(sell,Math.max(profit,dont_sell));
        }

        return dp[day][sold]=profit;
        
    }
    public int maxProfit(int[] prices) {
        dp=new int[prices.length+1][2];
        for(int d[]:dp)
        {
            Arrays.fill(d,-1);
        }
        int day=0;
        
        int sold=1;
        return solve(prices,day,sold);

    }
}